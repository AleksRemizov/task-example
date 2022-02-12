import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> firstOptional = Optional.empty();
        Optional<String> secondOptional = Optional.of("Alex");

        //first way to solve it with loop

//        if(firstOptional.isPresent()){
//            System.out.println("Hi " + firstOptional.get());
//        }else{
//            System.out.println("Hi");
//        }
        System.out.println("Hi " + firstOptional.orElse(""));
        System.out.println("Hi "  + secondOptional.orElse(""));
    }
}
