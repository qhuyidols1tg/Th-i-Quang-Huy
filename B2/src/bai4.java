package Buoi_2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mangSo = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap mangSo[" + (i + 1) + "] = ");
            mangSo[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu vua nhap la: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mangSo[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += mangSo[i];
        }
        System.out.println("tong cac phan tu vua nhap la:  " + sum);
        int max = mangSo[0];
        for (int i = 0; i < 5; i++) {
            if (mangSo[i] > max) {
                max = mangSo[i];
            }
        }
        System.out.println("gia tri lon nhat trong mang la: " + max);
    }
}