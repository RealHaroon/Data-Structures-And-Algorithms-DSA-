package DataStructuresAndAlogorithms;
class Periodic2DArrayOperations {

    public static int[][] periodicOperation(int[][] arr, int period, java.util.function.BinaryOperator<Integer> operation) {
        if (arr == null || period <= 0 || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Invalid input array or period");
        }

        int rows = arr.length;
        int cols = arr[0].length;
        int[][] result = new int[rows][cols];

        // Perform periodic operation within each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = arr[i][j];
                for (int k = j + period; k < cols; k += period) {
                    value = operation.apply(value, arr[i][k]);
                }
                result[i][j] = value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int period = 2;

        // Periodic Addition
        int[][] resultAdd = periodicOperation(arr.clone(), period, (x, y) -> x + y);
        System.out.println("Periodic Addition:");
        for (int[] row : resultAdd) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // Periodic Subtraction
        int[][] resultSub = periodicOperation(arr.clone(), period, (x, y) -> x - y);
        System.out.println("Periodic Subtraction:");
        for (int[] row : resultSub) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}

