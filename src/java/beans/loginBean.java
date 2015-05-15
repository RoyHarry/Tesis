/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.UsuarioDao;
import dao.UsuarioDaoImpl;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import model.Usuario;
import org.primefaces.context.RequestContext;
import util.MyUtil;
import javax.faces.application.ResourceDependency;
/**
 *
 * @author Carlos
 */
@Named(value="loginBean")
@SessionScoped
public class loginBean implements Serializable{

    /**
     * Creates a new instance of loginBean
     */
    
    private Usuario usuario;
    private UsuarioDao usuarioDao;
    public loginBean(){
        this.usuarioDao=new UsuarioDaoImpl();
        if(this.usuario==null){
            this.usuario=new Usuario();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
   
    public void login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message;
        boolean loggedIn;
        String ruta="";
        this.usuario=this.usuarioDao.login(this.usuario);
        if(this.usuario!=null) {
            loggedIn = true;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.usuario.getUser());
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", this.usuario.getUser());
            ruta= MyUtil.basepathlogin()+"views/inicio.xhtml";
        } else {
            loggedIn = false;
            if(this.usuario==null){
            this.usuario=new Usuario();
        }
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Usuario y/o clave son incorrectos");
            
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        context.addCallbackParam("ruta", ruta);
    }   
}