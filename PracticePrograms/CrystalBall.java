/**
 * 2 crystal balls that will break if dropped from high enough distance
 * find the exact spot in which it will break in the most optimized way
 */
public class CrystalBall {

    public static int twoCrystalBalls(boolean[] breaks) {
        int jump = (int) Math.sqrt(breaks.length);

        int i = jump;
        for (; i < breaks.length; i = i + jump) {
            if (breaks[i]) {
                break;
            }
        }

        for (int j = i - jump; j < i; j++) {
            if (breaks[j]) {
                return j;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(twoCrystalBalls(new boolean[]{false, false, false, false, false, true, true}));
    }
}
