let
    fun
	sq     (     x     )      =    x*x
in
    let
	fun applyTwice    (
			   f
			   ) = f(f(2))
    in 
	applyTwice    (   sq   )
    end
end     ;
