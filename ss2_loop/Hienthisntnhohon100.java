package ss2_loop;

public class Hienthisntnhohon100 {
    public static void main(String[] args) {
        for (int j = 1; j < 100; j++) {
            if (isPrime(j)){
                System.out.println(j + " ");
            }
        }
    }
    private static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i < x - 1; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
