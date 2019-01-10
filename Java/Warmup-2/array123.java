public boolean array123(int[] nums) {
  for(int i=2; i < nums.length;i++){
    if(nums[i-2] == 1 && nums[i-1] ==2 && nums[i]==3) return true;
  }
  return false;
}
