public int[] reverse3(int[] nums) {
  int[] newArr = new int[3];
  for(int i = 0; i < nums.length;i++){
    newArr[i] = nums[2-i];
  }
  return newArr;
}
