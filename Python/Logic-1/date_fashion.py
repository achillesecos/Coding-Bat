def date_fashion(you, date):
  if (date >= 8 and you > 2) or (date > 2 and you >= 8):
    return 2
  elif (date <= 2  or you <= 2):
    return 0
  return 1
