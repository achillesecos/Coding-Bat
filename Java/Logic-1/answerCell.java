public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isMorning && isMom && !isAsleep) return true;
  if(isMorning | isAsleep) return false; 
  return true;
}

