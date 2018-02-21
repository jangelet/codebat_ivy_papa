public Map<String, String> pairs(String[] strings){
	Map<String, String> result = new HashMap<String, String>();
	for(String s:strings){
		result.put(s.substring(0,1), s.substring(s.length()-1, s.length()));
	}
	return result;
}
