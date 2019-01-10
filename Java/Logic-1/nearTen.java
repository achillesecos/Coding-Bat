public boolean nearTen(int num) {
  return Math.abs((Math.abs(num-(num% 10)))-num) <= 2 | Math.abs((Math.abs(num-(num% 10)))-num) >= 8;
}
