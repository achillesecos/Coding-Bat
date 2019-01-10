public boolean more14(int[] nums) {
  boolean output = false;
  int onesCount = 0;
  int foursCount = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1)
      onesCount += 1;
      
    if(nums[i] == 4)
      foursCount += 1;
  }
  
  if(onesCount > foursCount){
    output = true;
  }
  return output;
}
