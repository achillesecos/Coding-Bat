public int teaParty(int tea, int candy) {
  if((tea >= candy * 2) | (candy >= tea * 2) && tea >= 5 && candy >= 5) return 2;
  if(tea >=5 && candy >=5) return 1;
  return 0;
}
