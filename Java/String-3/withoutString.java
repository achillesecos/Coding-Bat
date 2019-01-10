public String withoutString(String base, String remove) {
  String base1 = base.toLowerCase();
  String remove1 = remove.toLowerCase();
  String output = "";
  
  for(int i = 0; i < base1.length(); i++){
    if(i <= base1.length() - remove1.length()){
      String temp1 = base1.substring(i,i+remove.length());
      if(!temp1.equals(remove1)){
        output += base.substring(i,i+1);
      }
      else{
        i += remove.length() - 1;
      }
    }
    else{
      String temp2 = base1.substring(i,i+1);
      if(!temp2.equals(remove1)){
        output += base.substring(i, i+1);
      }
    }
  }
  return output;
}
