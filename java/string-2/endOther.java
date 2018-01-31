public boolean endOther(String a, String b) {
	String shorter = (a.length() < b.length()) ? a.toLowerCase() : b.toLowerCase();
	String longer = (a.length() < b.length()) ? b.toLowerCase() : a.toLowerCase();
	return (longer.substring(longer.length() - shorter.length()).equals(shorter));
}
