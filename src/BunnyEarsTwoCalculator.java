public class BunnyEarsTwoCalculator {
    public int countBunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 != 0) {
            return 2 + countBunnyEars(bunnies - 1);
        } else {
            return 3 + countBunnyEars(bunnies - 1);
        }
    }
}