
import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public QuanLy() {
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập mã Quản lý: ");
        maQL = sc.nextLine();
        System.out.print("\n Nhập họ và tên Quản lý: ");
        hoTen = sc.nextLine();
    }
    public void xuat(){
        System.out.print("\n Mã Quản lý: " + maQL + "\n Họ và Tên: " + hoTen);
    }
}
