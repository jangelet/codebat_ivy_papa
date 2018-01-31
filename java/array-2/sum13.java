public int sum13(int[] nums){
	int result = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] == 13){
			i++;
			continue;
		}
		result += nums[i];
	}
	return result;
}

