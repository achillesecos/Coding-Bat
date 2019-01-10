public int[] front11(int[] a, int[] b) {
  int[] result = new int[2];
  if(a.length == 0 && b.length == 0) return new int[0];
  else if(a.length == 0) return new int[]{b[0]};
  else if(b.length == 0) return new int[]{a[0]};
  else if(a.length >= 1 && b.length >= 1){
    result[0] = a[0];
    result[1] = b[0];
  }
  return result;
}
