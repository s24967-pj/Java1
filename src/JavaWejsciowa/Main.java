
package JavaWejsciowa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] numbers = {"1", "2", "1", "1", "1"};
    }
    public static String sum(String[] array) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbers[i]);
        }
        int wynik = numbers[1] + numbers[2];


        System.out.println(wynik);
    }

}
}
