def make_chocolate(small, big, goal):
  if goal <= (5*big) and (goal % 5) <= small:
    return goal % 5
  if goal > (5*big) and goal - (big * 5) <= small:
    return goal - (big * 5)
  return -1
