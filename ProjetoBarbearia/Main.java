package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
    
    
    public static void main(String[] args){
        
        String nome = "tiago";
        System.out.println(nome);
        
        Servico serviço = new Servico(1, "barba", 30);
        
        System.out.println(serviço.getDescricao());
        System.out.println(serviço.getValor());
        
        
        Cliente cliente = new Cliente(1, "tiago", "rua teste", "92531214545");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha" );
        System.out.println(usuario.getNome());
        
        
        Agendamento agendamento = new Agendamento( 1, cliente, serviço, 30, "23/06/2022 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
    
    
}
