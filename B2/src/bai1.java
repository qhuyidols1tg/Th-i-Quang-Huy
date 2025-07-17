package Buoi_2;

import java.util.Scanner;

    public class bai1 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten cua ban: ");;
            String name = sc.nextLine();
            System.out.println("Nhap tuoi cua ban: ");
            int tuoi = sc.nextInt();
            System.out.println("Nhap chieu cao cua ban: ");
            double cao = sc.nextDouble();
            System.out.println("Xin chao " + name + " " + tuoi +" tuoi va cao " + cao +" met");
        }
    }
