public String conCat(String a, String b) {
  if(a == "") return b;
  if(b == "") return a;
  if(a.charAt(a.length()-1) == b.charAt(0)) return a + b.substring(1);
  return a + b;
}

