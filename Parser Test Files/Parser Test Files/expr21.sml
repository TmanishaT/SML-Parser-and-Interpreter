let
    fun f(h) = h(5)
in
    f(let fun g(x) = x*x in g end)
end;

