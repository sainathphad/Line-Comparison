package com.bridgelabz;

public class LineComparison {
    static double LengthCalculation( int x1, int x2 , int y1, int y2 ) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void CompareLine() {

        //COMPUTATION
        Double lengthOfLine1 = LengthCalculation(2,5,2,5);
        Double lengthOfLine2 = LengthCalculation(1,3,1,3);

        System.out.println("Length of line1 : " + lengthOfLine1);
        System.out.println("Length of Line2 : " + lengthOfLine2);

        boolean checkLength = lengthOfLine1.equals(lengthOfLine2); //returns true or false
        System.out.println("Lines are equal: " + checkLength);

        int compareLine = lengthOfLine1.compareTo(lengthOfLine2);
        switch (compareLine) {
            case 0:
                System.out.println("Lines are equal");
                break;
            case 1:
                System.out.println("line1 is greater than line2");
                break;
            case -1:
                System.out.println("line1 is short than line2");
                break;
        }
    }

    public static void main(String[] args) {

            System.out.println("Welcome To Line Comparison Computation Program");
            CompareLine();
        }


}
