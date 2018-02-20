public Map<String, String> topping2(Map<String, String> map) {
	if(map.containsKey("ice cream") && map.get("ice cream") != ""){
		map.put("yogurt", map.get("ice cream"));
	}
	if(map.containsKey("spinach") && map.get("spinach") != ""){
		map.put("spinach", "nuts");
	}
	return map;
}
