package ss15_iotextfile;

import java.io.IOException;
import java.util.Scanner;

public class AppProduct {
    public static void main(String[] args) throws IOException {
        ControllData controll = new ControllData();

        // create product
        /**
         Product product1 = new Product("AD123", "JavaBook", 120000, "Mo ta...");
         Product product2 = new Product("AD1a",  "JavaBwook", 120000, "Mo ta...");
         Product product3 = new Product("AD3",   "JavaBoaok",  120000, "Mo ta...");
         try {
         controll.save(product1);
         controll.save(product2);
         controll.save(product3);
         } catch (IOException e) {
         e.printStackTrace();
         }
         */

        // Search
        controll.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search name product: ");
        String name     = scanner.nextLine();
        try {
            Product pSearch = controll.search(name);
            if (pSearch == null){
                System.out.println("Not found.");
            }else{
                pSearch.show();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
