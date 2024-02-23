package com.java;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i=0;i<size;i++){
            int value = scanner.nextInt();
            if(value == 0){
                System.out.println(0);
                continue;
            }
            while (value !=0){
                int mynum = value % 10;
                System.out.print(mynum + " ");
                value /= 10;
            }
            System.out.println();

        }

    }
}

