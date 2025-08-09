
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May[] y;
    private Integer n;

    public PhongMay(Integer n, May[] y, QuanLy x, double dienTich, String tenPhong, String maPhong) {
        this.n = n;
        this.y = y;
        this.x = x;
        this.dienTich = dienTich;
        this.tenPhong = tenPhong;
        this.maPhong = maPhong;
    }

    public PhongMay() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập số lượng máy: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.print("\n Nhập mã Phòng: ");
        maPhong = sc.nextLine();
        System.out.print("\n Nhập tên Phòng: ");
        tenPhong = sc.nextLine();
        System.out.print("\n Nhập diện tích Phòng: ");
        dienTich = sc.nextDouble();
        sc.nextLine();
        x = new QuanLy();
        x.nhap();
    }

    public void nhapMay() {
        y = new May[n];
        for (int i=0; i<n; i++){
            y[i] = new May();
            y[i].nhap();;
        }
    }
    public void xuat(){
        System.out.print("\n Mã Phòng: " + maPhong + "\n Tên Phòng: " + tenPhong + "\n Diện tích Phòng: " + dienTich );
        x.xuat();
    }
    public void xuatMay(){
        for(int i=0; i<n; i++){
            y[i].xuat();
        }
    }
}
