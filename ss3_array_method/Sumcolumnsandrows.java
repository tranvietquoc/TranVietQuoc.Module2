package ss3_array_method;

import java.util.Scanner;

public class Sumcolumnsandrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int dong = sc.nextInt();
        System.out.print("Nhap cot: ");
        int cot = sc.nextInt();

        int[][] arr = new int [dong][cot];
        System.out.print("Nhap gia tri: ");
        //nhap gia tri cua mang
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.print("\narr["+i+"]["+j+"]: ");
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.print("\nMang da nhap la: ");
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.print("\narr["+i+"]["+j+"] = "+ arr[i][j]);
            }
            System.out.print("\n");
        }

        for (int i=0;i<dong;i++){
            int tong=0;
            for (int j=0;j<cot;j++){
                tong = tong+arr[j][i];
            }
            System.out.print("\nTong cac dong la: "+tong);
        }
    }
}
