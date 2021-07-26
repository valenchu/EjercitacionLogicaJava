package POO;

public class MatemáticaEjer9POO {
	// Atributos
	private double num1, num2;

	// Constructor
	// lleno
	public MatemáticaEjer9POO(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	// Constructor vacio

	public MatemáticaEjer9POO() {
	}

	// GettersANDSetters
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	// Metodos Varios
	// Devuelve el numero mayor
	public double devolverMayor() {
		double mayor = 0d;
		mayor = (this.num1 > this.num2) ? this.num1 : this.num2;
		return mayor;
	}

	// Metodo que calcula potencia del numero mayor potencia el menor
	public double calcularPotencia() {
		double resultado = 0d;
		// Redondeo los numeros
		double redondeoNumero1 = Math.round(this.num1);
		double redondeoNumero2 = Math.round(this.num2);
		// Si el numero 1 es distinto de el mayor retornar redondeonumero1 si no retorna
		// redondeo numero 2
		double numeroMenor = (this.num1 != devolverMayor()) ? redondeoNumero1 : redondeoNumero2;
		// Redondeo el numero mayor para sacar potencia
		double numerMayor = Math.round(devolverMayor());
		// Saco potencia
		resultado = Math.pow(numerMayor, numeroMenor);
		// retorno el resultado de la potencia
		return resultado;
	}

	// Calculo la raiz cuadrada del menor de los dos valores
	public double calculaRaiz() {
		double raizCuadrada = 0d;
		double numeroMenor = (this.num1 != devolverMayor()) ? this.num1 : this.num2;
		numeroMenor = Math.abs(numeroMenor);
		raizCuadrada = Math.sqrt(numeroMenor);
		return raizCuadrada;
	}

}
