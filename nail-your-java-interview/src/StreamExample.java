import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamExample {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alex", "Tom", "Nick","Jack","Ann");

        students.stream().forEach(System.out::println);

        students.parallelStream().forEach(System.out::println);

        //with string

        boolean isInList = students.stream()
                .anyMatch(s -> s.equalsIgnoreCase("jack"));
        //other way
//        students.stream()
//                .map(StringUtils::capitalize)
//                .forEach(System.out::println);


        Stream<String>  isStartWith = students.stream()
                .filter(s -> s.startsWith("A"));
        isStartWith.forEach(System.out::println);


        List<Integer> numericList = List.of(1, 2, 3, 4, 5, 6, 8);
        Stream<Integer> doubleStream = numericList.stream()
                .map(n -> n * n);
        doubleStream.forEach(System.out::println);

//        cars.stream()
//                .map(Car::getNumber) // преобразовываем Stream машин в Stream номеров
//                .forEach(System.out::println);

//        cars.stream()
//                .filter(c -> c.getYear() > 2010) // выбираем только машины, выпущенные после 2010 года
//                .map(Car::getNumber) // преобразовываем Машины в номера, теперь у нас Stream номеров машин
//                .filter(s -> s != null && !s.isEmpty()) // выбираем только не пустые номера
//                .forEach(System.out::println); // выводим результат
    }
}
