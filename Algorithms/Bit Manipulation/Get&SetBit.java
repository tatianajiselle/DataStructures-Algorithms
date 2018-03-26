// by preforming an AND with num, we clear all bits other than the bit at bit i
public boolean getBit(int num, int position){
    return((num & (1 << position)) != 0); //shift 1 over by i bits
}

// by preforming an OR with num,only the value at bit i will change
public boolean setBit(int num, int position){
    return num | (1 << position); //shift 1 over by i bits
}