public String oneTwo(String str) {
	if(str.length() < 3) return "";
	String result = "";
	//need for loop bounds to be divisible by 3
	int bounds = str.length() - (str.length()%3);
	for(int i = 0; i < bounds; i+=3){
		result += str.substring(i+1, i+3) + str.substring(i, i+1);
	}
	return result;
}	
