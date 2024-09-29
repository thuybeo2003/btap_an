package btap7;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        NhanVien[] nhanViens = new NhanVien[5];
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(100) + 1;
            if (randomNum %2 !=0) {
                int ngayLamViec = random.nextInt(11) + 15;
                nhanViens[i] = new NhanVienFullTime("Nhan vien FullTime" + (i + 1), ngayLamViec);
            }else {
                int songLamViec = random.nextInt(121) + 80;
                nhanViens[i] = new NhanVienPartTime("Nhan vien PartTime" + (i + 1), songLamViec);
            }
        }
        for (NhanVien nv : nhanViens) {
            System.out.println("Ho ten: " + nv.getHoTen() + ", Luong: " + nv.tinhLuong() + " VND");
        }
    }
}
