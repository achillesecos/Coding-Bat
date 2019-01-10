public boolean endOther(String a, String b) {
  String newA = a.toLowerCase();
  String newB = b.toLowerCase();
  if(a.length() > b.length()){
    if(newA.substring(newA.length() - newB.length(), newA.length()).equals(newB)){
      return true;
    }
  }
  else{
    if(newB.substring(newB.length() - newA.length(), newB.length() ).equals(newA)){
      return true;
    }
  }
  return false;
}
