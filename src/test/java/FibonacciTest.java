import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

  @Test
  public void TestFibonacci() {
    Fibonacci.fibonacci();
  }

  @Test
  public void TestFibonacciBoll() {
    Assert.assertEquals(Boolean.TRUE, Fibonacci.isFibonacci(13));
  }
}
