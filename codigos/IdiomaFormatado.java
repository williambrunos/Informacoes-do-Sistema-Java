//Escreva "package nome_pacote" aqui:
import java.util.Locale;

public class IdiomaFormatado {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        //Neste código a linguagem do sistema é escrita por extenso, facilitando a leitura
        String idioma = local.getDisplayLanguage();
    }
}
