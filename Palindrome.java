import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String str = "eqee";
//        System.out.println(str.equals(stringReverse(str)));
        int in = 1234;
        System.out.println(integerReverse(in));
    }

    private static String stringReverse(String input) {
        if(input == null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length() - 1) + stringReverse(input.substring(0, input.length() - 1));
    }

    private static boolean integerReverse(int input) {
//        return Integer.parseInt(stringReverse(Integer.toString(input)));
        int palindrome = input;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return reverse == input;
    }
}
