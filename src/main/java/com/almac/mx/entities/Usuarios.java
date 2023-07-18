package com.almac.mx.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuarios {
	/**
	 * Autor:Karen Pacheco
	 */
	public Usuarios() {}
	  public Usuarios(String nombreUsuario, String mailUsuario, String passUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.mailUsuario = mailUsuario;
		this.passUsuario = passUsuario;
	}
	  
	@Id
	@Column(name="NOMBRE", length=50, nullable=false, unique=false)
	    private String nombreUsuario;
	  @Column(name="EMAIL", length=50, nullable=false, unique=false)
	    private String mailUsuario;
	  @Column(name="PASS", length=50, nullable=false, unique=false)
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
