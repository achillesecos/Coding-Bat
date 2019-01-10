public int countYZ(String str) {
  int count = 0;
  String str1= str.toLowerCase();
  if(str1.substring(str1.length()-1, str1.length()).equals("y") || str1.substring(str1.length()-1, str1.length()).equals("z")){
    count ++;
  }
  for(int i = 1; i < str1.length(); i++){
    if(!(Character.isLetter(str1.charAt(i)))){
      if(str1.substring(i-1,i).equals("y") || str1.substring(i-1,i).equals("z")){
        count++;
      }
    }
  }
  return count;
}
