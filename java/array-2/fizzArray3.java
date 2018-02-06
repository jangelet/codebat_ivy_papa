public int[] fizzArray3(int start, int end) {
	int[] resultArr = new int[end-start];
	for(int i = start; i < end; i++){
		resultArr[i - start] = i;
	}
	return resultArr;
}
