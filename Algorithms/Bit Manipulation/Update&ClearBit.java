public clearBit(int num, int i){
    int clear = (1 << i);
    return num & ~clear;
}

public updateBit(int num, int i, boolean isBit1){
    int value = isBit1 ? 1:0;
    int clear = ~(1 << i);
    return (num & clear) | (value << i);
}