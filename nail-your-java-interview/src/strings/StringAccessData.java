package strings;

public class StringAccessData {
    public static void main(String[] args) {
        //0 1 2 3 4 5
        //A p p l e s
        String name = "Apples";
        char firstChar = name.charAt(0);

        //StringIndexOutOfBoundsException
        //char secondChar = name.charAt(6);

        System.out.println(name.indexOf('e'));

        System.out.println(name.substring(2, 4));

        System.out.println(name.contains("app"));

        char[] nameArray = name.toCharArray();
        int index = 4;
        System.out.println(nameArray[4]);



    }
}
