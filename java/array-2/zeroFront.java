public int[] zeroFront(int[] nums){
	//This is an ineffecient 2 loop solution -- optimal only requires one loop
	int zeroCounter = 0;
	int counter = 0;
	int nonZero = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] == 0) zeroCounter++;
		if(nums[i] != 0){
			counter++;
			nonZero = nums[i];
		}
	}
	for(int i = 0; i < nums.length; i++){
		if(zeroCounter != 0){
			nums[i] = 0;
			zeroCounter--;
			continue;
		}
		if(zeroCounter == 0){
			nums[i] = nonZero;
		}
	}
	return nums;
}
