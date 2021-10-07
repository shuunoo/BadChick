import bank.Account;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void nhapTK(Account tk) {
        System.out.println("nhập số tài khoản :");
        tk.setSoTk(sc.nextLong());
        sc.nextLine();
        System.out.println("nhập tên tài khoản");
        tk.setTenTk(sc.nextLine());
        tk.setSoTienTK(50);
    }

    public static void main(String[] args) {
        Account a[] = null;
        int k, b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì :");
            System.out.println("1.Nhập thông tin của các khách hàng\n" +
                    "2.Xuất danh sách thông tin của các khách hàng\n" + "3.Nạp tiền\n" + "4.Rút tiền\n" +
                    "5.Đáo hạn\n" + "6.Chuyển khoản\n" + "Số khác để thoát");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Nhập số lượng khách hàng bạn muốn nhập:");
                    n = sc.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khách hàng số" + (i + 1));
                        a[i] = new Account();
                        nhapTK(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", " Số TK", "Tên TK", "Số tiền trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 3:
                    System.out.println("Nhập số tài khoản khách hàng nạp tiền");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản " + d);
                            a[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập số tài khoản khách hàng rút tiền:");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản:" + d);
                            a[i].rutTien();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhập số tài khoản đáo hạn:");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản :" + d);
                            a[i].daoHan();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    double chuyen, nhan, tienChuyen;
                    System.out.println("Nhập số tài khoản khách hàng chuyển tiền");
                    s = sc.nextLong();
                    System.out.println("Nhập số tài khoản khách hàng nhận tiền");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTk();
                        if (s == d) {
                            chuyen = a[i].getSoTienTK();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getSoTk();
                                if (c == f) {
                                    nhan = a[j].getSoTienTK();
                                    System.out.println("Nhập số tiền cần chuyển");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen -= tienChuyen;
                                        nhan += tienChuyen;
                                        a[i].setSoTienTK(chuyen);
                                        a[j].setSoTienTK(nhan);
                                        System.out.println("Tài khoản số" + d + "Vừa chuyển :$" + tienChuyen);
                                        System.out.println("Tài khoản số" + f + "Vừa nhận: $ " + tienChuyen);
                                    } else {
                                        System.out.println("Số tiền nhập không hợp lệ !");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("bye!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
