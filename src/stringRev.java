public class stringRev {
    public static void main(String[] args) {
        String base = "abcdefg";
        String answer = "gfedcba";

        String rev = reverseString(base);

        System.out.println(rev.equals(answer));
    }

    private static String reverseString(String base) {

        StringBuilder returnStringBuilder = new StringBuilder();
        for (int i = base.length(); i <= base.length(); i--) {
//            if (i == 0) {
//                break;
//            }
                returnStringBuilder.append(base.substring(i - 1, i));
        }

        return returnStringBuilder.toString();
    }
}
