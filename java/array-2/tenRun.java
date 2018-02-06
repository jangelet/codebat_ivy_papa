public int[] tenRun(int[] nums){
	boolean tenStart = false;
	int multTen = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i]%10 == 0){
			multTen = nums[i];
			tenStart = true;
		}
		if(tenStart) nums[i] = multTen;
	}
	return nums;
}
