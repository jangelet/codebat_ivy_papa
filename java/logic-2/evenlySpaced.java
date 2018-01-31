
public boolean evenlySpaced(int a, int b, int ){
	int[] abc = {a, b, c};
	Arrays.sort(abc);
	return (abc[0] - abc[1] === abc[1] - abc[2]);
}
