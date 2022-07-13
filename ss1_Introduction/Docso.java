import java.util.Scanner;

public class Docso {
    public static String docSo (int number) {
        String doc = "";
        switch (number) {
            case 0:
                doc = "Zero";
                break;
            case 1:
                doc = "One";
                break;
            case 2:
                doc = "Two";
                break;
            case 3:
                doc = "Three";
                break;
            case 4:
                doc = "Four";
                break;
            case 5:
                doc = "Five";
                break;
            case 6:
                doc = "Six";
                break;
            case 7:
                doc = "Seven";
                break;
            case 8:
                doc = "Eight";
                break;
            case 9:
                doc = "Nine";
                break;
            case 10:
                doc = "Ten";
        }
        return doc;
    }

    public static String docHaiChuSo (int number) {
        String docHaiChuSo = "";
        switch (number) {
            case 0:
                docHaiChuSo = "";
                break;
            case 1:
                docHaiChuSo = "One";
                break;
            case 2:
                docHaiChuSo = "Twenty";
                break;
            case 3:
                docHaiChuSo = "Thirty";
                break;
            case 4:
                docHaiChuSo = "Fourty";
                break;
            case 5:
                docHaiChuSo = "Fifty";
                break;
            case 6:
                docHaiChuSo = "Sixty";
                break;
            case 7:
                docHaiChuSo = "Seventy";
                break;
            case 8:
                docHaiChuSo = "Eighty";
                break;
            case 9:
                docHaiChuSo = "Ninety";
                break;
        }
        return docHaiChuSo;
    }

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        number = scanner.nextInt();

        if (number >= 0 && number <= 10) {
            System.out.println(docSo(number));
        }else if (number >=10 && number <20) {
            switch (number) {
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                default:
                    int ten = number/10;
                    System.out.println(docSo(ten) + "teen");
            }

        } else if (number >= 20 && number < 100) {
            int ten = number/10;
            int donvi = number%10;
            System.out.println(docHaiChuSo(ten)+docSo(donvi));

        } else if(number>=100 && number <1000){
            int hundred = number/100;
            int ten = (number%100)/10;
            int donvi=(number%100)%10;

            if(number<=119){
                System.out.println(docSo(hundred)+" Hundred And " + docSo(donvi)+ "teen");
            }
            else{
                System.out.println(docSo(hundred)+" Hundred And " + docHaiChuSo(ten) +" "+docSo(donvi));
            }
        }
        else{
            System.out.println(" Out of ability ");
        }
    }
}