public String delDel(String str) {
  if (str.length() >3 && str.substring(1,4).equals("del")){
    str = str.replace("del", "");
  }
  return str;
}
