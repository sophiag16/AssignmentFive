package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter no. of asterisks");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=-1;
        int spaceNum = num;

        while(num-->0)
        {
            count+=2;
            spaceNum--;
            int c=count;
            int sp = spaceNum;

            System.out.println("");
            while(sp-->0)
            {
                System.out.print(" ");
            }
            while(c-->0)
            {
                System.out.print("*");
            }
        }
    }
}
