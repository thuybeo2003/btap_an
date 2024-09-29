package btap3;

public class main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        System.out.println("Khoảng cách từ điểm p1 đến gốc tọa độ: " + p1.khoangcach());
        System.out.println("Khoảng cách từ điểm p1 đến tọa độ (7, 1): " + p1.khoangcach2(7, 1));
        Point p2 = new Point(3, 4);
        System.out.println("Khoảng cách từ điểm p1 đến điểm p2: " + p1.khoangcach1(p2));

    }
}
