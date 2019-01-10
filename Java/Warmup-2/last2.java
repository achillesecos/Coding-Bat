public int last2(String str) {
  if(str.length() <2){
    return 0;
  }
  String sub = str.substring(str.length()-2,str.length());
  int counter =0;
  for(int i =2; i < str.length(); i++){
    if(str.substring(i-2,i).equals(sub)) counter ++;
  }
  return counter;
}
