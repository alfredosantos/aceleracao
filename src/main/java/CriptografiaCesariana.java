import java.util.regex.Pattern;

public class CriptografiaCesariana {

  static String criptografar(String texto) {
    if (texto.isEmpty() | texto == null) {
      throw new IllegalArgumentException("Entrada sem valor para criptografar.");
    }
    String decifrado = "";
    LinkedAlphabet linkedAlphabet = new LinkedAlphabet();
    for (String letter : texto.toLowerCase().split("|")) {
      if (!Pattern.matches("[a-z]", letter)) {
        decifrado += letter;
      } else {
        final int nextPos = linkedAlphabet.getAlphabetNext(-3, letter);
        decifrado += linkedAlphabet.getLetter(nextPos);
      }
    }
    return decifrado;
  }


  static String descriptografar(String texto) {
    if (texto.isEmpty() | texto == null) {
      throw new IllegalArgumentException("Entrada sem valor para descriptografar.");
    }
    String decifrado = "";
    LinkedAlphabet linkedAlphabet = new LinkedAlphabet();
    for (String letter : texto.toLowerCase().split("|")) {
      if (!Pattern.matches("[a-z]", letter)) {
        decifrado += letter;
      } else {
        final int nextPos = linkedAlphabet.getAlphabetNext(3, letter);
        decifrado += linkedAlphabet.getLetter(nextPos);
      }
    }
    return decifrado;
  }
}
