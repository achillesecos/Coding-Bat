public int centeredAverage(int[] nums) {
  int added = 0;
  int min = nums[0];
  int max = nums[0];
  for(int i = 0; i < nums.length; i++){
    min = Math.min(min, nums[i]);
    max = Math.max(max, nums[i]);
    added += nums[i];
  }
  added = added - min - max;
  return added / (nums.length - 2);
}
