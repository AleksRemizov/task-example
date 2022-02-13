package strings;

import java.util.stream.IntStream;

public class Palindrome {

    public static boolean palindromeCheckerTraditional(String original){
        String lowerString = original.toLowerCase();
        //String reversed = new StringBuilder(lowerString).reverse().toString();
        StringBuilder reverse = new StringBuilder();
        for (int i = lowerString.length() - 1 ; i >=0 ; i--) {
            reverse.append(lowerString.charAt(i));
        }
        return lowerString.equals(reverse.toString());
    }

    public static boolean palindromeCheckStream(String original){
        String lowerString = original.toLowerCase();
        return IntStream.range(0,lowerString.length() / 2)
                .allMatch(i ->
                        lowerString.charAt(i) == lowerString.charAt(lowerString.length() - i -1));
    }

    public static void main(String[] args) {
        String s1 = "maDam";
        String s2 = "raceCar";
        String s3 = "aBba";
        String s4 = "swims";
        String s5 = "wifi";

        System.out.println(palindromeCheckerTraditional(s1));
        System.out.println(palindromeCheckerTraditional(s2));
        System.out.println(palindromeCheckerTraditional(s3));
        System.out.println(palindromeCheckerTraditional(s4));
        System.out.println(palindromeCheckerTraditional(s5));

    }

}
