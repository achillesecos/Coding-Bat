public boolean prefixAgain(String str, int n) {
    String prefix0 = str.substring(0, n);
    for (int i = n; i <= str.length() - prefix0.length(); i++)
        if (str.substring(i, i + prefix0.length()).equals(prefix0))
            return true;
    return false;
}
