public int diff21(int n) {
  if (n > 21){
    return 2*(Math.abs(21-n));
  }
  return Math.abs(21-n);
}
