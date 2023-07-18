package com.almac.mx.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class Productos {

/**
 * Autor: Karen Pacheco
 * 
 */
	public Productos() {}
	public Productos(String nombreProducto, String codigoProducto, String cantidadProducto, String categoriaProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.cantidadProducto = cantidadProducto;
		this.categoriaProducto = categoriaProducto;
	}

	@Id
	@Column(name = "NOMBRE", length = 50, nullable = false, unique = false)
	private String nombreProducto;
	@Column(name = "CODIGO", length = 50, nullable = false, unique = false)
	private String codigoProducto;
	@Column(name = "CANTIDAD", length = 50, nullable = false, unique = false)
	private String cantidadProducto;
	@Column(name = "CATEGORIA", length = 50, nullable = false, unique = false)
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
