package com.bridgelabz_day8;

import java.util.Scanner;

public class LineComparison_Oops {

        static double length(int a1,int b1,int a2, int b2)
        {
            double l= Math.pow((a2-a1),2) + Math.pow((b2-b1),2);//Math.pow(i, 3);
            return l;
        }

        public static void main(String[] args) {

            System.out.println("enter the first co-ordinate of point x");
            Scanner a1=new Scanner(System.in);
            int x1=a1.nextInt();
            System.out.println("enter the second co-ordinate of point x");
            int y1=a1.nextInt();
            System.out.println("enter the first co-ordinate of point y");
            int x2=a1.nextInt();
            System.out.println("enter the second co-ordinate of point y");
            int y2=a1.nextInt();
            System.out.println("Co-ordinates of point x ie (x1="+x1+"and y1="+y1+")");
            System.out.println("Co-ordinates of point y ie (x2="+x2+"and y2="+y2+")");

            double l=length(x1,y1,x2,y2);

            System.out.println("length of the line 1 is "+Math.sqrt(l));

        }
    }

