package homejobe;

public class Tack {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        int result = 1;
        System.out.println("Число " + n);
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Факториал числа: " + result);
    }
}
