public String plusOut(String str, String word) {
	String result = "";
	int wLength = word.length();
	for(int i = 0; i < str.length();){
		if((i <= str.length() - wLength) &&
				(str.substring(i, i + wLength).equals(word))){
			result+=word;
			i+=wLength;
			continue;
				}
		if(result.length() <= str.length()){
			result+="+";
			i++;
		}
	}
	return result;
}
