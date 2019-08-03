import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {

	static List fibonacci() {
		int n = 0;
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 0, 1);
		while (true) {
			final int last = list.get(list.size() - 1);
			final int beforeLast = list.get(list.size() - 2);
			final int next = last + beforeLast;
			if (next > 350) {
				break;
			}
			list.add(next);
		}
		return list;
	}

	static Boolean isFibonacci(Integer n) {
		final List<Integer> list = fibonacci();
		return list.contains(n);
	}
}