public String repeatEnd(String str, int n) {
  String wordReturned = "";
  for(int i=0;i<n;i++){
    wordReturned += str.substring(str.length()-n,str.length());
  }
  return wordReturned;
}
