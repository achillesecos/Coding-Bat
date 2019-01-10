public int sumDigits(String str) {
  int sum = 0;
  String temp = "";
  
  for(int i = 0; i < str.length(); i++){
    if(Character.isDigit(str.charAt(i))){
      temp = str.substring(i,i+1);
      sum += Integer.parseInt(temp);
    }
  }
  return sum;
}
