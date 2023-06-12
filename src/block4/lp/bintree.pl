init(Num, Num, 0).
init(Tree, Num, Depth) :-
    Depth > 0,
    D is Depth - 1,
    init(Branch, Num, D),
    Tree = tree(Num, Branch, Branch).

sum(Num, Num) :- number(Num).
sum(Tree, Sum) :- 
    Tree = tree(Num, Left, Right),
    sum(Left, A),
    sum(Right, B),
    Sum is Num + A + B.