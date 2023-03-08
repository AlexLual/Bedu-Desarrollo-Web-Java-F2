package org.bedu.java.backend.PostWork4;

import org.bedu.java.backend.PostWork4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


//Implementamos la interface CommandLineRunner
// En Spring Boot, CommandLineRunner es una interfaz
// que permite ejecutar cierto código al iniciar la aplicación.
// Específicamente, al implementar la interfaz CommandLineRunner,
// se puede agregar un método run que se ejecutará automáticamente
// al iniciar la aplicación. Este método run puede aceptar como parámetro
// una matriz de argumentos de línea de comando (String[] args).
// Esto permite que se puedan pasar argumentos específicos para la ejecución
// del método run en la línea de comando al iniciar la aplicación.
//CommandLineRunner es una forma útil de inicializar la aplicación
// con datos o configuraciones predefinidas, o para realizar tareas
// de inicialización específicas al iniciar la aplicación. Por ejemplo,
// se podría implementar la interfaz CommandLineRunner para inicializar
// una base de datos con datos iniciales al iniciar la aplicación.


//usar @component para que reconozca sprint
@SpringBootApplication
public class PostWork4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PostWork4Application.class, args);
	}
//Este método run puede aceptar como parámetro una matriz de argumentos
// de línea de comando (String[] args). Esto permite que se puedan pasar
// argumentos específicos para la ejecución del método run en la línea de
// comando al iniciar la aplicación.
	@Override
	public void run(String... args) throws Exception {

			Scanner reader = new Scanner(System.in);

			System.out.println("Introduce el teléfono: ");
			String telefono = reader.nextLine();

			System.out.println("Introduce el nombre: ");
			String nombre = reader.nextLine();

			Persona persona =new Persona(telefono, nombre);
			System.out.println(persona);

	}
}
