def centered_average(nums):
  minV = min(nums)
  maxV = max(nums)
  avg = 0
  count = 0
  return (sum(nums) - minV - maxV) // (len(nums)-2)
