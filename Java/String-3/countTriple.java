public int countTriple(String str) {
  int count = 0;
  char temp = 'a';
  for(int i = 0; i < str.length() - 2; i++){
    temp = str.charAt(i);
    if(temp == str.charAt(i+1) && temp == str.charAt(i+2)){
      count++;
    }
  }
  return count;
}
