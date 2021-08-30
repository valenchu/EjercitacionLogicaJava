package Herencia.Figura;

public final class Circulo implements CalculosFormas {
	// Atributos
	private Double radio;
	private Double diametro;

	// Constructores
	public Circulo() {
	}

	public Circulo(Double radio, Double diametro) {
		this.radio = radio;
		this.diametro = diametro;
	}
	// Getter Setters

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	// Metodos interfaz
	// Metodo que calcular area del circulo
	// �rea circulo: PI * radio ^ 2 /
	@Override
	public Double calcularArea() {
		double to = Math.pow(this.radio, 2);
		return PII * to;

	}

	// Metodo que calcula perimetro del circulo Per�metro circulo: PI * di�metro.
	@Override
	public Double calcularPerimetro() {
		return PII * this.radio;
		// TODO Auto-generated method stub

	}

}
