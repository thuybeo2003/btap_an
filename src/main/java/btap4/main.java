package btap4;

public class main {
    public static void main(String[] args) {
        TacGia tacGia1 = new TacGia("ThuyPeo", 2003);
        TaiLieu taiLieu1 = new TaiLieu("Ve 1 nha", tacGia1, 2024);


        taiLieu1.hienThiThongTin();
    }
}
