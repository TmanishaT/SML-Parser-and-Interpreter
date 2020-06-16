let
    fun fibo(x) = if x = 1 then 1 else if x = 2 then 1 else fibo(x-1) +
	fibo(x-2)
in
    fibo(10)
end;
