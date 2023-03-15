
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import static Servico.Correio.correio;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {
    
    private final Agenda View;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.View = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    
    public void atualizaTabela(){
    
    //Buscar Listas com agendamento do banco de dados
    AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
    //Exibir esta lista na View
    helper.preencherTabela(agendamentos);
    
    }
   
    public void atualizaCliente(){
    
        //Buscar clientes do Banco de Dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir Clientes no Combobox cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
    Servico servico = helper.obterServico();
    helper.setarValor(servico.getValor());
    }
   
    public void agendar(){
        //Buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
       //Salvar Objeto no banco de dados
       new AgendamentoDAO().insert(agendamento);
       
       Correio.correio = new Correio();
       correio.NotificarPorEmail(agendamento);
       
       //Inserir elemento na tabela
       atualizaTabela();
       helper.LimparTela();     
    }
}
