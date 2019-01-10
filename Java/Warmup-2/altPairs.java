public String altPairs(String str) {
  String result = "";
  if(str.length() == 1) return str;
  if(str.length() % 2 == 0){
    for(int i = 2; i <= str.length(); i+=4){
      result += (str.substring(i-2,i-1) + str.substring(i-1,i));
    }
  }
  else if(str.length() % 2 ==1){
    for(int i = 2; i < str.length(); i+=4){
      result += (str.substring(i-2,i-1) + str.substring(i-1,i));
    }
    if(str.length() > 3) result += str.charAt(str.length()-1);
  }
  return result;
}
