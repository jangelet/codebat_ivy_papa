public Map<String, Integer> wordCount(String[] strings){
	Map<String, Integer> wordCounter = new HashMap<String, Integer>();
	for(int i = 0; i < strings.length; i++){
		if(wordCounter.containsKey(strings[i])){
			wordCounter.put(strings[i], wordCounter.get(strings[i]) + 1);
			continue;
		}
		wordCounter.put(strings[i], 1);
	}
	return wordCounter;
}
