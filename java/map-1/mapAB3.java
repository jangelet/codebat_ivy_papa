public Map<String, String> mapAB3(Map<String, String> map){
	boolean hasA = map.containsKey("a");
	boolean hasB = map.containsKey("b");
	if(hasA && map.get("a") != "" && (map.get("b") == "" || !hasB)){
		map.put("b", map.get("a"));
	}
	if(hasB && map.get("b") != "" && (map.get("a") == "" || !hasA)){
		map.put("a", map.get("b"));
	}
	return map;
}
