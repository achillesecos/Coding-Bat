public String oneTwo(String str) {
  String output = "";
  if(str.length() % 3 ==0){
  for(int i = 0; i < str.length(); i= i + 3){
    output += str.substring(i+1, i+3) + str.substring(i,i+1);
    //if(i == str.length()){
      //return output;
    //}
  }
  }
  if(str.length() % 3 == 1){
     for(int i = 0; i < str.length()-1; i= i + 3){
    output += str.substring(i+1, i+3) + str.substring(i,i+1);
  }
  }
    if(str.length() % 3 == 2){
     for(int i = 0; i < str.length()-2; i= i + 3){
    output += str.substring(i+1, i+3) + str.substring(i,i+1);
  }
    }
  return output;
}
