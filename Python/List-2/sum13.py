def sum13(nums):
  if len(nums) == 0:
    return 0
  else:
    result = 0
  for i in range(1,len(nums)):
    if nums[i-1] == 13:
      nums[i] = 0
      nums[i-1] = 0
    result += nums[i-1]
  if nums[len(nums)-1] == 13:
    return result
  return result + nums[len(nums)-1]
