public int stringMatch(String a, String b) {
  int maxi = Math.min(a.length(), b.length());
  int counter = 0;
  if(maxi < 2) return 0;
  for(int i=2; i <= maxi; i++){
    if(a.substring(i-2,i).equals(b.substring(i-2,i))) counter++;
  }
  return counter;
}
