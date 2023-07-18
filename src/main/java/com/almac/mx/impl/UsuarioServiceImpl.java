package com.almac.mx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almac.mx.dto.UsuarioDTO;
import com.almac.mx.entities.Usuarios;
import com.almac.mx.repository.UsuarioRepository;
import com.almac.mx.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	/**
	 * Autor: Karen Pacheco
	 */
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public boolean validarUsuario(UsuarioDTO usuario) {
		boolean respuesta = false;
		Usuarios aux = new Usuarios(usuario.getNombreUsuario(), usuario.getMailUsuario(), usuario.getPassUsuario());
		try {
			Usuarios respuestaConsulta = usuarioRepository.validaUsuarioNom(aux.getNombreUsuario(), aux.getPassUsuario());
			if(respuestaConsulta!=null) {
				respuesta = true;
			}
		}catch(Exception e) {
			System.out.println("*********Error al validar usuario "+e);
		}
		return respuesta;
	}

	@Override
	public boolean registrarUsuario() {
		// TODO Auto-generated method stub
		return false;
	}

}
