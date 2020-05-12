/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.IUsuario;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;

/**
 *
 * @author HI andres
 */
public class ControladorUsuario {
 private VistaUsuario vistaUsuario;
 private Usuario usuario;
 private IUsuario usuarioDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public void registrar(){
    usuario = vistaUsuario.crearUsuario();
    usuarioDAO.create(usuario);
    }
    
 
 
}