package btap1;

public class SinhVien {
    private String maSv;
    private String tenSv;
    private int namSinh;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSv, String tenSv, int namSinh, double diem) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public void hienThiThongTin() {
        System.out.println("Mã sinh viên: " + maSv + ", Họ tên: " + tenSv + ", Năm sinh: " + namSinh + ", Điểm: " + diem);
    }
}
