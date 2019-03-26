package edu.uacm.mx.noticia.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uacm.mx.noticia.domain.Usuario;
import edu.uacm.mx.noticia.repository.UsuarioRepository;

@RequestMapping(value = "/api")
@RestController
public class UsuarioController {

	public static final Logger log = LogManager.getLogger(UsuarioController.class);
	
	@Autowired // esta anotacion es la inyeccion de dependencas sirve para no crear objetos 
	UsuarioRepository usuarioRepository; // 
	
	
	

	
	
	
	@PostMapping(value = "/usuario")
	public String addUsuario() {
		
		return "agregado";

	}
	
	
	
	@GetMapping(value = "/usuario/agregar/{nombre}/{apellidoP}")// es para que que cuando se haga la peticion hacia la pagina 
	public String agregarUsuario(@PathVariable String nombre,@PathVariable String apellidoP) {// el path es la url entonces extrae el id del getmapping y lo busca y lo incetar al path sitring   
	
		log.debug("__________________________________________");//log  sirve para imprimir 
		log.debug("-Con-----------------Encontrado al metodo agregarUsuario");
		
		Usuario usuario = new Usuario(new Long(1), nombre,apellidoP,"navarrete", "ixchel_sidek@hotmail.com", "sideker521","lobojknokd");
		Usuario usuarioRetorn = usuarioRepository.save(usuario);
		
		return "Usuario" + usuarioRetorn.getNombre() + "agregado";
	}
	
	// muestra todos los usuarios con un arraylist
	
	@GetMapping(value = "/usuario")
	public List<Usuario> allUsuario() {

		return (List<Usuario>) usuarioRepository.findAll();

	} 
	
	
	//metodo de busqeda por id pero este tipo de metodo ya trae sus busquedas predeterminadas 
	@GetMapping(value = "/usuario/{id}")
	public Usuario getUsuario(@PathVariable String id){

		Usuario usuarioRetorn = usuarioRepository.findById_usuario(Long.parseLong(id));
		
		return usuarioRetorn;

	} 

} 

