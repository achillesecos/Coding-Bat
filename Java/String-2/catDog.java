public boolean catDog(String str) {
  int catC = 0;
  int dogC = 0;
  for(int i = 3; i <= str.length(); i++){
    if(str.substring(i-3,i).equals("dog")) dogC ++;
    if(str.substring(i-3,i).equals("cat")) catC ++;
  }
  return catC == dogC;
}
