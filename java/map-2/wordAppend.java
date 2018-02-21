public String wordAppend(String[] strings){
	String result = "";
	Map<String, Integer> wordCounter = new HashMap<String, Integer>();

	for(String s:strings){
		if(wordCounter.containsKey(s)){
			wordCounter.put(s, wordCounter.get(s) + 1);
			if(wordCounter.get(s)%2 == 0){
				result += s;
			}
		}else{
			wordCounter.put(s, 1);
		}
	}
	return result;
}
