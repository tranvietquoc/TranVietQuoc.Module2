import java.util.Scanner;

public class Ungdungchuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD :");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Giá trị VND: "+quydoi);
    }
}
