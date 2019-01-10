public boolean bobThere(String str) {
  //boolean output = false;
  for(int i = 3; i <= str.length(); i++){
    if(str.substring(i-3,i-2).equals("b") && str.substring(i-1,i).equals("b")){
      return true;
    }
  }
  return false;
}
