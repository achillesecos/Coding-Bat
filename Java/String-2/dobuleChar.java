public String doubleChar(String str) {
  String finalWord = "";
  for(int i=0;i<str.length();i++){
    finalWord = finalWord + str.charAt(i) + str.charAt(i);
  }
  return finalWord;
}

