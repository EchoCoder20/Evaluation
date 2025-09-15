public class TeenNumberChecker {
    public static boolean loneTeen(int age1, int age2) {
        return isTeen(age1) ^ isTeen(age2);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
