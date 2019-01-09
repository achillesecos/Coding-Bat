def last2(str):
  count = 0
  subStr = str[len(str)-2:]
  for i in range(len(str)-2):
    if str[i:i+2] == subStr:
      count += 1
  return count

