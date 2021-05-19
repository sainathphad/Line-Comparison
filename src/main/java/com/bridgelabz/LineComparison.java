package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
    System.out.println("Welcome To Line Comparison Computation Program");
        int x1 = 2;
        int x2 = 5;
        int y1 = 2;
        int y2 = 5;
        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of a line : " +length);
    }
}
