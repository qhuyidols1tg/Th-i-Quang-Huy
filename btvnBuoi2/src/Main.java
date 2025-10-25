import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("\n--- Menu ---");
        System.out.println("1. Tính tổng các phần tử trong mảng");
        System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
        System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần");
        System.out.println("4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra \"Không có\")");
        System.out.print("Nhập lựa chọn: ");
        int chon = sc.nextInt();

        switch (chon) {
            case 1:
                System.out.println("Tổng các phần tử = " + Utils.tinhTong(a));
                break;
            case 2:
                System.out.println("Lớn nhất = " + Utils.timMax(a));
                System.out.println("Nhỏ nhất = " + Utils.timMin(a));
                break;
            case 3:
                Utils.sapXepTangDan(a);
                break;
            case 4:
                Utils.soNguyenToLonNhat(a);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
