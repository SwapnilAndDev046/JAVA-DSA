package IfElseConditions;
import java.util.Scanner;
public class divisibleORnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 5 == 0)
        {
            System.out.println("divisible by 5 ");

        }
        else {
            System.out.println("not divisible by 56");
        }
    }
}
