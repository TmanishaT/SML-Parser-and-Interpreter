let
    val x = 3
in
    if true & ({x := 9; false}) then x else x
end;
