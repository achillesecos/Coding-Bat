def end_other(a, b):
  a.lower()
  b.lower()
  aL = len(a)
  bL = len(b)
  return a.lower() == b[bL - aL:].lower() or b.lower() == a[aL - bL:].lower()
