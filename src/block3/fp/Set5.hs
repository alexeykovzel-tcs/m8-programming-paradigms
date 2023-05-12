module Set5 where

import Data.List
import Data.Functor
import Data.Either
import Test.QuickCheck

import Text.ParserCombinators.Parsec
import Text.ParserCombinators.Parsec.Language
import qualified Text.ParserCombinators.Parsec.Token as Token

fromLeft' :: Either l r -> l
fromLeft' (Left x) = x -- Newer GHC versions contain a fromLeft :: l -> Either l r -> l

fromRight' :: Either l r -> r
fromRight' (Right x) = x -- Newer GHC versions contain a fromRight :: r -> Either l r -> r

parser :: Parser a -> String -> a
parser p xs | isLeft res = error $ show $ fromLeft' res
            | otherwise  = fromRight' res
  where res = parse p "" xs


data Expr 
    = Const Integer
    | Var String
    | Mult Expr Expr
    | Add Expr Expr
    | If Cond Expr Expr
    | FunCall String Expr
    | Dec Expr 
    deriving Show


-- Exercise 2

languageDef = emptyDef {
    Token.reservedOpNames = ["+", "*"]
}

lexer = Token.makeTokenParser languageDef

identifier = Token.identifier lexer
parens = Token.parens lexer
reserved = Token.reserved lexer
symbol = Token.symbol lexer
num = Token.integer lexer


-- Exercise 3

parseExpr :: Parser Expr
parseExpr = 
    parseDec 
    <|> parseIf
    <|> ((\a b -> foldl Add a b) 
        <$> parseTerm 
        <*> (many $ symbol "+" *> parseTerm))
    <?> "expression"

parseFactor :: Parser Expr
parseFactor = 
    (Const <$> num) 
    <|> (parens parseExpr)
    <|> try(FunCall 
            <$> identifier 
            <*> (parens parseExpr)) 
    <|> (Var <$> identifier) 
    <?> "id or number"

parseTerm :: Parser Expr
parseTerm = 
    (\a b -> foldl Mult a b) 
    <$> parseFactor <*> (many $ symbol "*" *> parseFactor)
    <?> "term (e.g. 2*3*5)"


-- Exercise 4

data Cond 
    = Eq Expr Expr
    deriving Show

parseCond :: Parser Cond
parseCond = Eq 
    <$> parseExpr <*> (string "==" *> parseExpr)
    <?> "condition"

parseDec :: Parser Expr
parseDec = Dec 
    <$> (symbol "dec" *> parseExpr)
    <?> "dec (wtf is it)"

parseIf :: Parser Expr
parseIf = If 
    <$> (symbol "if" *> parseCond) 
        <*> (symbol "then" *> parseExpr) 
        <*> (symbol "else" *> parseExpr)


-- Exercise 5

data FunDef 
    = Function String String Expr
    deriving Show

parseFun :: Parser FunDef
parseFun = Function 
    <$> (symbol "function" *> identifier)
        <*> identifier
        <*> (symbol "=" *> parseExpr)

fib :: FunDef
fib = parser parseFun
 "function fib x = if x == 0 then 1 else (if x == 1 then 1 else fib(dec x)+fib(dec dec x))"


-- Exercise 6

data Context = Context {
    main :: FunDef,
    var :: Integer
}

evalCond :: Context -> Cond -> Bool
evalCond ctx (Eq x y) = (eval ctx x) == (eval ctx y)

eval :: Context -> Expr -> Integer
eval ctx (Const x)      = x
eval ctx (Var x)        = var ctx
eval ctx (Mult x y)     = (eval ctx x) * (eval ctx y)
eval ctx (Add x y)      = (eval ctx x) + (eval ctx y)
eval ctx (Dec x)        = (eval ctx x) - 1
eval ctx (FunCall _ x)  = evalFun (main ctx) (eval ctx x)
eval ctx (If cond x y)  = if (evalCond ctx cond) 
                            then (eval ctx x) 
                            else (eval ctx y)

evalFun :: FunDef -> Integer -> Integer
evalFun main@(Function _ _ expr) var = 
    eval (Context main var) expr