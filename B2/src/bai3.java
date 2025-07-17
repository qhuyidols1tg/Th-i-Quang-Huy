
package Buoi_2;

import java.util.Scanner;

public class bai3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a = ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b = ");
        int b = sc.nextInt();
        System.out.println("Tong a + b = " + (a+b));
        System.out.println("Hieu a - b = " + (a-b));
        System.out.println("Tich a * b = " + (a*b));
        System.out.println("Thuong a / b = " + (a/b));
        System.out.println("ket qua phep chia lay du a % b = " + (a%b));
    }
}
