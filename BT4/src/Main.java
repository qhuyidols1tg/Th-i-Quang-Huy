import java.util.Scanner;
import Buoi4.Bai1;
import Buoi4.Bai2;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai1[] ds = new Bai1[5];
                for (int i = 0; i < ds.length; i++) {
                    System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                    ds[i] = new Bai1();
                    ds[i].nhap();
                }
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n",
                        "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Tiết nghỉ");

                for (Bai1 sv : ds) {
                    sv.xuat();
                }
            }
}
