public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk && c > b) return true;
  if(!bOk && a < b && b< c) return true;
  return false;
}
