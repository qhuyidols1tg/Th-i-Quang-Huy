//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        double r = sc.nextDouble();
        System.out.println("Chu vi tam giac la: " + (2 * 3.14 * r) );
        System.out.println("Dien tich tam giac la: " + (3.14 * r *r));
        }
    }