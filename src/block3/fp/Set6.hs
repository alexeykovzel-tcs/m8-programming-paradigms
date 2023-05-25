module Set6 where

import Data.Foldable
import Test.QuickCheck
import Data.Monoid
import Text.Read
import Data.Char
import Set5


-- Exercise 7

addstr :: String -> String -> Maybe String
addstr s1 s2 = show <$> result
    where 
        x = readMaybe s1 :: Maybe Int
        y = readMaybe s2 :: Maybe Int
        result = (+) <$> x <*> y


-- Exercise 8

data MyList a = Nil | Cons a (MyList a)
              deriving (Show, Eq)

mylst  = Cons 1   $ Cons 2   $ Cons 3   $ Nil
mylst2 = Cons 10  $ Cons 20  $ Cons 30  $ Nil
mylst3 = Cons 100 $ Cons 200 $ Cons 300 $ Nil

instance Functor MyList where
    fmap f Nil = Nil
    fmap f (Cons x xs) = Cons (f x) (fmap f xs)

instance Applicative MyList where
    pure x = Cons x Nil
    Nil <*> _ = Nil
    (Cons f xs) <*> (Cons y ys) = Cons (f y) (xs <*> ys) 

myzipWith :: (a -> b -> c) -> MyList a -> MyList b -> MyList c
myzipWith f xs ys = f <$> xs <*> ys

myzipWith3 :: (a -> b -> c -> d) -> MyList a -> MyList b -> MyList c -> MyList d
myzipWith3 f xs ys zs = f <$> xs <*> ys <*> zs


-- Exercise 9

f :: IO Integer
f = (+) <$> x <*> y 
    where
        x = read <$> getLine :: IO Integer
        y = read <$> getLine :: IO Integer


-- Exercise 10

justs :: [Maybe a] -> Maybe [a]
justs [] = Just []
justs (x:xs) = (:) <$> x <*> justs xs


-- Exercise 11

data Parser r = P {
    runParser :: String -> [(r , String)]
}

char :: Char -> Parser Char
char c = P p
    where
        p [] = []
        p (x: xs) 
            | c == x = [(x , xs )]
            | otherwise = []

parseOne :: Parser Char
parseOne = char '1'

test_parseOne = runParser parseOne "123" == [('1', "23")] 
test_parseOne_2 = runParser parseOne "321" == []

instance Functor Parser where
    fmap f p = P (\xs -> [(f x, xs) | (x, xs) <- runParser p xs])

parseOneInt :: Parser Int
parseOneInt = (\a -> read [a] :: Int) <$> parseOne

test_parseOneInt = runParser parseOneInt "123" == [(1, "23")] 
test_parseOneInt_2 = runParser parseOneInt "321" == []

instance Applicative Parser where
    pure a = P (\xs -> [])
    p1 <*> p2 = P (\xs -> [(y z, zs)
                    | (y, ys) <- runParser p1 xs,
                      (z, zs) <- runParser p2 ys])

parseAB :: Parser (Char, Char)
parseAB = (,) <$> (char 'a') <*> (char 'b')

parseString :: String -> Parser String
parseString [] = P (\ys -> [([], ys)]) 
parseString (x:xs) = (:) <$> char x <*> parseString xs


-- Exercise 12

fibonacci :: IO (Integer -> Integer)
fibonacci = eval <$> readFile "fib.txt"

fib5 :: IO Integer
fib5 = fibonacci <*> pure 5

fibs :: IO [Integer]
fibs = (map <$> fibonacci ) <*> pure [0..]

-- Exercise 13

data A 
    = R [Int]
    | Q Int Char deriving Show

instance Arbitrary A where
    