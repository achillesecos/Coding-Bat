int countXX(String str) {
  int counter = 0;
  for(int i=2;i<=str.length();i++){
    if(str.substring(i-2,i).equals("xx")) counter++;
  }
  return counter;  
}

