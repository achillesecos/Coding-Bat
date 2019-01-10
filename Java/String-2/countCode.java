public int countCode(String str) {
  int count = 0;
  for(int i = 4; i <= str.length(); i++){
    if(str.substring(i-4,i-2).equals("co") && str.substring(i-1,i).equals("e")){
      count += 1; 
    }
  }
  return count;
}
