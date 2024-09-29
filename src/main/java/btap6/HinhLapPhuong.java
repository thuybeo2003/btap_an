package btap6;

public class HinhLapPhuong extends HinhChuNhat{
    private double chieuCao;
    public HinhLapPhuong(double chieuDai, double chieuRong, double chieuCao) {
        super(chieuDai, chieuRong);
        if (chieuCao < 0) {
            this.chieuCao = 0;
        } else {
            this.chieuCao = chieuCao;
        }
    }

    // Getter và Setter cho chiều cao
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
        return dienTich() * chieuCao; //
    }


    public void hienThiThongTin() {
        System.out.println("Hình lập phương có chiều dài: " + getChieuDai() + ", chiều rộng: " + getChieuRong() +
                ", chiều cao: " + chieuCao + ", thể tích: " + theTich());
    }

}
