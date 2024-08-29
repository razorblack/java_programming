public class Problem3242 {
    private int[][] grid;
    private int i;
    private int j;
    public static void main(String[] args) {
        Problem3242 obj = new Problem3242();
        obj.grid = new int[][]{{1,2,0,3}, {4,7,15,6}, {8,9,10,11}, {12,13,14,5}};
        int value = 15;
        int len = obj.grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (obj.grid[i][j] == value) {
                    obj.i = i;
                    obj.j = j;
                }
            }
        }
        System.out.println(obj.adjacentSum(value));
        System.out.println(obj.diagonalSum(9));
    }

    // Time O1 Time O1
    public int adjacentSum(int value) {
        int top = i != 0 ? grid[i - 1][j] : 0;
        int bottom = i != grid.length - 1 ? grid[i + 1][j] : 0;
        int left = j != 0 ? grid[i][j - 1] : 0;
        int right = j != grid.length - 1 ? grid[i][j +1] : 0;

        return top + bottom + left + right;
    }

    // Time O1 Space O1
    public int diagonalSum(int value) {
        int topLeft = i != 0 ? (j != 0 ? grid[i - 1][j - 1] : 0) : 0;
        int topRight = i != 0 ? (j != grid.length - 1 ? grid[i - 1][j + 1] : 0) : 0;
        int bottomLeft = i != grid.length - 1 ? (j != 0 ? grid[i + 1][j - 1] : 0) : 0;
        int bottomRight = i != grid.length - 1 ? (j != grid.length - 1 ? grid[i + 1][j + 1] : 0) : 0;

        return topLeft + topRight + bottomLeft + bottomRight;
    }
}
