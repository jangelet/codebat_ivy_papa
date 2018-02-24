public int countYZ(String str) {
	int counter = 0;
	char last = str.charAt(str.length() - 1);
	
	if(last == 'y' || last == 'z' || last == 'Y' || last == 'Z') counter++;

	for(int i = 0; i < str.length() - 1; i++){
		char letter = str.charAt(i);
		char letterNext = str.charAt(i+1);
		if(letter == 'y' || letter == 'Y' || letter == 'z' || letter == 'Z'){
			if(!Character.isLetter(letterNext)) counter++;
		}
	}
	return counter;
}
