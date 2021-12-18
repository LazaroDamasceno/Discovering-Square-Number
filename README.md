# SquareNumber

A square number is given the of odd number in the quantity informed by the user. 

For example, if the given number is 8 the result is 64, because it derives from the sum of 1+3+5+7+9+11+13+15.

One way to find is the code bellow:

    import java.util.*;
    import java.util.stream.*;

    public class Main {

      public static void main(String[] args) {
        Scanner numReader = new Scanner(System.in);
        int quantity = numReader.nextInt();
        int[] numbers = new int[quantity];
        int adder = 1;
        for (int i = 0; i < quantity; i++) {
          numbers[i] = adder;
          adder += 2;
        }
        System.out.println(IntStream.of(numbers).sum());
        numReader.close();
      }

    }
