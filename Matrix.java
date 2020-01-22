package homejobe;

public class Matrix {

    public static void main(String[] args) {

        int[][] matrixB = {
                {-9, 1, 0},
                {4, 1, 1},
                {-2, 2, -1}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

