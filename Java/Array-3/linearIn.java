public boolean linearIn(int[] outer, int[] inner) {
  int idxInner = 0;
  int idxOuter = 0;
  while(idxInner < inner.length && idxOuter < outer.length){
    if(outer[idxOuter] == inner[idxInner]){
      idxOuter ++;
      idxInner ++;
    }
    
    else{
      idxOuter ++;
    }
  }
  return (idxInner == inner.length);
}

