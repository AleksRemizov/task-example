public class SwitchExample {
    enum Season{
        SPRING,SUMMER,FALL,WINTER
    }

    public static void main(String[] args) {
        Season season = Season.SPRING;
        String weather = switch(season){
            case SPRING,SUMMER -> "Sunny";
            case FALL -> "Rainy";
            case WINTER -> "Snowy";
            default ->{
                System.out.println("Invalid season");
                yield "Invalid season";
            }
        };
        System.out.println(weather);
    }
}
