package bai15;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soDien = 0;
        float tienDien = 0;
        boolean check = true;
        do {
            try {
                System.out.println("Nhập số điện");
                soDien = sc.nextFloat();
                check = true;
            }catch (Exception e){
                check = false;
                System.out.println("Nhập sai! Xin mời nhập lại");
                sc.nextLine();
            }
        } while (!check);
            if (soDien <= 50 && soDien > 0) {
                tienDien = soDien * 1000;
            } else if (soDien > 50 && soDien <= 100) {
                tienDien = (50 * 1000) +( soDien - 50) * 1200;
            } else if (soDien > 100 && soDien < 150) {
                tienDien = (50 * 1000) + (50 *1200) + ( soDien - 100) * 1500;
            } else if (soDien > 150 && soDien <= 200) {
                tienDien = (50 * 1000) + (50 * 1200) + (50 * 1500) + (soDien - 150) *1750;
            }else if (soDien > 200){
                tienDien = (50 * 1000) + (50 * 1200) + (50 * 1500) + (50 * 1750) +(soDien - 200) * 1800;
            }
        System.out.println("Tiền điện của bạn là :" + tienDien);
    }
}
