public class DeleteWord {
    public static String delDel(String str) {
        if (str.length() <= 3) return str;
        char firstLetter = str.charAt(0);
        String delLocation = str.substring(1, 4);
        String final_word = str.substring(4);
        if (str.length() >= 4 && delLocation.equals("del")) {
            return firstLetter + final_word;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(delDel("adel"));
    }
}

