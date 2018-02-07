public int[] zeroMax(int[] nums) {
	int bigOdd = 0;
	for(int i = nums.length - 1; i >= 0; i--) {
		if (nums[i]%2 == 1 && nums[i] > bigOdd)
			bigOdd = nums[i];
		if (nums[i] == 0)
			nums[i] = bigOdd;
	}
	return nums;
}
