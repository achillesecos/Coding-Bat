public boolean xyzThere(String str) {
  if(str.length() >=3 && str.substring(0,3).equals("xyz")) return true;
  for(int i=4; i <=str.length(); i++){
    if(!(str.substring(i-4,i-3).equals(".")) && str.substring(i-3,i).equals("xyz")) return true;
  }
  return false;
}

