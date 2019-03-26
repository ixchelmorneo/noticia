/**
 * 
 */
package edu.uacm.mx.noticia.repository;

import org.springframework.data.repository.CrudRepository;

import edu.uacm.mx.noticia.domain.Noticia;

//en repositori se crea una interfaz y se le agrea crud y sirve para hacer transacciones a la a la base de datos es el crud de alta1s y bajas 
//t = es el tipo de dato del objeto ejemplo usuario 
//id = es el long que se le puso en la clase usuario de id 
public interface NoticiaRepository extends CrudRepository<Noticia, Long> {

	
	
}
