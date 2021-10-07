package dagiac;

import java.util.Arrays;
import java.util.Scanner;

public abstract class DaGiac {
    protected int soCanh;
    protected int[] a;
    Scanner sc = new Scanner(System.in);

    public DaGiac() {
        this.soCanh = 0;
        this.a = null;
    }

    public DaGiac(int soCanh, int[] a, Scanner sc) {
        this.soCanh = soCanh;
        this.a = a;
        this.sc = sc;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    protected void nhap() {
        System.out.println("Nhập vào số cạnh:");
        soCanh = sc.nextInt();
        if (soCanh > 2) {
            for (int i = 0; i < soCanh; i++) {
                System.out.println("Nhập cạnh thứ" + (i++) + ":");
                a[i] = sc.nextInt();
            }
        }
    }

    protected int tinhCV() {
        int cv = 0;
        for (int i = 0; i < soCanh; i++) {
            cv += a[i];
        }
        return cv;
    }

    protected abstract double tinhDT();

    @Override
    public String toString() {
        return "DaGiac{" +
                "soCanh=" + soCanh +
                ", a=" + Arrays.toString(a) +
                '}';
    }

    protected void inDaGiac() {
        System.out.println("Độ dài các cạnh lần lượt là:");
        for (int i = 0; i < soCanh; i++) {
            if (i < (soCanh - 1)) {
                System.out.println(a[i] + "\t    \t");
            } else {
                System.out.println(a[i]);
            }
        }
        System.out.println("-------------end------------");
    }
}
