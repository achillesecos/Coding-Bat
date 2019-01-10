public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if((aSmile == true && bSmile == false) | (aSmile == false && bSmile == true)){
    return false;
  }
  return true;
}
