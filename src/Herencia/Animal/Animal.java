package Herencia.Animal;

public abstract class Animal {
	protected String nombreAnimal;
	protected String alimentoAnimal;
	protected String razaAnimal;
	protected Integer edadAnimal;

	public Animal(String nombreAnimal, String alimentoAnimal, String razaAnimal, Integer edadAnimal) {
		this.nombreAnimal = nombreAnimal;
		this.alimentoAnimal = alimentoAnimal;
		this.razaAnimal = razaAnimal;
		this.edadAnimal = edadAnimal;
	}

	public abstract void alimentarse();
}
