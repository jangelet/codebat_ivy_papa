public String wordEnds(String str, String word) {
	String result = "";
	int wLength = word.length();
	for(int i = 0; i < str.length(); i++){
		if(i <= str.length() - wLength && str.substring(i, i+wLength).equals(word)){
			if(i > 0){
				result += str.charAt(i-1);
			}
			if(i < str.length() - wLength){
				result += str.charAt(i+wLength);
				continue;
			}
			i+=wLength;
		}
	}
	return result;
}
