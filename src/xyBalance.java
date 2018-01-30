public boolean xyBalance(String str) {
	if(!str.contains("x")) return true;
	fort(int i = str.lastIndexOf("x"); i < str.length(); i++){
		if(str.charAt(i) == 'y') return true;
	}
	return false;
}
