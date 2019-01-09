def sum67(nums):
  if len(nums) == 0:
    return 0
  result = 0
  for i in range(len(nums)):
    if nums[i] == 6:
      j = 0
      while nums[i+j] != 7:
        nums[i+j] = 0
        j+=1
      nums[i+j] = 0
    result += nums[i]
  return result
