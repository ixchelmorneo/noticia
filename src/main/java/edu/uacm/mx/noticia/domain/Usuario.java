package edu.uacm.mx.noticia.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//control shift+o importa lo que necesita las anotaciones 
//control shift+f acomoda el codigo 
@Entity // importa a la base hace el mapeo de clase a tabla
@Table(name = "usuario") // nombre de la tabla en la base
public class Usuario {
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento en la tabla
	@Id // identidficador para la tabla
	private Long id;
	@NotBlank // para que en la tabla el dato de nombre no sea null
	@Size(min = 5, max = 30) // sirve para poner la longitu de la cadena en la tabla
	private String nombre;
	@NotBlank 
	@Size(min = 5, max = 20) 
	private String apellidoP;
	@NotBlank 
	@Size(min = 5, max = 20)
	private String apellidoM;
	@NotBlank 
	@Size(min = 5, max = 30)
	@Email
	private String correo;
	@NotBlank 
	@Size(min = 5, max = 15)
	private String pass;
	@NotBlank 
	@Size(min = 5, max = 15)
	private String nickname;

	public Usuario() {
	}

	public Usuario(Long id, String nombre,String apellidoP,String apellidoM, String correo, String pass,String nickname) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.correo = correo;
		this.pass = pass;
		this.nickname = nickname;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidoP
	 */
	public String getApellidoP() {
		return apellidoP;
	}

	/**
	 * @param apellidoP the apellidoP to set
	 */
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	/**
	 * @return the apellidoM
	 */
	public String getApellidoM() {
		return apellidoM;
	}

	/**
	 * @param apellidoM the apellidoM to set
	 */
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	}
