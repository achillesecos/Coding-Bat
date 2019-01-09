def close_far(a, b, c):
  if abs(a-b) <= 1 and abs(a-c) > 1 and abs(b-c) > 1:
    return True
  elif abs(a-c) <= 1 and abs(a - b) > 1 and abs(b-c) > 1:
    return True
  elif abs(b-c) <= 1 and abs(a-c) > 1 and abs(a-b) > 1:
    return True
  elif abs(a-b) > 1 and abs(a-c) > 1 and abs(b-c) > 1:
    return False
  elif abs(a-b) <= 1 and abs(a-c) <= 1 and abs(b-c) <=1:
    return False
  return False
