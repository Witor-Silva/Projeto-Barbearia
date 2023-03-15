package Controller;

import View.Agenda;
import View.MenuPrincipal;

public class MenuPrincipalCrontroller {
    
    private final MenuPrincipal view;

    public MenuPrincipalCrontroller(MenuPrincipal view) {
        this.view = view;
    }
    
    
    
    public void navegarParaAgenda(){
    
    Agenda agenda = new Agenda();
    agenda.setVisible(true);
    }
    
    
    
}
