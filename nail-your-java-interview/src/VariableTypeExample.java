import java.util.Arrays;
import java.util.List;

public class VariableTypeExample {
    public static void main(String[] args) {
        //var only local
        var students = List.of("Alex", "Tom", "Nick","Jack");
        var total = 38.45 ;

        //usefull if Class has long name

        //var theLongestNameYouCanEverImagine = new TheLongestNameYouCanEverImagine();

        //var var = "var"; // так можно
        //var nullVar = null; // не скомпилируется

        //var s = "first value";
        //s = "second value";

        //int a, var b = 3; // не скомпилируется
        //var a = 1, b = 2; // тоже не скомпилируется
        //var a = 1, var b = 2; // и даже так не скомпилируется
        //int a = 3, b = 2; // да-да, так всё ещё можно

        //final var s = "first value";
        //s = "second value"; // не-не-не, вы же не просто так дописали модификат

//        var s = "string value"; // объявили переменную с неявным типом String
//        s = "another string value"; // присвоили другое строковое значение
//        s = 100; // не скомпилируется: попытка присвоить строковой
//        //переменной числовое значение

    }
}
