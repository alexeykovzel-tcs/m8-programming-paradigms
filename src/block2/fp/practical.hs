import FPPrac.Trees
import Test.QuickCheck
import Data.Maybe
import Data.List

-- Exercise 1

data Tree_a = 
    Node_a Int Tree_a Tree_a | Leaf_a Int 
    deriving (Show, Eq)

data Tree_b = 
    Node_b (Int, Int) Tree_b Tree_b | Leaf_b (Int, Int) 
    deriving (Show, Eq)

data Tree_c = 
    Node_c Tree_c Tree_c | Leaf_c Int 
    deriving (Show, Eq)

data Tree_d = 
    Node_d Tree_d Tree_d | Leaf_d (Int, Int) 
    deriving (Show, Eq)

pp_a :: Tree_a -> RoseTree
pp_a (Leaf_a x) = RoseNode (show x) []
pp_a (Node_a x left right) = RoseNode (show x) [pp_a left, pp_a right]

pp_b :: Tree_b -> RoseTree
pp_b (Leaf_b x) = RoseNode (show x) []
pp_b (Node_b x left right) = RoseNode (show x) [pp_b left, pp_b right]

pp_c :: Tree_c -> RoseTree
pp_c (Leaf_c x) = RoseNode (show x) []
pp_c (Node_c left right) = RoseNode "" [pp_c left, pp_c right]

pp_d :: Tree_d -> RoseTree
pp_d (Leaf_d x) = RoseNode (show x) []
pp_d (Node_d left right) = RoseNode "" [pp_d left, pp_d right]

class PP a where
    pp :: a -> RoseTree

instance PP Tree_a where
    pp = pp_a

instance PP Tree_b where
    pp = pp_b

instance PP Tree_c where
    pp = pp_c

instance PP Tree_d where
    pp = pp_d


-- Exercise 2

treeAdd :: Int -> Tree_a -> Tree_a
treeAdd y (Leaf_a x) = Leaf_a (x + y)
treeAdd y (Node_a x left right) = Node_a (x + y) (treeAdd x left) (treeAdd x right)

treeSquare :: Tree_a -> Tree_a
treeSquare (Leaf_a x) = Leaf_a (x*x)
treeSquare (Node_a x left right) = Node_a (x*x) (treeSquare left) (treeSquare right)

mapTree :: (Int -> Int) -> Tree_a -> Tree_a
mapTree f (Leaf_a x) = Leaf_a (f x)
maptree f (Node_a x left right) = Node_a (f x) (mapTree f left) (mapTree f right)

addNode :: Tree_b -> Tree_a
addNode (Leaf_b (a, b)) = Leaf_a (a + b)
addNode (Node_b (a, b) left right) = Node_a (a + b) (addNode left) (addNode right)

mapTree_b :: ((Int, Int) -> Int) -> Tree_b -> Tree_a
mapTree_b f (Leaf_b x) = Leaf_a (f x)
mapTree_b f (Node_b x left right) = Node_a (f x) (mapTree_b f left) (mapTree_b f right)


-- Exercise 3

binMirror_a :: Tree_a -> Tree_a
binMirror_a (Leaf_a x) = Leaf_a x
binMirror_a (Node_a x left right) = Node_a x (binMirror_a right) (binMirror_a left)

class BinMirror tree where
    binMirror :: tree -> tree

instance BinMirror Tree_a where
    binMirror = binMirror_a

instance BinMirror Tree_b where
    binMirror (Leaf_b x) = Leaf_b x
    binMirror (Node_b x left right) = Node_b x (binMirror right) (binMirror left)


-- Exercise 4

data TreeInt = NodeInt Int TreeInt TreeInt | LeafInt deriving (Eq, Show)

-- NodeInt 2 (NodeInt 3 LeafInt LeafInt) (NodeInt 5 LeafInt LeafInt)

