package bai11;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0;
        boolean check = true;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            do {
                try {
                    System.out.print("Nhập số thứ nhất:");
                    num1 = scanner.nextDouble();
                    check = true;
                } catch (Exception e) {
                    check = false;
                    System.out.println("Nhập sai! Xin mời nhập lại");
                    scanner.nextLine();
                }
            } while (!check);
            do {
                try {
                    System.out.print("Nhập số thứ hai:");
                    num2 = scanner.nextDouble();
                    check = true;
                } catch (Exception e) {
                    check = false;
                    System.out.println("Nhập sai! Xin mời nhập lại");
                    scanner.nextLine();
                }
            } while (!check);
            char operator;
            System.out.print("Mời bạn chọn phép tính(+, -, *, /): ");
            operator = scanner.next().charAt(0);
            double output;
            switch (operator) {
                case '+':
                    output = num1 + num2;
                    break;

                case '-':
                    output = num1 - num2;
                    break;

                case '*':
                    output = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Không thể thực hiện phép chia");
                    } else {
                        output = num1 / num2;
                        break;
                    }
                default:
                    System.out.printf("Nhập không đúng");
                    return;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
            System.out.println("Mời bạn chọn 1 để tiếp tục và chọn 2 để thoát ");
            System.out.println("(answer: " + answer);
            answer = scanner.nextInt();
            System.out.println("(read answer " + answer);
            check = answer != 2 ;
            System.out.println("------bye------");
        }
    }
}