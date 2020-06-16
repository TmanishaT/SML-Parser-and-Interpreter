let
    val x = 101
in 
    (let fun g(x) = ( { while x < 10 do x := x + 3; x } ) in g(6) end) * x 
end;

