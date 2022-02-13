package arrays_And_LinkedList;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {


        String[] availablePets = {"cat", "dog", "fish"};
        String[] unavailablePets = {"bird", "rabbit", "hamster", "gerbil"};

        int indexAvailable = 2;
        int indexUnavailable = 0;

        String availableP = availablePets[indexAvailable];
        String unavailable = unavailablePets[indexUnavailable];

        availablePets[indexAvailable] = unavailable;
        unavailablePets[indexUnavailable] = availableP;

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));

    }
}
