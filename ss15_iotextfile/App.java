package ss15_iotextfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source file: ");
        String sourceFile = scanner.nextLine();

        System.out.println("Enter the target file coppy: ");
        String sourceTarget = scanner.nextLine();

        BufferedInputStream bind = null;
        BufferedOutputStream bindOut = null;
    }
}
