boolean doubleX(String str) {
  for(int i = 2; i <=str.length();i++){
    if(str.charAt(i-2) =='x'){
      if(str.charAt(i-1) == 'x'){
        return true;
      }
      return false;
    }
    continue;
  }
  return false;
}
