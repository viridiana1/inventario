package com.almac.mx.service;

import java.util.List;

import com.almac.mx.dto.ProductoDTO;


public interface ProductoService {
	/**
	 * Autor: Karen Pacheco
	 */
	
	public List<ProductoDTO> consultarProductos();
	public boolean agregarProducto(ProductoDTO prod);
	public boolean borrarProducto(ProductoDTO prod);

}
