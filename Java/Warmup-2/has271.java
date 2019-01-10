public boolean has271(int[] nums) {
  for(int i =2; i < nums.length; i++){
    if(Math.abs(nums[i-2] - nums[i-1]) == 5  && Math.abs(nums[i-2]-nums[i] -1) <=2 ) return true;
  }
  return false;
}
