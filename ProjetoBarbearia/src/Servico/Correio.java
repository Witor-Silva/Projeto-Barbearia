/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author vitor
 */
public class Correio {

    public static Correio correio;
    
    public void NotificarPorEmail(Agendamento agendamento){
    
        String emailFormatado = formarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        //Uso da Classe de Email
        Email email = new Email("Agendamento ProjetoBarbearia", emailFormatado, destinatario);
        email.enviar();
    }

    private String formarEmail(Agendamento agendamento) {
       
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá"+ nomeCliente + "Vai dar um tapa no visu... Seu agendamento para "+
                servico + "esta marcado para o dia "+ dataAgendamento +
                " às "+ horaAgendamento + "O preço para você sai baratin fica R$"+ valor + " Forte Abraço";
    }
}
