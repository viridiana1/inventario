package com.almac.mx.dto;

import java.io.Serializable;

import com.almac.mx.entities.Usuarios;

public class UsuarioDTO implements Serializable {
	
	
    /**
	 * Autor:Karen Pacheco
	 */
	private static final long serialVersionUID = 1204015990309920069L;
	
	
	
	public UsuarioDTO(String nombreUsuario, String mailUsuario, String passUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.mailUsuario = mailUsuario;
		this.passUsuario = passUsuario;
	}
	
	public UsuarioDTO(Usuarios usuario) {
		super();
		this.nombreUsuario = usuario.getNombreUsuario();
		this.mailUsuario = usuario.getMailUsuario();
		this.passUsuario = usuario.getPassUsuario();
	}
	
	
	private String nombreUsuario;
    private String mailUsuario;
    private String passUsuario;
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getMailUsuario() {
		return mailUsuario;
	}
	public void setMailUsuario(String mailUsuario) {
		this.mailUsuario = mailUsuario;
	}
	public String getPassUsuario() {
		return passUsuario;
	}
	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}
    
    

}
