package StringUtil;

public class IStringUtil implements CharSequence{
     private CharSequence str;


	public CharSequence  subSequence(int indice1, int indice2) {
		str.subSequence(indice1, indice2);
		return str;
	}

	public char charAt(int indice1) {
		char caracter = ' ';
		caracter=str.charAt(indice1);
		return caracter;
	}
	
	public int length() {
		int longitud = 0;
		longitud=str.length(); 
		return longitud;
	}
}
