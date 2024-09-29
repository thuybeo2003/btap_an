package btap2;

public class NganHang {
    private String soTaiKhoan;
    private double soDu;
    private String tenKhachHang;
    private String email;
    private String soDienThoai;

    public NganHang() {
    }

    public NganHang(String soTaiKhoan, double soDu, String tenKhachHang, String email, String soDienThoai) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
        this.tenKhachHang = tenKhachHang;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi tiền thành công. Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }
    public void rutTien(double soTien) {
        if (soTien > 0 && soDu >= soTien) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công. Số dư hiện tại: " + soDu);
        } else if (soTien > 0 && soDu < soTien) {
            System.out.println("Số dư không đủ để rút số tiền này.");
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }

}
