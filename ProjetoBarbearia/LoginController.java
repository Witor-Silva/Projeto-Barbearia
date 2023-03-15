package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;


public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    
    
    
    public void entrarNoSistema(){
        
        //Pegar um usuario da view
        Usuario usuario = helper.obterModelo();
    
        
    //Pesquisar usuario no Banco
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
    
     ////Se o usuario da view tiver o mesmo usuario e senha que o usuario direcionar para o menu
    //senão mostrar uma mensagem ao "Usuario ou senha invalidos"
    if(usuarioAutenticado != null){
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
    }else{
    view.exibeMensagem("Usuario ou senha invalidos");
    }

  }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
