package dagiac;

public class TamGiac extends DaGiac {

    public TamGiac() {
        a = new int[3];
        soCanh = 3;
    }

    public void nhap() {
        System.out.println("Nhập số cạnh cho tam giác");
        if (a[0] + a[1] <= a[2] || a[0] + a[2] <= a[1] || a[1] + a[2] <= a[0]) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Nhập cạnh thứ " + (i+1) + ":");
                a[i] = sc.nextInt();
            }
        }

    }

    public int tinhCV() {
        int cv = 0;
        for (int i = 0; i < 3; i++) {
            cv += a[i];
        }
        return cv;
    }

    @Override
    public double tinhDT() {
        double dt = 0;
        int A = a[0];
        int B = a[1];
        int C = a[2];
        double P = (A + B + C) / 2;
        dt = Math.sqrt(P * (P - A) * (P - B) * (P - C));
        return dt;
    }

    public void xuat() {
        super.inDaGiac();
    }
}


