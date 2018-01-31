public int countCode(String str) {
	int codeCount = 0;
	for (int i = 0; i<str.length()-3; i++){
		if(str.substring(i, i+4).matches("co\\we")) codeCount++;
	}
	return codeCount;
}
