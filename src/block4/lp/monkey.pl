goal(state(_, _, _, yes)).

init(state(atDoor, onFloor, atWindow, no)).

move(grasp,
    state(inMiddle, onBox, inMiddle, _), 
    state(inMiddle, onBox, inMiddle, yes)).

move(climb,
    state(Loc, onFloor, Loc, Has), 
    state(Loc, onBox, Loc, Has)).

move(push,
    state(Loc1, onFloor, Loc1, Has),
    state(Loc2, onFloor, Loc2, Has)).

move(walk,
    state(_, onFloor, Box, Has),
    state(_, onFloor, Box, Has)).

solve(S, Path) :- 
    goal(S), 
    reverse(Path, RevPath), 
    format('Path = ~w', [RevPath]).

solve(S, Path) :- 
    move(Move, S, S2), 
    solve(S2, [Move|Path]), !.