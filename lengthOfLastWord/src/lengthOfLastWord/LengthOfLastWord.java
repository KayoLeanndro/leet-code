package lengthOfLastWord;

public class LengthOfLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord( "   fly me   to   the moon  "));
	}
	
	public static int lengthOfLastWord(String s) {
		String[] palavras = s.split("\\s+");

		String ultimaPalavra = palavras[palavras.length - 1];

		int tamanhoUltimaPalavra = ultimaPalavra.length();

		return tamanhoUltimaPalavra;
	}
}
