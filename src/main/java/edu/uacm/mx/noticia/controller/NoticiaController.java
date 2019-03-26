package edu.uacm.mx.noticia.controller;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uacm.mx.noticia.domain.Noticia;
import edu.uacm.mx.noticia.domain.Usuario;
import edu.uacm.mx.noticia.repository.NoticiaRepository;
import edu.uacm.mx.noticia.repository.UsuarioRepository;



@RequestMapping(value = "/api")
@RestController
public class NoticiaController {
	
public static final Logger log = LogManager.getLogger(UsuarioController.class);
	
	@Autowired // esta anotacion es la inyeccion de dependencas sirve para no crear objetos 
	UsuarioRepository noticiaRepository; // 
	
	@GetMapping(value = "/notica")
	public List<Noticia> allNoticia() {
        List<Noticia> noticias = (List<Noticia>) noticiaRepository.findAll();
		return noticias;

	} 
	
	
	@GetMapping(value = "/noticia/agregar/{nombreNoticia}")
	public String addNoticia(@PathVariable String nombreNoticia) {
		log.debug("__________________________________________");//log  sirve para imprimir 
		log.debug("-Con-----------------Encontrado al metodo agregarUsuario");
		
		Noticia noticia= new Noticia (new Long(1),"Primera noticia",new Date(),"El profe jonas no saca las chelas xd","ixchel");
		Noticia noticiaRetorn = noticiaRepository.save(notica);
		
		return "Noticia" + noticiaRetorn.getTitulo() + "agregado";
		return noticia;
	}
	
	
	
	
	//metodo de busqeda por id pero este tipo de metodo ya trae sus busquedas predeterminadas 
	@GetMapping(value = "/notica/{id}")
	public Noticia getNoticia(@PathVariable String id){

		Usuario noticiaRetorn = noticiaRepository.findById_noticia(Long.parseLong(id));
		
		return noticiaRetorn;

	}
	
}
