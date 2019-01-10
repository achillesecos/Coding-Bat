public String withoutX2(String str) {
  if(str.length() < 2) return "";
  if(str.substring(1,2).equals("x")) str = str.substring(0,1) + str.substring(2);
  if(str.substring(0,1).equals("x")) str = str.substring(1);
  return str;
}
