public boolean has12(int[] nums){
	boolean has1 = false;
	boolean has12 = false;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] == 1) has = true;
		if(has1 && nums[i] == 2) has12 = true;
	}
	return has12;
}
