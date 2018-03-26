public int myAbs(int x){
    const int bit31 = (x >> 31);
    return ((x ^ bit31) - bit31);
}