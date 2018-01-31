public int centeredAverage(int[] nums) {
	int result = 0;
	Arrays.sort(nums);
	for(int i = 0; i < nums.length - 1; i++){
		result += nums[i];
	}
	return (result/(nums.length-2));
}

