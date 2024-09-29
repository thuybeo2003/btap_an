package btap5;

public class HinhTron {
    private double banKinh;

    public HinhTron(Double banKinh) {
        if (banKinh < 0) {
            this.banKinh = 0;
        } else {
            this.banKinh = banKinh;
        }
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh < 0) {
            this.banKinh = 0;
        } else {
            this.banKinh = banKinh;
        }
    }
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }
    public void hienThiThongTin() {
        System.out.println("Hình tròn có bán kính: " + banKinh + ", diện tích: " + dienTich());
    }
}
