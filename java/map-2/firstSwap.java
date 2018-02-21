public String[] firstSwap(String[] strings) {
	Map<String, Integer> wordCounter = new HashMap<String, Integer>();

	for(int i = 0; i < strings.length; i++){
		String s = strings[i].substring(0,1);
		if(wordCounter.containsKey(s)){
			if(wordCounter.get(s) > -1){
				String temp = strings[i];
				strings[i] = strings[wordCounter.get(s)];
				strings[wordCounter.get(s)] = temp;
				wordCounter.put(s, -1);
			}
		}else{
			wordCounter.put(s, i);
		}
	}
	return strings;
}
