public String stringYak(String str) {
  for(int i= 3; i <= str.length(); i++){
    if(str.substring(i-3,i).equals("yak")) str = str.replace(str.substring(i-3,i), "");
    continue;
  }
  return str;
}
