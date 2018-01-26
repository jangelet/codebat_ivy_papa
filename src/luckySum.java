public int luckySum(int a, int b, int c) {
    int result = 0;
    if(a == 13) return result;
    if(b == 13) return result += a;
    if(c == 13) return result += a + b;
    return result += a + b + c;
}

