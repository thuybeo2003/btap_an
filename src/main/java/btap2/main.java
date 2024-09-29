package btap2;

public class main {
    public static void main(String[] args) {
        NganHang tk = new NganHang("12345",50000,"ThuyPeo","nmthuy03@gmail.com","0362965179");
        System.out.println("Số tài khoản: " + tk.getSoTaiKhoan());
        System.out.println("Tên khách hàng: " + tk.getTenKhachHang());
        System.out.println("Số dư ban đầu: " + tk.getSoDu());
        tk.guiTien(2000);
        tk.rutTien(1000);
        tk.rutTien(100000);
    }
}
