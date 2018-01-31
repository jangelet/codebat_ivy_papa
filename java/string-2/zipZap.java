public String zipZap(String str) {
	if(str.length() < 3) return str;
	String result = "";
	for(int i = 0; i < str.length(); i++){
		if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
			result += str.charAt(i);
			i+=2;
		}
		result += str.charAt(i);
	}
	return result;
}
