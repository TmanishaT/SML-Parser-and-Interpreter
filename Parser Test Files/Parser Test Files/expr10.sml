let
    val x = 2
in
    let
	fun f(y) = y + x
    in
	let
	    val x = 3
	in
	    f(1)
	end
    end
end;
