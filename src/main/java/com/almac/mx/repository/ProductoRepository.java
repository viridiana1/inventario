package com.almac.mx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.almac.mx.entities.Productos;
/**
 * Autor: Karen Pacheco
 */

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Long>{

}
