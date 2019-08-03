import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CriptoTest {

  @Test
  public void TestCripto() {
    Assert.assertEquals("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr", CriptografiaCesariana.criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado"));
  }

  @Test
  public void TestDecript() {
    Assert.assertEquals("a ligeira raposa marrom saltou sobre o cachorro cansado", CriptografiaCesariana.descriptografar("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr"));
  }

  @Test
  public void deveManterOsNumerosNaCriptografia() {
    String texto = "sejam bem vindos ao Acelera Brasil 2019";
    assertEquals("vhmdp ehp ylqgrv dr dfhohud eudvlo 2019", CriptografiaCesariana.criptografar(texto));
  }

  @Test
  public void deveManterOsNumerosNaDescriptografia() {
    String textoCifrado = "vhmdp ehp ylqgrv dr dfhohud eudvlo 2019";
    assertEquals("sejam bem vindos ao acelera brasil 2019", CriptografiaCesariana.descriptografar(textoCifrado));
  }

  @Test
  public void deveConverterCaracteresParaMinusculoNaCriptografia() {
    String texto = "Aprender Java gera felicidade";
    assertEquals("dsuhqghu mdyd jhud iholflgdgh", CriptografiaCesariana.criptografar(texto));
  }

  @Test
  public void deveConverterCaracteresParaMinusculoNaDescriptografia() {
    String textoCifrado = "Dsuhqghu Mdyd jhud iholflgdgh";
    assertEquals("aprender java gera felicidade", CriptografiaCesariana.descriptografar(textoCifrado));
  }

  @Test
  public void testNull() {
    assertEquals("aprender java gera felicidade", CriptografiaCesariana.descriptografar(null));
  }

  @Test(IllegalArgumentException.class= "Entrada sem valor para descriptografar")
  public void testEmpty() {
    assertEquals("aprender java gera felicidade", CriptografiaCesariana.descriptografar(""));
  }
}
