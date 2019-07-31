import static java.util.Arrays.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {

  static List fibonacci() {
    int n = 0;
    List<Integer> list = new ArrayList<>();
    Collections.addAll(list, 0, 1);
    for (int i = 1; list.get(i) < 350; i++) {
      list.add((n = (list.get(i)) + (list.get(i- 1))));
    }
    return list;
  }

  static Boolean isFibonacci(Integer n) {
    List<Integer> list = fibonacci();
    Collections.sort(list);
    Integer number = Collections.binarySearch(list, new Integer(n));
    if(number > 0 ){
      return true;
    }
    return false;
  }
}