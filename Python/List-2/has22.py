def has22(nums):
  b = False
  if len(nums) == 2:
    return nums[0] == nums[1] 
  for i in range(1,len(nums)-1):
    if (nums[i] == 2 and nums[i-1] == 2) or (nums[i] == 2 and nums[i+1] == 2):
      b = True
    if b:
      return b
  return b
