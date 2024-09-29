package btap5;

public class HinhTruTron  extends HinhTron{
    private double chieuCao;

    public HinhTruTron( Double banKinh,Double chieuCao) {
        super(banKinh);
        if (chieuCao < 0){
            this.chieuCao = 0;
        }else {
            this.chieuCao = chieuCao;
        }
    }


    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        if (chieuCao < 0) {
            this.chieuCao = 0;
        } else {
            this.chieuCao = chieuCao;
        }
    }
    public double theTich() {
        return dienTich() * chieuCao;
    }
    public void hienThiThongTin() {
        System.out.println("Hình trụ tròn có bán kính: " + getBanKinh() + ", chiều cao: " + chieuCao + ", thể tích: " + theTich());
    }

}
