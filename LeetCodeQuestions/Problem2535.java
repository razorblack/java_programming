public class Problem2535 {
    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{1,15,6,3}));
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            digitSum += digitsSum(nums[i]);
        }

        return Math.abs(elementSum - digitSum);

    }

    public static int digitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
