public Map<String, Boolean> wordMultiple(String[] strings) {
	Map<String, Boolean> result = new HashMap<String, Boolean>();
	Map<String, Integer> wordCounter = new HashMap<String, Integer>();
	for(String s:strings){
		if(wordCounter.containsKey(s)){
			wordCounter.put(s, wordCounter.get(s) + 1);
			if(wordCounter.get(s) >= 2){
				result.put(s, true);
			}
		}else{
			wordCounter.put(s, 1);
			result.put(s, false);
		}
	}
	return result;
}
