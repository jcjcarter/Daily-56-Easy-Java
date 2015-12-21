package com.company;

public class Main {

    public static void main(String[] args) {
	int upper = 1 << 26;
        for (int j = 1; j < upper; j++) {
            System.out.print('a'+(char)lowest(j));
        }
    }

    public static int lowest(int i){
        int j;
        for (j = 0; (i & 1) == 0; j++) {
            i >>= 1;
        }
        return j;
    }
}
