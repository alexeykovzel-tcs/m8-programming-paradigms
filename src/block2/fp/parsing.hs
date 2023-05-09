import Data.List
import Data.Maybe
import Data.Char 
import Debug.Trace

data BinTree a b 
    = Leaf b 
    | Node a (BinTree a b) (BinTree a b)
    deriving (Show, Eq)

data Token 
    = Add
    | Mult
    | Open
    | Close
    | Num Int
    | Id String
    deriving (Show, Eq)


-- Tokenizing string value

tokenize :: String -> [Token]
tokenize (' ':xs) = tokenize xs
tokenize ('\t':xs) = tokenize xs
tokenize ('(':xs) = Open : tokenize xs
tokenize (')':xs) = Close : tokenize xs
tokenize ('+':xs) = Add : tokenize xs
tokenize ('*':xs) = Mult : tokenize xs
tokenize [] = []
tokenize val@(x:xs)
    | isDigit x = (Num (read num)) : tokenize afterNum
    | isLetter x = (Id str) : tokenize afterStr
    | otherwise = error $ "expected a digit or letter: " ++ [x]
    where 
        (num, afterNum) = break (not . isDigit) val
        (str, afterStr) = break (not . isAlphaNum) val


-- Building parsing tree

parse :: String -> BinTree Token Token
parse xs = parseExpr $ tokenize xs

parseExpr :: [Token] -> BinTree Token Token
parseExpr xs
    | length after == 0 = term
    | head after == Add = Node Add term (parseExpr $ tail after)
    where (term, after) = parseTerm xs

parseTerm :: [Token] -> (BinTree Token Token, [Token])
parseTerm xs
    | length afterFactor == 0 = (factor, [])
    | head afterFactor /= Mult = (factor, afterFactor)
    | otherwise = (Node Mult factor term, afterTerm) 
    where 
        (factor, afterFactor) = parseFactor xs
        (term, afterTerm) = parseTerm $ tail afterFactor

parseFactor :: [Token] -> (BinTree Token Token, [Token])
parseFactor ((Num x):xs) = (Leaf (Num x), xs)
parseFactor ((Id x):xs) = (Leaf (Id x), xs)
parseFactor (Open:xs) = (parseExpr expr, tail after)
    where (expr, after) = break (==Close) xs


-- Evaluating string value

eval :: String -> Int
eval xs = evalTree $ parse xs

evalTree :: BinTree Token Token -> Int
evalTree (Leaf (Num x)) = x
evalTree (Node op x y)
    | op == Mult = (evalTree x) * (evalTree y)
    | op == Add = (evalTree x) + (evalTree y)
    | otherwise = error $ "Invalid operator: " ++ show op
