package org.bedu.bacend.java.PostWork5;

import org.bedu.bacend.java.PostWork5.model.Persona;
import org.bedu.bacend.java.PostWork5.service.FormateadorTelefono;
import org.bedu.bacend.java.PostWork5.service.ValidadorTelefono;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PostWork5Application implements CommandLineRunner {

	private final ValidadorTelefono validadorTelefono;
	private final FormateadorTelefono formateadorTelefono;

	@Autowired
	public PostWork5Application(ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono) {
		this.validadorTelefono = validadorTelefono;
		this.formateadorTelefono = formateadorTelefono;
	}

	public static void main(String[] args) {
		SpringApplication.run(PostWork5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();

		System.out.println("Introduce el telefono: ");
		String telefono = reader.nextLine();

		if (validadorTelefono.isValido(telefono)) {
			telefono = validadorTelefono.limpiaNumero(telefono);
			telefono = formateadorTelefono.formatea(telefono);

			Persona persona = new Persona(nombre, telefono);

			System.out.println(persona);
		} else {
			System.out.println("Introduce un número válido");
		}
	}
}