package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
    System.out.println("Welcome To Line Comparison Computation Program");
        int x1 = 2;
        int x2 = 5;
        int y1 = 2;
        int y2 = 5;
        int p1 = 1, p2 = 4, q1 = 1, q2 = 4;
        double lengthOfLine1;
        double lengthOfLine2;
        lengthOfLine1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        lengthOfLine2 = Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
        System.out.println("Length of line1 : " +lengthOfLine1);
        System.out.println("Length of Line 2: " +lengthOfLine2);

        if (Double.compare(lengthOfLine1,lengthOfLine2) == 0) {
            System.out.println("line1 and line2 are equal");
        }
        else
            System.out.println("line1 and line2 are not equal");

    }
}
