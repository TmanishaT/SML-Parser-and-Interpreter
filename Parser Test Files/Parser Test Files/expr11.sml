let
    fun fact(x) = if x < 2 then 1 else x * fact( x - 1)
in
    fact(6)
end;
