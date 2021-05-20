package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        int x1 = 2, x2 = 5, y1 = 2, y2 = 5;
        int p1 = 1, p2 = 5, q1 = 2, q2 = 5;
        double lengthOfLine1;
        double lengthOfLine2;
        lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
        System.out.println("Length of line1 : " + lengthOfLine1);
        System.out.println("Length of Line 2: " + lengthOfLine2);
        Double d1 = lengthOfLine1;
        Double d2 = lengthOfLine2;
        System.out.println(d1.equals(d2));
        System.out.println(d1.compareTo(d2));
    }
}
