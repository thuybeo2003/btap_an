package btap7;

public class NhanVienFullTime extends NhanVien {
    private int soNgayLamViec;
    public NhanVienFullTime(String hoTen, int soNgayLamViec) {
        super(hoTen);
        this.soNgayLamViec = soNgayLamViec;
    }


    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }


    @Override
    public double tinhLuong() {
        return soNgayLamViec * 500000; }

}
