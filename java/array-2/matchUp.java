public int matchUp(int[] nums1, int[] nums2){
	int matchCount = 0;
	for(int i = 0; i < nums1.length; i++){
		if(nums1[i] + 1 == nums2[i] || nums1[i] + 2 == nums2[i] ||			nums2[i] + 1 == nums1[1] || nums2[i] + 2 == nums1[i]){
			matchCount++;
		}
	}
	return matchCount;
}
