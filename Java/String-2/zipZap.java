public String zipZap(String str) {
  for(int i = 3; i <= str.length(); i++){
    if(str.substring(i-3,i-2).equals("z") && str.substring(i-1,i).equals("p")){
      str = str.substring(0,i-2) + str.substring(i-1);
    }
  }
  return str;
}
