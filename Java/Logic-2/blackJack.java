public int blackjack(int a, int b) {
  if(a > 21 && b > 21) return 0;
  if(a > 21){
    return b;
  }
  else if(b > 21){
    return a;
  }
  return 21- Math.min(Math.abs(a-21), Math.abs(b-21));
}
