public int[] make2(int[] a, int[] b) {
  int[] result = new int[2];
  if(a.length >= 2){
    for(int i = 0; i < 2;i++) result[i] = a[i];
    return result;
  }
  if(a.length == 1){
    result[0] = a[0];
    result[1] = b[0];
    return result;
  }
  for(int j = 0; j < 2; j ++){
    result[j] = b[j];
  }
  return result;
}
