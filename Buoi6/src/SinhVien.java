public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lopHoc;

    public SinhVien(String maSV, String hoTen, double diemTB, LopHoc lopHoc) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lopHoc = lopHoc;
    }
    public void inThongTin(){
        System.out.println("Mã sinh viên: " + this.maSV + "Tên : " + this.hoTen + "Điểm trung bình: " + this.diemTB + lopHoc.inThongTin());
    }
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }
}
