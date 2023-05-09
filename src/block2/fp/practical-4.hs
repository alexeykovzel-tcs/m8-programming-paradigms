
data BinTree a b =
    Leaf b | Node a BinTree BinTree
    deriving (Show, Eq)

