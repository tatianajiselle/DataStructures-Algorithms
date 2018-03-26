public boolean isBitSet(int num, int position){
    return (1 & (num >> position)); //shift 1 over by i bits
}