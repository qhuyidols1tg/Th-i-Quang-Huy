package Buoi4;
import java.util.Scanner;
import java.time.Year;
public class Bai1 {
    //Xây dựng lớp Student có các thuộc tính:
//Tên
//Năm sinh
//Địa chỉ
//Điểm tx1
//Điểm tx2
//Điểm KTHP
//Số tiết nghỉ
//Ở lớp Main xây dựng 5 đối tượng in ra dạng bảng có kiểu sau đây :
//
//Tên    Tuổi      Địa chỉ   Điểm TX1     Điểm TX2     Điểm KTHP    Điểm GPA  Số tiết nghỉ
//
//Tuổi = năm hiện tại - năm sinh
//Điểm GPA = (TX1*0.2 + TX2 * 0.3 + KTHP* 0.5)
//
//yêu cầu các thuộc tính được đóng gói cao nhất
    private String name;
    private int year;
    private String dc;
    private double tx1;
    private double tx2;
    private double kthp;
    private int tietNghi;

    public Bai1() {
        this.dc = dc;
        this.kthp = kthp;
        this.name = name;
        this.tietNghi = tietNghi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public int getTietNghi() {
        return tietNghi;
    }

    public void setTietNghi(int tietNghi) {
        this.tietNghi = tietNghi;
    }

    public int Tuoi() {
        int namHienTai = Year.now().getValue();
        return namHienTai - this.year;
    }

    public double GPA() {
        return (this.tx1 * 0.2 + this.tx2 * 0.3 + this.kthp * 0.5);
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten:");
        name = sc.nextLine();
        System.out.print("Nhap nam sinh:");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi:");
        dc = sc.nextLine();
        System.out.print("Nhap tx1:");
        tx1 = sc.nextDouble();
        System.out.print("Nhap tx2:");
        tx2 = sc.nextDouble();
        System.out.print("Nhap kthp:");
        kthp = sc.nextDouble();
        System.out.print("Nhap so tiet nghi:");
        tietNghi = sc.nextInt();
    }
    public void xuat(){

        System.out.printf("%-15s %-15d %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15d %n", name,Tuoi(),dc, tx1, tx2, kthp,GPA(), tietNghi);
    }
}
