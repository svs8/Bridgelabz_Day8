package com.bridgelabz_day8;

import java.util.Scanner;


public class LineComparison_Oops {


    static double length(int a1,int b1,int a2, int b2)
    {
        System.out.println("co-ordinate of point 1 of Line 1 ie (x1="+a1+"and y1="+b1+")");
        System.out.println("Co-ordinates of point y ie (x2="+a2+"and y2="+b2+")");

        double l= Math.pow((a2-a1),2) + Math.pow((b2-b1),2);//Math.pow(i, 3);
        return Math.sqrt(l);
    }

    public void lineEquality(double l1,double l2){
        Double d1= new Double(l1);
        Double d2= new Double(l2);
        if(d1.equals(d2)){
            System.out.println("Both the lines are equal");
        }
        else {
            System.out.println("Both the lines are not equal");
        }

    }
    void LineCompare(double len1,double len2) {

        Double d1 = new Double(len1);
        Double d2 = new Double(len2);

        double compareValue = d1.compareTo(d2);
        if (compareValue == 0)
            System.out.println("len1 and len2 are equal");
        else if (compareValue < 0)
            System.out.println("len1 is less than len2");
        else
            System.out.println("len1 is greater than len2");
    }



    public static void main(String[] args) {


        System.out.println("enter the first co-ordinate of point 1 of Line 1");
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 1 of Line 1");
        int y1=sc.nextInt();
        System.out.println("enter the first co-ordinate of point 2 of Line 1");
        int x2=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 2 of Line 1");
        int y2=sc.nextInt();
        System.out.println("line 1 Co-ordinates");
        double l1=length(x1,y1,x2,y2);
        System.out.println("length of the line 1 is "+l1);

        System.out.println("line 2 Co-ordinates");
        System.out.println("enter the first co-ordinate of point 1 of Line 2");
        int x3=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 1 of Line 2");
        int y3=sc.nextInt();
        System.out.println("enter the first co-ordinate of point 2 of Line 2");
        int x4=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 2 of Line 2");
        int y4=sc.nextInt();
        System.out.println("line 1 Co-ordinates");
        double l2=length(x3,y3,x4,y4);
        System.out.println("length of the line 2 is "+l2);

        LineComparison_Oops obj=new LineComparison_Oops();
        obj.lineEquality(l1,l2);
        obj.LineCompare(l1,l2);
    }
}
