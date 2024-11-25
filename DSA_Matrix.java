package DataStructuresAndAlogorithms;


    public class DSA_Matrix {

        public static boolean isScalarMatrix(int[][] matrix) {
            // Check if all elements are the same
            int scalar = matrix[0][0];
            for (int[] row : matrix) {
                for (int element : row) {
                    if (element != scalar) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isTriangularMatrix(int[][] matrix) {
            // Check for upper triangular matrix
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isDiagonalMatrix(int[][] matrix) {
            // Check if all non-diagonal elements are zero
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i != j && matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isSymmetricMatrix(int[][] matrix) {
            // Check if the matrix is equal to its transpose
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isAsymmetricMatrix(int[][] matrix) {
            // Check if the matrix is not equal to its transpose
            return !isSymmetricMatrix(matrix);
        }

        public static boolean isIdempotentMatrix(int[][] matrix) {
            // Check if multiplying the matrix by itself yields the same matrix
            int[][] result = multiplyMatrices(matrix, matrix);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] != result[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isSquareMatrix(int[][] matrix) {
            // Check if the number of rows is equal to the number of columns
            return matrix.length == matrix[0].length;
        }

        public static boolean isHermitianMatrix(int[][] matrix) {
            // Check if the matrix is equal to its conjugate transpose
            // (For real matrices, it's the same as being symmetric)
            return isSymmetricMatrix(matrix);
        }

        public static boolean isPeriodicMatrix(int[][] matrix) {
            // Check if the matrix raised to a power greater than 1 yields the identity matrix
            int[][] identity = createIdentityMatrix(matrix.length);
            int[][] power = multiplyMatrices(matrix, matrix);
            int[][] result = multiplyMatrices(power, matrix);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (identity[i][j] != result[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isNilpotentMatrix(int[][] matrix) {
            // Check if the matrix raised to a power greater than 1 yields the zero matrix
            int[][] power = multiplyMatrices(matrix, matrix);
            if (isZeroMatrix(power)) {
                return true;
            }
            int[][] result = multiplyMatrices(power, matrix);
            return isZeroMatrix(result);
        }

        public static boolean isZeroMatrix(int[][] matrix) {
            // Check if all elements are zero
            for (int[] row : matrix) {
                for (int element : row) {
                    if (element != 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        // Helper method to multiply two matrices
        private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
            int rows1 = matrix1.length;
            int cols1 = matrix1[0].length;
            int cols2 = matrix2[0].length;

            int[][] result = new int[rows1][cols2];

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            return result;
        }

        // Helper method to create an identity matrix
        private static int[][] createIdentityMatrix(int size) {
            int[][] identity = new int[size][size];
            for (int i = 0; i < size; i++) {
                identity[i][i] = 1;
            }
            return identity;
        }
        public static void main(String[] args) {
            int[][] matrix = {{0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0}};

            System.out.println("Is scalar matrix? " + isScalarMatrix(matrix));
            System.out.println("Is triangular matrix? " + isTriangularMatrix(matrix));
            System.out.println("Is diagonal matrix? " + isDiagonalMatrix(matrix));
            System.out.println("Is symmetric matrix? " + isSymmetricMatrix(matrix));
            System.out.println("Is asymmetric matrix? " + isAsymmetricMatrix(matrix));
            System.out.println("Is idempotent matrix? " + isIdempotentMatrix(matrix));
            System.out.println("Is square matrix? " + isSquareMatrix(matrix));
            System.out.println("Is Hermitian matrix? " + isHermitianMatrix(matrix));
            System.out.println("Is periodic matrix? " + isPeriodicMatrix(matrix));
            System.out.println("Is nilpotent matrix? " + isNilpotentMatrix(matrix));
            System.out.println("Is zero matrix? " + isZeroMatrix(matrix));
        }
    }

