package LuyenTap;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = nhap.nextInt();
        System.out.print("Enter b: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0)
            System.out.println("No greatest common factor");
        else if (a == 0) {
            System.out.println("Greate common factor: " +b);
        }
             else if (b == 0){
            System.out.println("Greate common factor: " +a);
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greate common factor: " + a);
    }
}
