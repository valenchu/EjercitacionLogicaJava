package Herencia.Animal;

public class MenuAnimal {

	public static void menuAnimal() {
		// Creo perro
		Perro p1 = new Perro("Popo", "alimento para perro y huesos varios", "Doberman", 5);
		// Muestro de que se alimenta el perro
		p1.alimentarse();
		// Creo gato
		Gato g1 = new Gato("Garfield", "alimento para gato y pezcado", "Persa", 3);
		// Muestro de que se alimenta el gato
		g1.alimentarse();
		// Creo caballo
		Caballo c1 = new Caballo("Nieve", "alfalfa y pasto del suelo", "PuraSangre", 4);
		// Muestro de que se alimenta el caballo
		c1.alimentarse();

	}

}
