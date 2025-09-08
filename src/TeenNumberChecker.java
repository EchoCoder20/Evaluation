public class TeenNumberChecker {
    public static class LoneTeen {
        public static boolean loneTeen(int age1, int age2) {
            return (age1 <= 19 && age1 >= 13) ^ (age2 >= 13 && age2 <= 19);
        }
    }
}
