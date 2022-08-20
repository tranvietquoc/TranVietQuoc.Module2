package ss12_thuattoantimkiem;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchString {
    static LinkedList<Character> searchStringAscending(String string) {
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = sc.nextLine();
        System.out.println("The string after search String Ascending: ");
        for (char c : searchStringAscending(string)) {
            System.out.print(c + "\t");
        }
    }
}
