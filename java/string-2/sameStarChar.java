public boolean sameStarChar(String str){
	for(int i = 1; i < str.length() - 1; i++){
		if(str.substring(i, i+1).equals("*")){
			if(str.charAt(i-1) != str.charAt(i+1)) return false;
		}
	}
	return true;
}
