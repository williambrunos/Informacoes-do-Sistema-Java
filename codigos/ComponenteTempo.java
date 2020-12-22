//Escreva "package nome_pacote" aqui:
import java.util.Calendar;

public class ComponenteTempo {
    public static void main(String[] args){
        Calendar data = Calendar.getInstance();
        //O atributo YEAR pode ser reescrito como MONTH, HOUR e etc...
        //Escreva Calendar. e veja quais atributos você pode adquirir do sistema:
        int date = data.get(Calendar.YEAR);
    }
}
