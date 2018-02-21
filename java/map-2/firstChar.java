public Map<String, String> firstChar(String[] strings){
	Map<String, String> result = new HashMap<String, String>();
	for(String s:strings){
		String first = s.substring(0,1);
		if(result.containsKey(first)){
			result.put(first, result.get(first) + s);
		}else{
			result.put(first, s);
		}
	}
	return result;
}
