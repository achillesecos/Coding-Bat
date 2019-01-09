def string_match(a, b):
  count = 0
  n = min(len(a), len(b))
  for i in range(1,n):
    if a[i-1] == b[i-1] and a[i] == b[i]:
      count += 1
  return count
