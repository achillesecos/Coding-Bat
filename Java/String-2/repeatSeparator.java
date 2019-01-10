public String repeatSeparator(String word, String sep, int count) {
  String output = "";
  if(count == 0){
    return "";
  }
  for(int i=0;i<count-1;i++){
    output += word + sep;
  }
  output = output + word;
  return output;
}
