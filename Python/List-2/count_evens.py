def count_evens(nums):
  counter = 0
  for num in nums:
    if num % 2 == 0:
      counter += 1
  return counter
