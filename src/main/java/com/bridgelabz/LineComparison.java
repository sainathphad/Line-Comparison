package com.bridgelabz;


import java.util.Scanner;

public class LineComparison {
    //VARIABLES
    int x1, x2, y1, y2;
    Double lengthOfLine;
    Double line1, line2;

    public void coordinates() {

        System.out.println("Enter Coordinate Values: x1, y1, x2, y2");

        Scanner sc = new Scanner(System.in);

        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

    }
    public void lengthCalculation() {
        lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public void compareUsingEqual() {

        //LENGTH COMPUTATION
        coordinates();
        lengthCalculation();

        line1 = lengthOfLine;
        System.out.println("Length of line1 : " + line1);

        coordinates();
        lengthCalculation();
        line2 = lengthOfLine;
        System.out.println("Length of Line2 : " + line2);

        //EQUAL CHECK
        boolean equalCheck = line1.equals(line2); //returns true or false
        System.out.println("Lines are equal: " + equalCheck);
    }
    public void compareUsingCompareTo() {
        //COMPARE LINES
        int compareLine = line1.compareTo(line2);
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

        LineComparison obj = new LineComparison();
        obj.compareUsingEqual();
        obj.compareUsingCompareTo();
    }
}
