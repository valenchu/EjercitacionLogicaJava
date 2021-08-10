package POO;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PersonaEjer12POO {
	// Atributos
	// Creo atributo statico para formatear fecha
	private static DateTimeFormatter toEurope = DateTimeFormatter.ofPattern("d/M/yyyy");
	private String nombre;
	private LocalDate fechaNacimiento;

	// Constructor lleno
	public PersonaEjer12POO(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Constructor vacio
	public PersonaEjer12POO() {
	}

	// GettersAndSettters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// Metodos varios
	// Metodo que crea la persona
	public void crearPersona() {
		int d, m, a;
		String fecha;
		String nombres;
		boolean verificar = false;
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("CARGANDO DATOS");
			System.out.println("Ingrese su nombre");

			nombres = sn.nextLine();
			this.nombre = nombres;
			System.out.println("-----------------[][][][]-----------------");
			System.out.println("CARGANDO FECHA DE NACIMIENTO");
			System.out.println("Ingrese DIA de su fecha de nacimiento ");
			d = sn.nextInt();
			System.out.println("Ingrese el MES de su fecha de nacimiento");
			m = sn.nextInt();
			System.out.println("Ingrese el AÑO de su fecha de nacimiento");
			a = sn.nextInt();
			try {
				
				// Paso la fecha a strin
				fecha = d + "/" + m + "/" + a;
				// utilizo el string y lo parseo con datetimeformat creado como estatico al
				// comienzo de la clase
				this.fechaNacimiento = LocalDate.parse(fecha, toEurope);
				verificar = true;
				// Si la fecha es erronea salta el catch y no sale del do hasta que ingrese
				// fecha correcta
			} catch (DateTimeParseException e) {
				System.out.println("Error en la fecha de nacimiento intentelo de nuevo " + e.getMessage());
				sn.next();
				verificar = false;
			}
		} while (verificar == false);

	}

	// Metodo que calcula la edad de la persona
	public void calcularEdad() {
		// Tomo la fecha actual con localdate.now
		LocalDate ahora = LocalDate.now();
		// con chronounit tomo la diferencia entre dos fechas.
		// En estre caso tomo la fecha de nacimiento y la de ahora
		long tiempo = ChronoUnit.YEARS.between(fechaNacimiento, ahora);
		System.out.println("La edad de " + this.nombre + " es de " + tiempo);
	}

	// Metodo que dice si la edad ingresada es menor que la del usuario
	public boolean menorQue(LocalDate edad) {
		boolean result = false;
		// GUARDO LA EDAD DEL USUARIO PASADA
		long edadIngresada = ChronoUnit.DAYS.between(edad, LocalDate.now());
		// GUARDO LA EDAD DEL USUARIO ALMACENADA
		long edadUsuarioAlmacenada = ChronoUnit.DAYS.between(this.fechaNacimiento, LocalDate.now());
		// COMPARO EDADES Y RETORNO TRUE PARA MENOR Y FALSE PARA MAYOR
		if (edadIngresada < edadUsuarioAlmacenada) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	// Metodo que muestra los datos de la persona cargada
	public void mostrarPersona() {
		System.out.println("NOMBRE DE LA PERSONA : " + this.nombre);
		System.out.println("FECHA DE NACIMIENTO DE " + this.nombre + " : " + this.fechaNacimiento.format(toEurope));
	}

	// MENU
	public void menu() {
		System.out.println("-----------------[][][][]-----------------");
		System.out.println("MENU");
		System.out.println("1- Calcular edad del usuario");
		System.out.println("2- Calcular si es menor la edad ingresada o no");
		System.out.println("3- Muestra el usuario y la fecha de nacimiento por pantalla");
		System.out.println("0- Para salir");
	}

	// Acciones
	public void accionMenu(int accion) {
		switch (accion) {
		case 1:
			System.out.println("-----------------[][][][]-----------------");
			System.out.println("CALCULANDO EDAD");
			calcularEdad();
			break;
		case 2:
			Scanner sn = new Scanner(System.in);
			int d, m, a;
			String fecha;
			boolean verificar = false;
			do {
				System.out.println("-----------------[][][][]-----------------");
				System.out.println("CARGANDO FECHA A COMPARAR");
				System.out.println("Ingrese DIA de su fecha de nacimiento ");
				d = sn.nextInt();
				System.out.println("Ingrese el MES de su fecha de nacimiento");
				m = sn.nextInt();
				System.out.println("Ingrese el AÑO de su fecha de nacimiento");
				a = sn.nextInt();
				try {
					// Paso la fecha a strin
					fecha = d + "/" + m + "/" + a;
					
					// utilizo el string y lo parseo con datetimeformat creado como estatico al
					// comienzo de la clase
					LocalDate f = LocalDate.parse(fecha, toEurope);
					boolean comprobar = menorQue(f);
					if (comprobar == true) {
						System.out.println("La edad ingresada es menor a la del usuario almacenada");
					} else {
						System.out.println("La edad ingresada es mayor a la del usuario almacenada");
					}
					verificar = true;
					// Si la fecha es erronea salta el catch y no sale del do hasta que ingrese
					// fecha correcta
				} catch (DateTimeParseException e) {
					System.out.println("Error en la fecha intentelo de nuevo " + e.getMessage());
					sn.next();
					verificar = false;
				}
			} while (verificar == false);
			break;
		case 3:
			System.out.println("-----------------[][][][]-----------------");
			System.out.println("DATOS DE LA PERSONA CARGADA");
			mostrarPersona();
			break;
		case 0:
			System.out.println("-----------------[][][][]-----------------");
			System.out.println("SALIENDO DEL PROGRAMA");
			break;
		default:
			System.out.println("No se encontro accion requerída");
			break;
		}
	}

}
