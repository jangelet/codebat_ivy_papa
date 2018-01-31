public String repeatFront(String str, int n) {
	String result = "";
	int placeholder = n;
	for(int i = 0; i < n; i++){
		result += str.substring(0, placeholder);
		placeholder--;
	}
	return result;
}
