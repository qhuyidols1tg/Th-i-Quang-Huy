import java.util.Scanner;

public class Main {
    public static class School {
        private String tenTruong;
        private String dateSchool;

        public School(String tenTruong, String dateSchool) {
            this.tenTruong = tenTruong;
            this.dateSchool = dateSchool;
        }

        public String getTenTruong() {
            return tenTruong;
        }

        public void setTenTruong(String tenTruong) {
            this.tenTruong = tenTruong;
        }

        public String getDateSchool() {
            return dateSchool;
        }

        public void setDateSchool(String dateSchool) {
            this.dateSchool = dateSchool;
        }
    }

    public static class Students {
        private String ten;
        private String lop;
        private Double diem;
        private Faculty y;

        public Students(String ten, String lop, Double diem, Faculty y) {
            this.ten = ten;
            this.lop = lop;
            this.diem = diem;
            this.y = y;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public Double getDiem() {
            return diem;
        }

        public void setDiem(Double diem) {
            this.diem = diem;
        }

        public Faculty getY() {
            return y;
        }

        public void setY(Faculty y) {
            this.y = y;
        }
        public void nhap() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập tên sinh viên: ");
                ten = sc.nextLine();
                System.out.print("Nhập lớp: ");
                lop = sc.nextLine();
                System.out.print("Nhập điểm số: ");
                diem = sc.nextDouble();
                sc.nextLine();
                System.out.println("Nhập thông tin khoa:");
                y.nhap();
            }
            public void xuat() {
                System.out.println("Tên sinh viên: " + ten);
                System.out.println("Lớp: " + lop);
                System.out.println("Điểm số: " + diem);

                System.out.println("Thông tin khoa và trường:");
                y.xuat();
            }
        }

    public static class Faculty {
        private String tenkhoa;
        private String date;
        private School x;

        public Faculty(String date, String tenkhoa, School x) {
            this.date = date;
            this.tenkhoa = tenkhoa;
            this.x = x;
        }

        public String getTenkhoa() {
            return tenkhoa;
        }

        public void setTenkhoa(String tenkhoa) {
            this.tenkhoa = tenkhoa;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public School getX() {
            return x;
        }

        public void setX(School x) {
            this.x = x;
        }
            public void nhap() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập tên sinh viên: ");
                tenkhoa = sc.nextLine();
                System.out.print("Nhập lớp: ");
                date = sc.nextLine();
                sc.nextLine();
                System.out.println("Nhập thông tin khoa:");
                x.nhap();
            }

            public void xuat() {
                System.out.println("Tên khoa: " + tenkhoa);
                System.out.println("Ngày vào khoa: " + date);
                x.xuat();
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear bộ nhớ đệm

        Students[] danhSachSinhVien = new Students[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin sinh viên thứ " + (i + 1) + " ---");
            danhSachSinhVien[i] = new Students();
            danhSachSinhVien[i].nhap();
        }
        System.out.println("\n===== DANH SÁCH SINH VIÊN =====");
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Thông tin sinh viên thứ " + (i + 1) + " ---");
            danhSachSinhVien[i].xuat();
        }

        sc.close();
    }
}
