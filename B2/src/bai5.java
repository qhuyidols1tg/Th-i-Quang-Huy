package Buoi_2;

public class bai5 {
    public static void main (String[] args){
        System.out.println("bang cuu chuong 5:");
        for (int i=1; i<=10; i++){
            System.out.println( "5 * "+ i + " = "+(5*i) );
        }
        int tong = 0;
        for (int i=1; i<=100; i++){
            if (i%2==0){
                tong += i;
            }
        }
        System.out.println("tong cac so chan tu 1 den 100 la: " +tong);
    }
}