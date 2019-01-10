public int[] makeLast(int[] nums) {
  int[] result = new int[nums.length * 2];
  for(int i = 0; i < (nums.length * 2) - 1; i++){
    result[i] = 0;
  }
  result[(nums.length * 2) - 1] = nums[nums.length - 1];
  return result;
}
