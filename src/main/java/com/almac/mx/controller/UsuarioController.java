package com.almac.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.almac.mx.dto.UsuarioDTO;
import com.almac.mx.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	/**
	 * Autor: Karen Pacheco 
	 */

	@Autowired(required=true)
	UsuarioService usuarioService;
	
	
	@RequestMapping(value = "/validaUsuario", method = RequestMethod.POST)
	   public ResponseEntity<Object> validaUsuario(@RequestBody UsuarioDTO usuario) {
	      return new ResponseEntity<>(usuarioService.validarUsuario(usuario), HttpStatus.OK);
	   }
	
}
