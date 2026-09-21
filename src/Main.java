import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      /// Задача 1.1
        int [] weights = new int [] {1, 2, 3};

        /// Задача 1.2
        double [] numbers = {1.57, 7.654, 9.986};

        /// Задача 1.3
        int [] animals = {13, 12, 8};

        /// Задача 2
        System.out.println(Arrays.toString(weights));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(animals));

        /// Задача 3
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int w = numbers.length - 1; w >=0; w--) {
            System.out.print(numbers[w]);
            if (w > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = animals.length - 1; i >= 0; i--) {
            System.out.print(animals[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        /// Задача 4
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] = weights[i] + 1;
            }
        }
        System.out.println(Arrays.toString(weights));








    }
}