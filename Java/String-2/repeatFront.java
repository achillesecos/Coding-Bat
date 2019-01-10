public String repeatFront(String str, int n) {
  String output = "";
  for(int i = 0; i <= n; i++){
    output += str.substring(0,n);
    n -= 1;
  }
  if(n == 1){
    output += str.substring(0,1);
  }
  return output;
}
