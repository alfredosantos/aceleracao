import org.junit.Assert;
import org.junit.Test;

public class CriptoTest {

  @Test
  public void TestCripto() {
    Assert.assertEquals("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr", CriptografiaCesariana.criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado"));
  }

  @Test
  public void TestDecript() {
    Assert.assertEquals("a ligeira raposa marrom saltou sobre o cachorro cansado", CriptografiaCesariana.descriptografar("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr"));
  }
}