insertTree :: Int -> TreeInt -> TreeInt
insertTree y LeafInt = NodeInt y LeafInt LeafInt 
insertTree y (NodeInt x left right)
    | y < x = NodeInt x (insertTree y left) right
    | otherwise = NodeInt x left (insertTree y right)

makeTree :: [Int] -> TreeInt
makeTree [] = LeafInt
makeTree (x:xs) = insertTree x $ makeTree xs

makeTree_2 :: [Int] -> TreeInt
makeTree_2 [] = LeafInt
makeTree_2 xs = foldr (\x tree -> insertTree x tree) LeafInt xs

prop_makeTree :: [Int] -> Bool
prop_makeTree xs = makeTree xs == makeTree_2 xs

makeList :: TreeInt -> [Int]
makeList LeafInt = []
makeList (NodeInt x left right) = (makeList left) ++ [x] ++ (makeList right)

sortList :: [Int] -> [Int]
sortList xs = makeList $ makeTree xs

prop_sortList :: [Int] -> Bool
prop_sortList xs = sortList xs == sort xs

sortTree :: TreeInt -> TreeInt
sortTree tree = makeTree $ sortList $ makeList tree


-- Exercise 5

subTreeAt :: Int -> TreeInt -> Maybe TreeInt
subTreeAt y LeafInt = Nothing
subTreeAt y subtree@(NodeInt x left right)
    | y > x = subTreeAt y right
    | y < x = subTreeAt y left
    | otherwise = Just subtree

cutOffAt :: Int -> Tree_a -> Tree_a
cutOffAt _ (Leaf_a x) = Leaf_a x 
cutOffAt y (Node_a x left right)
    | y > 0 = Node_a x (cutOffAt (y-1) left) (cutOffAt (y-1) right)
    | otherwise = Leaf_a x

data BinTree a = 
    Leaf | Node a (BinTree a) (BinTree a)
    deriving (Show, Eq)

instance (Show a, PP a) => PP (BinTree a) where
    pp Leaf = RoseNode "" []
    pp (Node x left right) = RoseNode (show x) [pp left, pp right]

instance BinMirror a => BinMirror (BinTree a) where
    binMirror Leaf = Leaf
    binMirror (Node x left right) = Node x (binMirror right) (binMirror left)

instance Functor BinTree where
    fmap f Leaf = Leaf
    fmap f (Node x left right) = Node (f x) (fmap f left) (fmap f right)


-- Exercise 8

data MyList a = 
    Nil | Cons a (MyList a)
    deriving (Show, Eq)

mylst = Cons 1 $ Cons 2 $ Cons 3 $ Nil

instance Functor MyList where
    fmap f Nil = Nil
    fmap f (Cons x xs) = Cons (f x) (fmap f xs)

fromList :: [a] -> MyList a
fromList [] = Nil
fromList (x:xs) = Cons x (fromList xs)

instance Arbitrary a => Arbitrary (MyList a) where
    arbitrary = sized list
        where
            list 0 = return Nil
            list n = do
                x <- arbitrary
                xs <- list (n-1)
                return (Cons x xs) 

prop_law1 :: Eq a => MyList a -> Bool
prop_law1 xs = fmap id xs == xs

prop_law2 :: Eq a => Fun a a -> Fun a a -> MyList a -> Bool
prop_law2 (Fn f) (Fn q) xs = fmap (f . q) xs == fmap f (fmap q xs)


-- Exercise 9

data Person = Person { 
    name :: String, 
    age :: Int, 
    sex :: String, 
    residence :: String 
} deriving (Show)

person1 = Person "Alice" 20 "F" "New York"
person2 = Person "Bob" 30 "M" "Chicago"
person3 = Person "Charlie" 40 "M" "San Francisco"

persons = [person1, person2, person3]

plus :: Int -> [Person] -> [Person]
plus ageDelta persons = 
    [ person { age = age person + ageDelta } 
    | person <- persons ]

all_names :: [String]
all_names = [ name person | person <- persons ]


-- Exercise 10

getInt :: IO Integer
getInt = do
    line <- getLine
    return (read line)