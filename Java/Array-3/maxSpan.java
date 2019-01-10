public int maxSpan(int[] nums) {
  int span = 1;
  int temp = 0;
  for(int i = 0; i < nums.length; i++){
    for(int j = nums.length - 1; j > i; j--){
      if(nums[i] == nums[j]){
        temp = j - i + 1;
        span = Math.max(temp, span);
      }
    }
  }
  
  if(!(nums.length > 0)){
    return 0;
  }
  return span;
}
