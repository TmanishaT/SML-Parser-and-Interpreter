let
    val x = 3
in
    if false & ({x := 9; false}) then x else x
end;
