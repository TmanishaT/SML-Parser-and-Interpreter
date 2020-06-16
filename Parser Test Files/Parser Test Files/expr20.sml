let
    fun f(x) = let fun g(y) = x + y in g(2) end
in 
    f(3)
end;

