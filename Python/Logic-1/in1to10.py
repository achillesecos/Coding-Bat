def in1to10(n, outside_mode):
  if outside_mode and (n <= 1 or n >= 10):
    return True
  elif n >=1 and n <= 10 and not outside_mode:
    return True
  return False
