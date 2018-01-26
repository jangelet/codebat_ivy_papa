public boolean closeFar(int a, int b, int c){
	int diffAb = Math.abs(a-b);
	int diffAc = Math.abs(a-c);
	int diffBc = Math.abs(b-c);

	if (diffAb <= 1 || diffAc <= 1){
	    return (diffAb >= 2 && diffBc >= 2) || (diffAc >= 2 && diffBc >= 2);
	}
}
