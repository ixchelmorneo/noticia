/**
 * 
 */
package edu.uacm.mx.noticia.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.uacm.mx.noticia.domain.Usuario;

/**
 * @author ixchel
 *
 */

// en repositori se crea una interfaz y se le agrea crud y sirve para hacer transacciones a la a la base de datos es el crud de alta1s y bajas 
// t = es el tipo de dato del objeto ejemplo usuario 
//id = es el long que se le puso en la clase usuario de id 
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	
	@Query(value = "select * from usuario where id" + "=:id",nativeQuery = true)
	Usuario findById_usuario(@Param("id")Long id);
	
	@Query(value = "select * from usuario where nombre" + "=:nombre",nativeQuery = true)
	Usuario findById_usuario(@Param("nombre")String nombre);
	
}
