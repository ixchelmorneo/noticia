package edu.uacm.mx.noticia.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uacm.mx.noticia.domain.Comentario;

@RequestMapping(value = "/api")
@RestController
public class ComentarioController {
	
	@Autowired // esta anotacion es la inyeccion de dependencas sirve para no crear objetos 
	//UsuarioRepository usuarioRepository; // 
	
	@PostMapping(value = "/comentario")
	public String addComentario() {
		
		return "agregado";

	}
	
	
	
	@GetMapping(value = "/comentario/{id}")// es para que que cuando se haga la peticion hacia la pagina 
	public Comentario getComentario(@PathVariable String id) {// el path es la url entonces extrae el id del getmapping y lo busca y lo incetar al path sitring   
	
		Comentario comen = new Comentario (new Long(1),new Date(),"primer comentario");
		
		return comen;
	}


}
