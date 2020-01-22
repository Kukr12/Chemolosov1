package homejobe;

import java.util.Scanner;

public class Gerlanda3 {
    public static void main(String[] args) {
        int gerlanda = (int) (Math.random() * 1000);
        System.out.println("Gerlanda" + Integer.toBinaryString(gerlanda));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер действия: ");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                blink(gerlanda);
                break;
            case 2:
                moveGerlanda(gerlanda);
                break;
            case 3:
                onOrOff(gerlanda);
                break;
            default:
                System.out.println("Вы ввели не правельное дествие");
        }
    }

    private static void blink(int gerlanda) {
        for (int i = 0; i < 5; i++) {
            gerlanda = ~gerlanda;
            System.out.println("Blink " + Integer.toBinaryString(gerlanda));
        }
    }

    private static void moveGerlanda(int gerlanda) {
        for (int i = 0; i < 5; i++) {
            int g = gerlanda << 1;
            System.out.println("Move Gerlanda " + Integer.toBinaryString(g));
        }
    }

    private static void onOrOff(int gerlanda) {

        System.out.println(" Full light " + Integer.toBinaryString(gerlanda));
        int g = gerlanda & 1;
        if (g == 1) {
            System.out.println("Лампочка включаеться в одном положение " + g);
        } else {
            System.out.println("Лампочка выключаеться в другом положеие " + g);
        }
    }
}

