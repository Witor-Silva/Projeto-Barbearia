package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        Email email = new Email(
                "Assunto da Barbearia", 
                "Menssagem Padrão da Barbearia",
                "xxxx@gmail.com");
        
        email.enviar();
        

    }
    
}
