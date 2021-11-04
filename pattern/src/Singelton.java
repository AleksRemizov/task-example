public class Singelton {
    // В этой статической(!) переменной будет хранится единственный объект класса Singleton
    private static Singelton instance;
    private String value;

    public String getValue() {
        return value;
    }
    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса Singleton
    private Singelton(String value){
        this.value = value;
    }
    // Вот этот статический метод будет вызывать пользователь, чтобы получить объект класса Singleton
    public static Singelton getInstance(String value){
        // если ранее не был создан единственный объект
        if(instance == null){
            // код здесь выполняется только в момент первого вызова метода getInstance()

            // создаем объект один раз
            instance = new Singelton(value);
        }
        // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объек
        return instance;
    }
}
// Тестируем
class SingletonTest {
    public static void main(String[] args) {
        Singelton first = Singelton.getInstance("Hello!");
        Singelton second = Singelton.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}
