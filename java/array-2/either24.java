public boolean either24(int[] nums){
	boolean twoTwo = false;
	boolean fourFour = false;
	for(int i = 0; i < nums.length - 1; i++){
		if(nums[i] == 2 && nums[i+1] == 2) twoTwo = true;
		if(nums[i] == 4 && nums[i+1] == 4) fourFour = true;
	}
	return (twoTwo && !fourFour) || (!twoTwo && fourFour);
}

