package Buoi4;
import java.util.*;
public class Bai2 {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Bai1> ds = new ArrayList<>();

        public static void main(String[] args) {
            int choice;
            do {
                System.out.println("\n-------- Quản Lý Sinh Viên --------");
                System.out.println("1. Thêm sinh viên mới");
                System.out.println("2. Sửa thông tin sinh viên");
                System.out.println("3. Sắp xếp sinh viên theo tuổi");
                System.out.println("4. Sắp xếp sinh viên theo GPA");
                System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
                System.out.println("6. Xóa sinh viên khỏi danh sách");
                System.out.println("0. Thoát");
                System.out.print("Chọn chức năng: ");
                choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {
                    case 1 -> themSinhVien();
                    case 2 -> suaSinhVien();
                    case 3 -> sapXepTheoTuoi();
                    case 4 -> sapXepTheoGPA();
                    case 5 -> sapXepTheoTietNghi();
                    case 6 -> xoaSinhVien();
                    case 0 -> System.out.println("Đã thoát chương trình.");
                    default -> System.out.println("Lựa chọn không hợp lệ!");
                }
            } while (choice != 0);
        }

        static void themSinhVien() {
            Bai1 sv = new Bai1();
            sv.nhap();
            ds.add(sv);
        }

        static void suaSinhVien() {
            System.out.print("Nhập tên sinh viên cần sửa: ");
            String ten = sc.nextLine();
            for (Bai1 sv : ds) {
                if (sv.getName().equalsIgnoreCase(ten)) {
                    System.out.println("Nhập lại thông tin:");
                    sv.nhap();
                    return;
                }
            }
            System.out.println("Không tìm thấy sinh viên!");
        }

        static void sapXepTheoTuoi() {
            ds.sort(Comparator.comparingInt(Bai1::Tuoi));
            hienThiDanhSach();
        }

        static void sapXepTheoGPA() {
            ds.sort((a, b) -> Double.compare(b.GPA(), a.GPA())); // giảm dần
            hienThiDanhSach();
        }

        static void sapXepTheoTietNghi() {
            ds.sort((a, b) -> Integer.compare(b.getTietNghi(), a.getTietNghi())); // giảm dần
            hienThiDanhSach();
        }

        static void xoaSinhVien() {
            System.out.print("Nhập tên sinh viên cần xóa: ");
            String ten = sc.nextLine();
            Iterator<Bai1> it = ds.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equalsIgnoreCase(ten)) {
                    it.remove();
                    System.out.println("Đã xóa sinh viên " + ten);
                    return;
                }
            }
            System.out.println("Không tìm thấy sinh viên!");
        }

        static void hienThiDanhSach() {
            if (ds.isEmpty()) {
                System.out.println("Danh sách trống.");
                return;
            }

            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n",
                    "Ten", "Tuoi", "Dia chi", "TX1", "TX2", "KTHP", "GPA", "Tiet nghi");
            for (Bai1 sv : ds) {
                sv.xuat();
            }
        }
    }
