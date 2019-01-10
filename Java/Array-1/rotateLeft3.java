public int[] rotateLeft3(int[] nums) {
  int[] newArr = new int[3];
  for(int i = 1; i < nums.length;i++){
    newArr[i-1] = nums[i];
  }
  newArr[2] = nums[0];
  return newArr;
}
