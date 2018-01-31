public String getSandwich(String str){
	int firstBread = str.indexOf("bread");
	int lastBread = str.lastIndexOf("bread");
	if (firstBread == lastBread) return "";
	return str.substring(firstBread+5, lastbread);
}
