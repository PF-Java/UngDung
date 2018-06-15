package LuyenTap;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a < 2){
            System.out.println(a+ " is not a prime");
        }
        else {
            int i = 2;
            boolean check = true;
            while ( i <= Math.sqrt(a)){
                if (a % i == 0){
                    check = false;
                    break;
                }
                i ++;
            }
            if (check){
                System.out.println( a + " is a prime");
            }
            else
                System.out.println( a + "is not a prime");
        }

    }
}
