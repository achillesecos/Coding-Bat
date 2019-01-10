public int array667(int[] nums) {
  int counter = 0;
  for(int i = 1; i <nums.length; i++){
    if((nums[i-1] == 6 && nums[i] == 6) | (nums[i-1] == 6 && nums[i] == 7)) counter ++;
  }
  return counter;
}

