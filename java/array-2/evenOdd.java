public int[] evenOdd(int[] nums){
	int odd = 0;
	int oddCounter = 0;
	int even = 0;
	int evenCounter = 0;
	
	for(int i = 0; i < nums.length; i++){
		if(nums[i]%2 == 0){
			even = nums[i];
			evenCounter++;
		}
		if(nums[i]%2 != 0){
			odd = nums[i];
			oddCounter++;
		}
	}
	
	for(int i = 0; i < nums.length; i++){
		if(evenCounter > 0){
			nums[i] = even;
			evenCounter--;
			continue;
		}
		nums[i] = odd;
	}
	return nums;
}

