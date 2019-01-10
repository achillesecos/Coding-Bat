public boolean closeFar(int a, int b, int c) {
  if(isCloseFar(a,b) && isCloseFar(b,c) && isCloseFar(a,c)) return false;
  if((isCloseFar(a,b) && isCloseFar(b,c)) | (isCloseFar(a,b) && isCloseFar(a,c)) |(isCloseFar(b,c) && isCloseFar(a,c))) return false;
  return isCloseFar(a,b) | isCloseFar(b,c) | isCloseFar(a,c);
}

public boolean isCloseFar(int n, int m){
  if(Math.abs(n-m) >= 2) return false;
  return true;
}

