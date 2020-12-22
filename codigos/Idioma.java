//Você deve escrever "package nome_pacote aqui"
import java.util.Locale;

public class Idioma {
	public static void main(String[] args) {
		Locale lang = Locale.getDefault();
		System.out.println("O idioma do sistema é: " +lang.getDisplayLanguage());
	}
}
