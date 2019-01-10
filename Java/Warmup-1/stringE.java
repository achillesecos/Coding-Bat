public boolean stringE(String str) {
  int counter = 0;
  for(int i =0; i < str.length(); i++) {
    if(str.charAt(i)=='e') counter ++;
  }
  if(counter >=1 && counter <= 3){
    return true;
  }
  return false;
}
