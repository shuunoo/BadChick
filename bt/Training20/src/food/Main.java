package food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThucPham tp = new ThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhập mã hàng :");
        tp.setMaHang(sc.nextInt());
        sc.nextLine();
        do {
            System.out.println("Nhập tên hàng : ");
            tp.setTenHang(sc.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(sc.nextDouble());
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setHSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }
}
