import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alex", "Tom", "Nick","Jack");

        //Consumer
        Consumer<String> printItem = i -> System.out.println(i);
        students.forEach(printItem);

        //Function
        Function<Integer,Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(8));

        //Predicate
        IntPredicate isDevisable = n -> n % 3 == 0;
        System.out.println(isDevisable.test(9));

        //Supplier
        Supplier<Double> randomUnder100 = () -> Math.random() * 100;
        System.out.println(randomUnder100.get());


    }
}
