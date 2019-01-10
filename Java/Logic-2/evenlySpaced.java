public boolean evenlySpaced(int a, int b, int c) {
  if(a==b && b == c) return true;
  if(a == b | b ==c) return false;
  if((Math.abs(b - a) == Math.abs(c - b)) |(Math.abs(b - a) == Math.abs(c - a)) | (Math.abs(b - c) == Math.abs(c - a))) return true;
  return false;
}
