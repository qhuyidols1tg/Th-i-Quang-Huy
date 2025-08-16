public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNV, String ten, int tuoi, String email, String soDienThoai, double tienThuong, double luongCoBan) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.tienThuong = tienThuong;
        this.luongCoBan = luongCoBan;
    }
    public void tinhLuong(){
        System.out.println(this.luongCoBan + this.tienThuong);
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
}
