public Map<String, Integer> wordLen(String[] strings){
	Map<String, Integer> result = new HashMap<String, Integer>();
	for(String s:strings){
		result.put(s, s.length());
	}
	return result;
}
