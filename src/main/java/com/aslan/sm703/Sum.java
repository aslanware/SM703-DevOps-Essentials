package com.aslan.sm703;

public class Sum {
    private long n1;
    private long n2;
    private long n3;

    public long getN3() {
        return n3;
    }

    public long getN1() {
        return n1;
    }

    public void setN1(long n1) {
        this.n1 = n1;
        n3 += n1;
    }

    public long getN2() {
        return n2;
    }

    public void setN2(long n2) {
        this.n2 = n2;
        n3 += n2;
    }
}
