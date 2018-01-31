public int loneSum(int a, int b, int c){
	boolean ab = a == b;
	boolean ac = a == c;
	boolean bc = b == c;

	if(ab && ac && bc) return 0;
	if(ab) return c;
	if(ac) return b;
	if(bc) return a;

	return a + b + c;

}
