public int makeChocolate(int small, int big, int goal) {
  if(goal >= (big * 5) && (goal - (big * 5) <= small)) return goal - (big*5);
  if(goal <= (big* 5) && goal % 5 <= small) return goal % 5;
  return -1;
}
