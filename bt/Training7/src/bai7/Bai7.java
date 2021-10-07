package bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mật khẩu: ");
        String str = scan.nextLine();
        int len = str.length();
        int digit = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int count = 0;
        char ch;
        if (len >= 6) {

            while (count < len) {

                ch = str.charAt(count);
                if (Character.isDigit(ch)) {
                    digit = digit + 1;
                }

                if (Character.isLowerCase(ch)) {

                    lowerCase = lowerCase + 1;
                }
                if (Character.isUpperCase(ch)) {

                    upperCase = upperCase + 1;
                }
                count = count + 1;
            }
        }
        if (digit >= 1 && lowerCase >= 1 && upperCase >= 1) {
            System.out.println("Mật khẩu hợp lệ");

        } else {

            System.out.println("Mật khẩu không hợp lệ");
        }
    }
}