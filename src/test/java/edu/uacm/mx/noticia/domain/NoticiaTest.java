package edu.uacm.mx.noticia.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.uacm.mx.noticia.repository.NoticiaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoticiaTest {

	
	@Autowired
	NoticiaRepository noticiaRepository;


	@Test
	public void addNoticia() {
		
		// Give // se crea el objeto
		Noticia noticia = new Noticia();
		noticia.setAutor("ixchel");
		noticia.setNota("Es una noticia");
		noticia.setTitulo("Yeah Yeah");
		noticia.setFecha(new Date());
		
		// When// lo esta guardando el objeto
		Noticia noticiaRetorn = noticiaRepository.save(noticia);
		
		//Then
		Assert.assertThat(noticiaRetorn,is(notNullValue()));
		
		
	}
	
	
	
}
