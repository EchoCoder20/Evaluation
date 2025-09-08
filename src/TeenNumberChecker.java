public class TeenNumberChecker {
    public static boolean loneTeen(int age1, int age2) {
        boolean isAge1Teen = isTeen(age1);
        boolean isAge2Teen = isTeen(age2);
        return isAge1Teen ^ isAge2Teen;
    }
    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}