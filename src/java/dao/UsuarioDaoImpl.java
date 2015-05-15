/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Carlos
 */
public class UsuarioDaoImpl implements UsuarioDao{

    @Override
    public Usuario findByUsuario(Usuario usuario) {
        Usuario model=null;
        Session sesion= HibernateUtil.getSessionFactory().getCurrentSession();
        String sql="FROM Usuario WHERE tipo = '"+usuario.getUser()+"'";
        try{
            sesion.beginTransaction();
            model= (Usuario) sesion.createQuery(sql).uniqueResult();
            sesion.beginTransaction().commit();
            
        }catch(Exception e){
        sesion.beginTransaction().rollback();
        }
        return model;
    }

    @Override
    public Usuario login(Usuario usuario) {
      Usuario model=this.findByUsuario(usuario);
      if (model!=null){
          if(usuario.getPassword().equals(model.getPassword())){
           model=null;
          }
      }
      return model;
    }
    
}
