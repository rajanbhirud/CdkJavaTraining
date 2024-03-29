import java.util.Arrays;
import java.util.List;

public class MapReduceDemo {

	public static void main(String s[]) {
		new MapReduceDemo();
	}

	public MapReduceDemo() {
		oldOne();
		newOne();
		oneMoreDemo();
	}

	private void oldOne() {
		System.out.println("Summing the square of numbers without Stream and Lambda  ------ ");
		List<Integer> list = Arrays.asList(11, 20, 3, 4, 57, 26, 7, 8, 19);
	
		int sum = 0;
		for (Integer value : list) {
			int rs = value * value;
			sum = sum + rs;
		}
		System.out.println(sum);

	}

	private void newOne() {
		System.out.println("Summing the square of numbers using Stream and Lambda  ------ ");
		List<Integer> list = Arrays.asList(11, 20, 3, 4, 57, 26, 7, 8, 19);
		int sum = list.stream().map((value) -> value * value).reduce((x,y) -> x + y).get();
		System.out.println(sum);
	}

	private void oneMoreDemo() {
		System.out.println("Summing the square of numbers using Stream and Lambda  ------ ");
		List<Integer> list = Arrays.asList(11, 20, 3, 4, 57, 26, 7, 8, 19);
		int sum = list.parallelStream().map((value) -> value * value).reduce((x,y) -> x + y).get();
		System.out.println(sum);
	}

}
