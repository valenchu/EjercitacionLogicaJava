package Herencia.Animal;

public final class Caballo extends Animal {

	public Caballo(String nombreAnimal, String alimentoAnimal, String razaAnimal, Integer edadAnimal) {
		super(nombreAnimal, alimentoAnimal, razaAnimal, edadAnimal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		System.out.println(this.nombreAnimal + ": Come " + this.alimentoAnimal);
	}

}
