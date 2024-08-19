public class Problem2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }

    // Time On Space O1
    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String operation : operations) {
            if (operation.contains("+")) {
                count++;
            } else {
                count--;
            }
        }

        return count;
    }
}
