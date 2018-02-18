public int strDist(String str, String sub) {
	int subLen = sub.length();
	int strLen = str.length();

	if(strLen < subLen) return 0;

	if(str.substring(0, subLen).equals(sub) &&
		       	str.substring(strLen - subLen, strLen).equals(sub)){
		return str.length();
	}

	if(str.substring(0, subLen.equals(sub)){
		return strDist(str.substring(0, strLen - 1), sub);
	}
	
	return strDist(str.substring(1), sub);
}
