public boolean makeBricks(int small, int big, int goal) {
  if(goal <= 5*big && (goal % 5 <= small)) return true;
  if(goal >= 5 * big && (goal - (big * 5)) <= small) return true;
  return false;
}
