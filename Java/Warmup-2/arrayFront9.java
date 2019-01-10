public boolean arrayFront9(int[] nums) {
  boolean b = false;
  int count = 0;
  for(int num: nums){
    if(num == 9 && count <4) return true;
    count ++;
  }
  return b;
}
