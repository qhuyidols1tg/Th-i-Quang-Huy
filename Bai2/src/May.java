
import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public May() {
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.print("\n Nhập tên máy: ");
        tenMay = sc.nextLine();
        System.out.print("\n Nhập tình trạng: ");
        tinhTrang = sc.nextLine();

    }

    public void xuat(){
        System.out.print("\n Mã máy: " + maMay + "\n Tên máy: " + tenMay + "\n Tình trạng: " + tinhTrang);
    }
}
