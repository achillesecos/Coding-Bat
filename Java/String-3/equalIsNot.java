public boolean equalIsNot(String str) {
  int notCount = 0;
  int isCount = 0;
  String temp1 = "";
  String temp2 = "";
  
  for(int i = 0; i < str.length(); i++){
    if(i < str.length() - 2){
      temp1 = str.substring(i,i+3);
      if(temp1.equals("not")){
        notCount ++;
      }
    }
    if(i < str.length() - 1){
      temp2 = str.substring(i,i+2);
      if(temp2.equals("is")){
        isCount++;
      }
    }
  }
  if(notCount == isCount){
    return true;
  }
  else{
    return false;
  }
}
