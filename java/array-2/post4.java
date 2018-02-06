public int[] post4(int[] nums){
	int after4 = 0;
	for(int i = nums.length - 1; i >= 0; i--){
		if(numts[i] == 4){
			after4 = (nums.length - 1) - i;
			break;
		}
	}
	int[] newArr = new int[after4];
	for(int i = 0; i < newArr.length; i++){
		newArr[i] = nums[(nums.length - after4) + i];
	}
	return newArr;
}
