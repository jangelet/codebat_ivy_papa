public String[] allSwap(String[] strings){
	Map<String, Integer> wordCounter = new HashMap<String, Integer>();

	for(int i = 0; i < strings.length; i++){
		String s = strings[i].substring(0,1);
		if(wordCounter.containsKey(s)){
			String temp = strings[i];
			strings[i] = string[wordCounter.get(s)];
			strings[wordCounter.get(s)] = temp;
			wordCounter.remove(s);
		}else{
			wordCounter.put(s, i);
		}
	}
	return strings;
}
