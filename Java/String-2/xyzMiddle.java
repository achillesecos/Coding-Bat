public boolean xyzMiddle(String str) {
  int left = 0;
  for(int i = 3; i <= str.length(); i++){
    if(!(str.substring(i-3,i).equals("xyz"))) left += 1;
    else if(Math.abs(left -(str.length()-i)) <= 1) return true;
    else left+=1;
  }
  return false;
}
