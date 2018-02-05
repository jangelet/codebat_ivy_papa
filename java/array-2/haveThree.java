public boolean haveThree(int[] nums) {
	int threeCounter = 0;
	for(int i = 0; i < nums.length - 1; i++){
		if(nums[i] == 3 && nums[i+1] != 3) threeCounter++;
		if(i == nums.length - 2){
			if(nums[i] != 3 && nums[i+1] == 3) threeCounter++;
		}
	}
	return (threeCounter == 3);
}
