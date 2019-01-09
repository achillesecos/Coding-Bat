def caught_speeding(speed, is_birthday):
  if speed <= 60:
    return 0
  elif is_birthday and speed <= 65:
    return 0
  elif is_birthday and speed >= 66 and speed <= 85:
    return 1
  elif speed > 60 and speed <= 80:
    return 1
  return 2

