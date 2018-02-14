public int count7(int n){
	int counter = 0;
	if(n < 10){
		if(n%7 == 0) counter++;
		return counter;
	}
	if(n%10 == 7) counter++;
	return (counter + count7(n/10));
}
