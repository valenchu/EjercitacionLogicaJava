package Practica;

public class Suma extends Operaciones {
	
	
	public Suma(int num1, int num2) {
		super(num1, num2);
		this.resultado = num1+num2;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mostrarResultado() {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la suma es = "+resultado);
	}
	
}
