public String parenBit(String str) {
	if(str.isEmpty()) return ")";
	if(str.charAt(0) == '('){
		return str.substring(0, str.indexOf(")")) +
			parenBit(str.substring(str.indexOf(")")));
	}
	return parenBit(str.substring(1));
}
