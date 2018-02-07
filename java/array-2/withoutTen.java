public int[] withoutTen(int[] nums) {
	int counter = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] == 10){
			nums[i] = 0;
			counter++;
			continue;
		}
		if(nums[i] != 10 && counter > 0){
			nums[i - counter] = nums[i];
			nums[i] = 0;
		}
	}
	return nums;
}

