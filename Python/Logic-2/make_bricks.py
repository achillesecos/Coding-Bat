def make_bricks(small, big, goal):
  if goal >= (big * 5) and small >= goal - (big * 5):
    return True
  elif goal <= (big * 5) and goal % 5 <= small:
    return True
  return False
