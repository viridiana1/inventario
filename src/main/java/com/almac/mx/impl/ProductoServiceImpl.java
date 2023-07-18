package com.almac.mx.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almac.mx.dto.ProductoDTO;
import com.almac.mx.entities.Productos;
import com.almac.mx.repository.ProductoRepository;
import com.almac.mx.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoRepository;
	/**
	 * Autor: Karen Pacheco
	 */

	@Override
	public List<ProductoDTO> consultarProductos() {
		List<ProductoDTO> listaResp = new ArrayList<ProductoDTO>();
		try {
			List<Productos> lista = (List<Productos>) productoRepository.findAll();
			for(Productos prod : lista) {
				ProductoDTO aux = new ProductoDTO(prod);
				listaResp.add(aux);
			}
		}catch(Exception e) {System.out.println("*********Error al consultar productos "+e);}
		return listaResp;
	}

	@Override
	public boolean agregarProducto(ProductoDTO prod) {
		boolean resp = false;
		Productos auxiliar = new Productos(prod.getNombreProducto(), prod.getCodigoProducto(), prod.getCantidadProducto(), prod.getCategoriaProducto());
		try {
			productoRepository.save(auxiliar);
			resp = true;
		}catch(Exception e) {
			System.out.println("*********Error al agregar productos "+e);
		}
		
		return resp;
	}

	@Override
	public boolean borrarProducto(ProductoDTO prod) {
		boolean resp = false;
		Productos auxiliar = new Productos(prod.getNombreProducto(), prod.getCodigoProducto(), prod.getCantidadProducto(), prod.getCategoriaProducto());
		try {
			productoRepository.delete(auxiliar);
			resp = true;
		}catch(Exception e) {
			
		}
		
		return resp;
	}
	
	

}
