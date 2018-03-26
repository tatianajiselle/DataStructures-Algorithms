// roughly divides by 2
// o(n)

public int contiguousArithmeticShift(int n, int count){
    for (int i=0; i < count; i++){
        n >>= 1; //here we are shifting by 1
    }
    return n;
}