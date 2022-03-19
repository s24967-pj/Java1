package JavaWejsciowa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int wynik;
        String[] numbers = {"1", "2", "1", "1", "1"};

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbers[i]);
        }
        int wynik = numbers[1]+numbers[2];


        System.out.println(wynik);


    }
}
