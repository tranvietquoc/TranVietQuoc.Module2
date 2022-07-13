package ss1_Introduction;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị VNĐ: "+ quydoi);
    }
}
