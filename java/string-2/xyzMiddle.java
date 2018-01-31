public boolean xyzMiddle(String str){
	if(!str.contains("xyz")) return false;
	int mid_start = (str.length()-3)/2;
	String middle = str.substring(mid_start, str.length()-mid_start);
	return middle.contains("xyz");
}
