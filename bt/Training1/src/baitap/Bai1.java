package baitap;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Số chia hết cho 7 hoặc 17 là :");
        for (int i = 17; i <= 1000; i++) {
            if ((i % 17 == 0 || i % 7 == 0) && (i % 5 != 0 && i % 3 != 0)) {
                System.out.print(i + ",");
            }
        }
    }
}
