package model;

public class Positive {
    private int num;

    private Positive(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("양수를 입력하십시오.");
        }
        
        this.num = num;
    }

    public static Positive of(String num) {
        return of(Integer.valueOf(num));
    }

    public static Positive of(int num) {
        return new Positive(num);
    }

    public int getNum() {
        return num;
    }
}