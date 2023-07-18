package com.almac.mx.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.almac.mx.entities.Usuarios;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{
	/**
	 * Autor: Karen Pacheco
	 */
	
	@Query("SELECT u FROM Usuarios u WHERE u.nombreUsuario = :nombre and u.passUsuario = :pass")
	public Usuarios validaUsuarioNom(  @Param("nombre") String nombre, 
			  @Param("pass") String pass);

}
