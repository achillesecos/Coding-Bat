public int caughtSpeeding(int speed, boolean isBirthday) {
  if(speed < 61 | (speed <66 && isBirthday)) return 0; 
  if((!isBirthday && speed >= 61 && speed <= 80) | (isBirthday && speed >= 66 && speed <= 85)) return 1;
  return 2;
}

