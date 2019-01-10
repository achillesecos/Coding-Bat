public String mixString(String a, String b) {
  String result = "";
  if(a.length()>b.length()){
    for(int i = 1; i <= b.length();i++){
      result += a.substring(i-1,i);
      result += b.substring(i-1, i);
    }
    result += a.substring(b.length());
    return result;
  }
  else if(a.length()==b.length()){
    for(int i = 1; i <= b.length();i++){
      result += a.substring(i-1,i);
      result += b.substring(i-1, i);
    }
    return result;
  }
  for(int i = 1; i <= a.length();i++){
      result += a.substring(i-1,i);
      result += b.substring(i-1, i);
    }
    result += b.substring(a.length());
  return result;
}
