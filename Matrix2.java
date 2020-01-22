package homejobe;

public class Matrix2 {
    public static void main(String[] args) {

    int[][] matrixA;
    matrixA = new int[2][3];

    matrixA[0][0] = 1;
    matrixA[0][1] = 2;
    matrixA[0][2] = 3;
    matrixA[1][0] = 4;
    matrixA[1][1] = 1;
    matrixA[1][2] = 7;

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrixA[i][j] + "\t");
        }
        System.out.println();
    }
}
}

