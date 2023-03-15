package org.bedu.java.backend.e1;

import org.bedu.java.backend.e1.model.Saludo;
import org.bedu.java.backend.e1.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class E1Application implements CommandLineRunner {

	//PrimeraForma lenta y poca segura+
	//@Autowired
	// private Saludo saludo;
	private final Saludo saludo;
	private final SaludoService saludoService;
	//@Autowired
	//public void setSaludo(Saludo saludo){
	//	this.saludo=saludo;
	//}


	public E1Application(@Autowired Saludo saludo, @Autowired SaludoService saludoService) {
	this.saludo = saludo;
	this.saludoService =saludoService;
	}




	public static void main(String[] args) {
		SpringApplication.run(E1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludo.getNombre());
		System.out.println(saludoService.saluda());
	}
}
