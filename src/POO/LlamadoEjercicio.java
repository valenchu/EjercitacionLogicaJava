package POO;

import java.util.Scanner;

public class LlamadoEjercicio {
	public void ejecutor1() {
//		Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//		Autor, Número de páginas, y un constructor con todos los atributos pasados por
//		parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//		datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//		el autor del libro y el numero de páginas
		// Creo objeto libro1 y lo cargo y muestro
		Ejercicio1POO libro1 = new Ejercicio1POO();
		libro1.llamarCargadorMostrador();
	}

	public void ejecutor2() {
//		Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
//		de tipo real. A continuación, se deben crear los siguientes métodos:
//		a) Método constructor que inicialice el radio pasado como parámetro.
//		b) Métodos get y set para el atributo radio de la clase Circunferencia.
//		c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//		del objeto.
//		d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//		e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
		CircunferenciaEjer2POO c2 = new CircunferenciaEjer2POO(0.0);
		// Paso radio con crear circunferencia
		c2.crearCircunferencia();
		// Creo area
		c2.area();
		// Creo perimetro
		c2.perimetro();
		// muestro datos
		c2.mostrarDatos();
	}

	public void ejecutor3() {
//		Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//		numero2. A continuación, se deben crear los siguientes métodos:
//		a) Método constructor con todos los atributos pasados por parámetro.
//		b) Metodo constructor sin los atributos pasados por parámetro.
//		c) Métodos get y set.17
//		d) Método para crearOperacion(): que le pide al usuario los dos números y los
//		guarda en los atributos del objeto.
//		e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//		f) Método restar(): calcular la resta de los números y devolver el resultado al main
//		g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//		si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//		error. Si no, se hace la multiplicación y se devuelve el resultado al main
//		h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//		pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//		error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//		al main
		OperacionEjer3POO o1 = new OperacionEjer3POO();
		int escritura = 0;
		// Creo dowhile para repetir proceso cuantas veces necesite
		do {

			Scanner sc = new Scanner(System.in);
			// Creo menu
			System.out.println("MENU");
			System.out.println("Ingrese 1 para sumar numeros");
			System.out.println("Ingrese 2 para restar numeros");
			System.out.println("Ingrese 3 para multiplicar numeros");
			System.out.println("Ingrese 4 para dividir numeros");
			System.out.println("Ingrese 0 para salir");
			escritura = sc.nextInt();
			if (escritura != 0) {
				o1.crearOperacion();
				// llamo al metodo llamada el cual esta dentro de operaciones y ejecuta un menu
				// que retorna resultados
				escritura = o1.llamadas(escritura);
			}

		} while (escritura != 0);

	}
	public void ejecutor4() {
//		Crear una clase Rectángulo que modele rectángulos por medio de un atributo
//		privado base y un atributo privado altura. La clase incluirá un método para crear el
//		rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
//		método para calcular la superficie del rectángulo y un método para calcular el
//		perímetro del rectángulo. Por último, tendremos un método que dibujará el
//		rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
//		los métodos getters, setters y constructores correspondientes.
//		Superficie = base * altura / Perímetro = (base + altura) * 2
		RectangulosEje4POO r = new RectangulosEje4POO();
		r.crearRectangulo();
		System.out.println("El perimetro de este rectangulo es: "+r.perimetroRec());
		System.out.println("La superficie del rectangulo planteado es: "+r.superficieRec());
		r.dibujarRec();
	}

}
