public int sum67(int[] nums){
	int result = 0;
	boolean between67 = false;
	for(int i = 0; i < nums.length; i++){
		if(nums[i]==6) between67 = true;
		if(between67 && nums[i]==7){
			between67 = false;
			continue;
		}
		if(!between67) result += nums[i];
	}
	return result;
}
