package com.aslan.sm703;

public class Sum {
    private int n1;
    private int n2;
    private int n3;

    public int getN3() {
        return n3;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
        n3 += n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
        n3 += n2;
    }
}
