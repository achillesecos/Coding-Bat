def count_code(str):
  count = 0
  for i in range(3,len(str)):
    if str[i-3] == 'c' and str[i-2] == 'o'  and str[i] == 'e':
      count += 1
  return count
