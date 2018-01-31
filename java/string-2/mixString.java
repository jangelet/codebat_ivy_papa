public String mixString(String a, String b){
	String result = "";
	String shorter = (a.length() <  b.length()) ? a : b;
	String longer = (a.length() < b.length()) ? b : a;
	for(int i = 0; i < shorther.length(); i++){
		result += a.substring(i, i+1) + b.substring(i, i+1);
	}
	return result += longer.substring(shorter.length());
}
