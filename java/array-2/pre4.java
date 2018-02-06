public int[] pre4(int[] nums){
	int first4 = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] == 4){
			first4 = i;
			break;
		}
	}
	int[] newArr = new int[first4];
	for(int i = 0; i < first4; i++){
		newArr[i] = nums[i];
	}
	return newArr;
}
