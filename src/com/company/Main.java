package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n>0){
            int x = scan.nextInt();
            if (x>=80){
                System.out.printf("4 ");
            }
            else if (x>=75){
                System.out.printf("3.5 ");
            }
            else if (x>=70){
                System.out.printf("3 ");
            }
            else if (x>=65){
                System.out.printf("2.5 ");
            }
            else if (x>=60){
                System.out.printf("2 ");
            }
            else if (x>=55){
                System.out.printf("1.5 ");
            }
            else if (x>=50){
                System.out.printf("1 ");
            }
            else {
                System.out.printf("0 ");
            }
            n--;
        }
    }
}
