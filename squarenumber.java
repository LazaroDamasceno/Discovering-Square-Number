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
