package btap7;

public class NhanVienPartTime extends NhanVien {
    private int soGioLamViec;
    public NhanVienPartTime(String hoTen, int soGioLamViec) {
        super(hoTen);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }


    @Override
    public double tinhLuong() {
        return soGioLamViec * 40000; //
    }

}
