package IfElseConditions;

import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a b c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a < b && a > c)
        {
            System.out.println("a is greater");
        }
        else if(b > a && b > c)
        {
            System.out.println("b is grater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}
