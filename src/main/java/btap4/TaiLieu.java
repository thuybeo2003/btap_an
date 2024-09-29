package btap4;

public class TaiLieu {
    private String tenTaiLieu;
    private TacGia tacGia;
    private int namXuatBan;

    public TaiLieu() {
    }

    public TaiLieu(String tenTaiLieu, TacGia tacGia, int namXuatBan) {
        this.tenTaiLieu = tenTaiLieu;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public void hienThiThongTin() {
        System.out.println("Tài liệu " + tenTaiLieu + " của tác giả " + tacGia.getHoTen() +
                " được xuất bản vào năm " + namXuatBan + ".");
    }
}
