public boolean noTriples(int[] nums) {
  for(int i = 2; i < nums.length;i++){
    if(nums[i-2] == nums[i-1] && nums[i-1]== nums[i] && nums[i-2] == nums[i]) return false;
  }
  return true;
}
