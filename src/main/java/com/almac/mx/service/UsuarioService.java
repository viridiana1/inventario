package com.almac.mx.service;


import com.almac.mx.dto.UsuarioDTO;


public interface UsuarioService {
	/**
	 * Autor: Karen Pacheco 
	 */
	
	public boolean validarUsuario(UsuarioDTO usuario);
	public boolean registrarUsuario();
}
