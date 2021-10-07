package bai15;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean checkInput = true; // biến này để kiểm tra user nhập hợp lệ hay không
        int id = 0;
        Scanner sc = new Scanner(System.in); // Khởi tạo luồng nhập từ bàn phím
        do {
            try {
                System.out.print("Hay nhap ID: ");
                id = sc.nextInt(); // Ở bước này nếu user nhập chữ thì sẽ gây ra ngọai lệ,luồng thực thi chương trình
                // sẽ nhảy vào khối catch ở dưới
                checkInput = true;
            } catch (Exception e) {
                checkInput = false;
                sc.nextLine(); // Dòng này để đọc ký tự Enter lúc nhập, thực ra Enter sẽ gồm 2 ký tự trở về đầu dòng và
                // sinh dòng mới, bạn tra bảng mã Ascii sẽ rõ.
            }

        } while (!checkInput);
        System.out.println("ID là: " + id);
    }
}
