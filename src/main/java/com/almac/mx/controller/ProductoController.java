package com.almac.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.almac.mx.dto.ProductoDTO;
import com.almac.mx.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	/**
	 * Autor: Karen Pacheco 
	 */
	
	@Autowired(required=true)
	ProductoService productoService;
	
	@RequestMapping(value = "/productos", method = RequestMethod.GET)
	   public ResponseEntity<Object> consultaProductos() {
	      return new ResponseEntity<>(productoService.consultarProductos(), HttpStatus.OK);
	   }
	
	@RequestMapping(value = "/insertaProducto", method = RequestMethod.POST)
	   public ResponseEntity<Object> insertaProductos(@RequestBody ProductoDTO producto) {
	      return new ResponseEntity<>(productoService.agregarProducto(producto), HttpStatus.OK);
	   }
	
	@RequestMapping(value = "/eliminaProducto", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> eliminaProductos(@RequestBody ProductoDTO producto) {
	      return new ResponseEntity<>(productoService.borrarProducto(producto), HttpStatus.OK);
	   }

}
