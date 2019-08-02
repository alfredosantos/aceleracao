package challenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;


public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if (texto.isEmpty()) throw new IllegalArgumentException("Entrada sem valor para criptografar.");
        final List<String> decript = new LinkedList<>();
        final String decifrado;
        LinkedAlphabet linkedAlphabet = new LinkedAlphabet();
        Arrays.stream(texto.split("|")).forEach(letter -> {
          if (!Pattern.matches("[a-z]", letter)) {
            decript.add(letter);
          } else {
            final int nextPos = linkedAlphabet.getAlphabetNext(6, letter);
            decript.add(linkedAlphabet.getLetter(nextPos));
          }
        });
        return "";
                //decifrado = Joiner.on("").join(decript);
    }

    
    @Override
    public String descriptografar(String texto) {
        if (texto.isEmpty()) throw new IllegalArgumentException("Entrada sem valor para criptografar.");
        final List<String> decript = new LinkedList<>();
        final String decifrado;
        LinkedAlphabet linkedAlphabet = new LinkedAlphabet();
        Arrays.stream(texto.split("|")).forEach(letter -> {
          if (!Pattern.matches("[a-z]", letter)) {
            decript.add(letter);
          } else {
            final int nextPos = linkedAlphabet.getAlphabetNext(-6, letter);
            decript.add(linkedAlphabet.getLetter(nextPos));
          }
        });
        //decifrado = Joiner.on("").join(decript);
        return "";
    }
}
