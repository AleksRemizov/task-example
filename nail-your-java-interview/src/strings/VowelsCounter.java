package strings;

import java.util.List;
import java.util.stream.Collectors;

public class VowelsCounter {
    public static void findNumberOfVowelsAndConsonants(String input){
        int vowelsCount = 0;
        int consonanceCount = 0;
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();
        char[] normalizedArray = normalized.toCharArray();
        for (char c: normalizedArray) {
            if(vowels.indexOf(c) != -1){
                vowelsCount++;
            }else if ( c != ' '){
                consonanceCount++;
            }
        }
        System.out.println("There are " + vowelsCount + " vowels in :" + input );
        System.out.println("There are " + consonanceCount + " consonance in :" + input );
        System.out.println();
    }
    public static void findNumberOfVowelsAndConsonantsStream(String input){
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();

        List<Integer> letters = normalized.chars()
                .filter(Character :: isAlphabetic )
                .boxed()
                .collect(Collectors.toList());
        long vowelsCount = letters.stream()
                .filter(c ->vowels.indexOf(c) != -1)
                .count();
        long consonanceCount = letters.stream().count() - vowelsCount;

        System.out.println("There are " + vowelsCount + " vowels in :" + input );
        System.out.println("There are " + consonanceCount + " consonance in :" + input );
        System.out.println();

    }

    public static void main(String[] args) {
        String s1 = "HeLlO";
        String s2 = " there is a quiet Mouse";
        String s3 = "I am happy   ";

        findNumberOfVowelsAndConsonants(s1);
        findNumberOfVowelsAndConsonants(s2);
        findNumberOfVowelsAndConsonants(s3);

        findNumberOfVowelsAndConsonantsStream(s1);
        findNumberOfVowelsAndConsonantsStream(s2);
        findNumberOfVowelsAndConsonantsStream(s3);

    }
}
