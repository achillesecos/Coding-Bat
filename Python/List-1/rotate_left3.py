def rotate_left3(nums):
  newArr = []
  for i in range(1,len(nums)):
    newArr.append(nums[i])
  newArr.append(nums[0])
  return newArr

