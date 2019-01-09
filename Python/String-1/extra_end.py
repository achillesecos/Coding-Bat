def extra_end(str):
  newStr = ''
  for i in range(3):
    newStr += str[len(str)-2:]
  return newStr
