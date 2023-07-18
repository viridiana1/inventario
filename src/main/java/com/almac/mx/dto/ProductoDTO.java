package com.almac.mx.dto;

import java.io.Serializable;

import com.almac.mx.entities.Productos;

public class ProductoDTO implements Serializable {

/**
 * Autor: Karen Pacheco
 */
	
	
	public ProductoDTO(String nombreProducto, String codigoProducto, String cantidadProducto,
			String categoriaProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.cantidadProducto = cantidadProducto;
		this.categoriaProducto = categoriaProducto;
	}
	
	public ProductoDTO(Productos producto) {
		super();
		this.nombreProducto = producto.getNombreProducto();
		this.codigoProducto = producto.getCodigoProducto();
		this.cantidadProducto = producto.getCantidadProducto();
		this.categoriaProducto = producto.getCategoriaProducto();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3890281619780017221L;

	private String nombreProducto;
	private String codigoProducto;
	private String cantidadProducto;
	private String categoriaProducto;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(String cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getCategoriaProducto() {
		return categoriaProducto;
	}
	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	
	
}
