package Herencia.Figura;

public final class Rectangulo implements CalculosFormas {
	// Atributos
	private Double altura;
	private Double base;

	// Constructor
	public Rectangulo() {
	}

	public Rectangulo(Double altura, Double base) {
		this.altura = altura;
		this.base = base;
	}

	// GetterSetters
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	// Metodos de la interfaz
//	Área rectángulo: base * altura
	@Override
	public Double calcularArea() {

		return this.base * this.altura;
	}

//	Perímetro rectángulo: (base + altura) * 2.
	@Override
	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (this.base + this.altura) * 2;
	}

}
