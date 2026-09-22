package Week3;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] dimens = {{12, 23, 2}, {122, 324, 32}};

        for (int i = 0; i < dimens.length; i++) {
            for (int j = 0; j < dimens[i].length; j++) {
                System.out.print(dimens[i][j] + " ");
            }
            System.out.println();
        }
    }
}