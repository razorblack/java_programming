public class Problem74 {
    public static void main(String[] args) {
//        System.out.println(searchMatrix2(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3));
        System.out.println(searchMatrix2(new int[][]{{1, 1}}, 2));

    }


    /**
     * Approach: Linear searching
     * Time O(m*n) -> O(n^2)
     * Space Input O(m * n) -> O (n ^ 2)
     * Space Auxiliary O2
     * @param matrix Input matrix
     * @param target target number
     * @return true if target is found, false otherwise
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Approach: Optimised linear search only in probable row
     * Time O(m + n) -> O(n)
     * Space Input O(m * n) -> O (n ^ 2)
     * Space Auxiliary O2
     * @param matrix Input matrix
     * @param target target number
     * @return true if target is found, false otherwise
     */
    public static boolean searchMatrix1(int[][] matrix, int target) {
        // Finding the row
        int rowIndex = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0]) {
                rowIndex = i;
            }
        }

        if (rowIndex == -1) {
            return false;
        }

        // Finding the target in the row
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[rowIndex][i] == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * Approach: Optimised search using Binary Search as rows are sorted
     * Time O(log m + log n) -> O(log m * n)
     * Space Input O(m * n) -> O (n ^ 2)
     * Space Auxiliary O2
     * @param matrix Input matrix
     * @param target target number
     * @return true if target is found, false otherwise
     * Another approach: Can also be done in log (m * n), Consider 2D matrix to be a single array with logic
     * of index > n to fall to next row
     */
    public static boolean searchMatrix2(int[][] matrix, int target) {
        // Finding the row
        int rowIndex = -1;
        int start = 0;
        int end = matrix.length - 1;

        while (start <= end) {
                int mid = (start + end) / 2;
                if (target == matrix[mid][0]) {
                    return true;
                } else if (target > matrix[mid][0]) {
                    rowIndex = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
        }

        if (rowIndex == -1) {
            return false;
        }

        // Finding the target in the row
        start = 0;
        end = matrix[rowIndex].length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == matrix[rowIndex][mid]) {
                return true;
            } else if (target > matrix[rowIndex][mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
