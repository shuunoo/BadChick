package bank;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long soTk;
    private String tenTk;
    private double soTienTK;

    Scanner sc = new Scanner(System.in);

    public Account() {
    }

    public Account(long soTk, String tenTk, double soTienTK) {
        this.soTk = soTk;
        this.tenTk = tenTk;
        this.soTienTK = soTienTK;
    }

    public long getSoTk() {
        return soTk;
    }

    public void setSoTk(long soTk) {
        this.soTk = soTk;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public double getSoTienTK() {
        return soTienTK;
    }

    public void setSoTienTK(double soTienTK) {
        this.soTienTK = soTienTK;
    }

    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTK);
        return "Account{" +
                "soTk=" + soTk +
                ", tenTk='" + tenTk + '\'' +
                ", soTienTK=" + soTienTK +
                ", sc=" + sc +
                '}';
    }

    public double napTien() {
        double nap;
        System.out.println("Nhập số tiền bạn cần nạp :");
        nap = sc.nextDouble();
        if (nap > 0) {
            soTienTK += nap;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản");
        } else {
            System.out.println(" số tiền nạp không hợp lệ");
        }
        return nap;
    }

    public double rutTien() {
        double rut;
        double phi = 3;
        System.out.println("nhập số tiền bạn cần rút :");
        rut = sc.nextDouble();
        if (rut <= (soTienTK - phi)) {
            soTienTK -= (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("bạn vừa rút " + rut + " từ tài khoản. phí rút là $3");
        } else {
            System.out.println("số tiền muốn rút không hợp lệ !");
        }
        return rut;
    }

    public double daoHan() {
        double laiSuat = 0.055;
        soTienTK = soTienTK + soTienTK * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTK);
        System.out.println("bạn vùa được " + str1 + "từ đáo hạn 1 tháng");
        return soTienTK;
    }

    public void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTK);
        System.out.printf("%-10d %-20s %-20s \n", soTk, tenTk, str1);
    }

}


