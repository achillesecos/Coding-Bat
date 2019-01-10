public int roundSum(int a, int b, int c) {
  a = round(a);
  b = round(b);
  c = round(c);
  return a + b + c;
}

public int round(int n){
  if(n % 10 >= 5){
    n = n - n%10 + 10;
  }
  else{
    n = n - n% 10;
  }
  return n;
}
