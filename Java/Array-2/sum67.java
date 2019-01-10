public int sum67(int[] nums) {
  int added = 0;
  int occurenceOf7 = 0;
  for(int i = 0; i < nums.length; i ++){
    if(nums[i] == 6){
      for(int j = i; nums[j] != 7; j++){
        nums[j] =0;
        occurenceOf7 = j;
      }
      nums[occurenceOf7 + 1] = 0;
    }
    else{ 
      added += nums[i];
    }
  }
  return added;
}
