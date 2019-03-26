package edu.uacm.mx.noticia.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


//control shift+o importa lo que necesita las anotaciones 
//control shift+f acomoda el codigo 
@Entity // importa a la base hace el mapeo de clase a tabla
@Table(name = "comentario") // nombre de la tabla en la base
public class Comentario {

	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento en la tabla
	@Id // identidficador para la tabla
	private long id;
	
	private Date fecha;
	
	@NotBlank 
	@Size(min = 5, max = 50)
	private String texto;
	
	
	public Comentario(){}
	public Comentario(Long id,Date fecha,String texto){
		
		this.id=id;
		this.fecha=fecha;
		this.texto=texto;
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
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}
	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
