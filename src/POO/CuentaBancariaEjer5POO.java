package POO;

import java.math.BigInteger;

public class CuentaBancariaEjer5POO {
	// Atributo
	private Integer numeroCuenta = 0;
	private Long clienteDNI = 0L;
	private Long saldo = 0L;

	// Constructores
	// Vacio
	public CuentaBancariaEjer5POO() {
	}

	// lleno
	public CuentaBancariaEjer5POO(Integer numeroCuenta, Long clienteDNI, Long saldo) {
		this.numeroCuenta = numeroCuenta;
		this.clienteDNI = clienteDNI;
		this.saldo = saldo;
	}

	// GetterANDSetters
	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Long getClienteDNI() {
		return clienteDNI;
	}

	public void setClienteDNI(Long clienteDNI) {
		this.clienteDNI = clienteDNI;
	}

	public Long getSaldo() {
		return saldo;
	}

	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}

	// Metodos
	// Lleno el objeto cuenta
	public void llenarCuenta(Integer numCuent, Long DNI, Long saldo) {
		this.numeroCuenta = numCuent;
		this.clienteDNI = DNI;
		this.saldo = saldo;
	}

	// Muestro los datos de la cuenta
	public void consultarDatos() {
		System.out.println("//////////////////////////////////////////");
		System.out.println("Su numero de cuenta es: " + getNumeroCuenta());
		System.out.println("Su DNI es: " + getClienteDNI());
		System.out.println("El total en el saldo de su cuenta es: $" + getSaldo());
	}

	// Muestro el saldo de la cuenta
	public void consultarSaldo() {
		System.out.println("//////////////////////////////////////////");
		System.out.println("El total en el saldo de su cuenta es: $" + getSaldo());
	}

	// Sumo el saldo al objeto
	public void ingresar(double ingreso) {
		long suma = 0L;
		// hago la suma
		suma = (long) (ingreso + getSaldo());
		// lo inserto en el objeto
		System.out.println("Se sumaron un total de $" + Math.floor(ingreso) + " a su cuenta de $" + getSaldo());
		setSaldo(suma);

	}

	// Retiro saldo de la cuenta
	public void retirar(double retiro) {
		long saldoCuenta = getSaldo();
		long ret = (long) retiro;
		long total = 0L;
		// Si el slado es menor retiro el saldo que tenga la cuenta y lo dejo en cero
		if (saldoCuenta < ret) {
			System.out.println("En su cuenta hay $" + saldoCuenta);
			System.out
					.println("Se retiro un total de $" + saldoCuenta + " de los $" + ret + " que ingreso para retirar");
			setSaldo(0L);
			// si el saldo de la cuenta es mayor hago una resta simple al saldo de la cuenta
		} else {
			total = (saldoCuenta - ret);
			System.out.println("En su cuenta hay $" + saldoCuenta);
			System.out.println("Se retiro un total de $" + ret + " su cuenta bancaria quedo con un total de $" + total);
			setSaldo(total);
		}
	}

	// Extraccion rapida de un 20%
	public void extraccionRapida(long retiroRap) {
		long saldo = getSaldo();
		long maxAextraer = 0L;
		long total = 0L;
		// Guardo porcentaje de 20% del dinero de cuenta
		maxAextraer = (long) ((saldo * 0.2));
		System.out.println(maxAextraer);
		// si retiro es mayor a 20% rechaza el retiro si no resta retiro
		if (retiroRap > maxAextraer && saldo > 0L) {
			System.out.println(
					"En extraccion rapida lo maximo a retirar es un %20 del saldo de su cueta el saldo de su cuenta es de  $"
							+ saldo);
		} else {
			total = (saldo - retiroRap);
			setSaldo(total);
			System.out.println("Se retiraron un total de $" + retiroRap + " de su cuenta bancaria");
		}
		consultarSaldo();
	}

}
