public int sum13(int[] nums) {
  int added = 0;
  
  if(nums.length == 0){
    return 0;
  }
  else{
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != 13){
        added += nums[i];
      }
      else if(nums[i] == 13 && i < nums.length -1){
        nums[i] = 0;
        nums[i+1] = 0;
      }
    }
  }
  return added;
}

