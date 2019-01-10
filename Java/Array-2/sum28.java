public boolean sum28(int[] nums) {
  boolean output = false;
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2){
      sum += 2;
    }
  } 
  if(sum == 8){
      output = true;
    }
  return output;
}
