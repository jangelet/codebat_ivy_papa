public String[] fizzBuzz(int start, int end) {
	String[] fbArr = new String[end - start];
	for(int i = 0; i < fbArr.length; i++){
		if((i + start)%3 == 0 && (i + start)%5 == 0){
			fbArr[i] = "FizzBuzz";
			continue;
		}
		if((i+start)%3 == 0){
			fbArr[i] = "Fizz";
			continue;
		}
		if((i + start)%5 == 0){
			fbArr[i] = "Buzz";
			continue;
		}
		fbArr[i] = String.valueOf(i + start);
	}
	return fbArr;
}
