package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome To Line Comparison Computation Program");
        //VARIABLES
        int x1 = 2, x2 = 5, y1 = 2, y2 = 5;
        int p1 = 1, p2 = 5, q1 = 2, q2 = 5;

        Double lengthOfLine1;
        Double lengthOfLine2;
        //COMPUTATION
        lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

        System.out.println("Length of line1 : " + lengthOfLine1);
        System.out.println("Length of Line2 : " + lengthOfLine2);

        boolean checkLength = lengthOfLine1.equals(lengthOfLine2); //returns true or false
        System.out.println("Lines are equal: " +checkLength);
        int compareLine = lengthOfLine1.compareTo(lengthOfLine2);

        switch (compareLine) {
            case 0:
                System.out.println("Lines are equal");

            case 1:
                System.out.println("line1 is greater than line2");

            case -1:
                System.out.println("line1 is short than line2");
        }

    }
}
