package btap6;

public class HinhChuNhat {
    private double chieuDai ;
    private double chieuRong ;



    public HinhChuNhat(double chieuDai, double chieuRong) {
       if(chieuDai < 0 || chieuRong < 0){
           this.chieuDai = 0;
           this.chieuRong = 0;
       }else{
           this.chieuDai = chieuDai;
           this.chieuRong = chieuRong;
       }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai < 0 ){
            this.chieuDai = 0;
        }else{
            this.chieuDai = chieuDai;
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
      if(chieuRong < 0 ){
          this.chieuRong = 0;
      }else {
          this.chieuRong = chieuRong;
      }
    }
    public double dienTich() {
        return chieuDai * chieuRong; }
    public void hienThiThongTin() {
        System.out.println("Hình chữ nhật có chiều dài: " + chieuDai + ", chiều rộng: " + chieuRong + ", diện tích: " + dienTich());
    }
}
