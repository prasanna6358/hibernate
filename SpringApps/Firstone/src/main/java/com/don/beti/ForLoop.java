package com.don.beti;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("enter the name");
        Scanner sc =new Scanner(System.in);
        String reverse =sc.nextLine();
        char a[] = reverse.toCharArray();
        int length= a.length;
        for(int i=length-1;i>=0;i--)
            System.out.print(a[i]);
    }
}

