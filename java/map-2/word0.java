public Map<String, Integer> word0(String[] strings) {
	Map<String, Integer> result = new HashMap<String, Integer>();
	for(int i = 0; i < strings.length; i++){
		result.put(strings[i], 0);
	}
	return result;
}
