public int arrayCount9(int[] nums) {
  int counter = 0;
  for(int num : nums){
    if(num ==9) counter++;
  }
  return counter;
}
