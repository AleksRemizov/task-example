package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringNormalize {
    public static void main(String[] args) {
        String firstName = "  Alex";
        String secondName = "andrew";
        String thirdName = "  Ann ";
        String fourthName = "  JANNET ";
        String fifthName = " ";
        List<String> people = List.of(firstName, secondName, thirdName, fourthName, fifthName);
        people.stream().forEach(p -> System.out.println(p.trim()));

        List<String> normalizeString = people.stream()
                .map(s -> s.trim())
                .filter(s -> !s.isEmpty())
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Normalize people name " + normalizeString);

        String text =" Many third-party libraries, frameworks, and tools are accessing the internal APIs and " +
                "packages of the JDK. The Java 16, JEP 396 make the strong encapsulation by default (we are not allowed" +
                " to access the internal APIs easily). However, we can still use --illegal-access to switch to the " +
                "simple encapsulation to still access the internal APIs.";

        String[] sentence = text.split("\\.");

        String[] words = text.split(" |-");

        System.out.println("The text has " + sentence.length + " sentences");
        System.out.println("The text has " + words.length + " words");
        System.out.println(Arrays.asList(words));
        System.out.println("The text has " + text.length() + " characters");
    }
}
