package edu.uacm.mx.noticia.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//control shift+o importa lo que necesita las anotaciones 
//control shift+f acomoda el codigo 
@Entity // importa a la base hace el mapeo de clase a tabla
@Table(name = "noticia") // nombre de la tabla en la base
public class Noticia {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento en la tabla
	@Id // identidficador para la tabla
	private long id;
	
	@NotBlank 
	@Size(min = 5, max = 30) 
	private String titulo;
	
	private Date fecha;
	@NotBlank
	@Size(min = 5, max = 30) 
	private String nota;
	@NotBlank 
	@Size(min = 5, max = 30) 
	private String autor;

	/* este array cada ves que se crea un noticia se guarada todo 
	lo que contenga aparte de la notica como los comentarios*/
	/*orphanRemoval sirve para que al modificar al hijo no se modifique el padre*/
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Comentario> comentario = new ArrayList<>(); 

	
	public Noticia(){}
	
	public Noticia(Long id,String titulo,Date fecha,String nota,String autor){
		this.id = id;
		this.titulo = titulo;
		this.fecha = fecha;
		this.nota = nota;
		this.autor = autor;
		}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the nota
	 */
	public String getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(String nota) {
		this.nota = nota;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
