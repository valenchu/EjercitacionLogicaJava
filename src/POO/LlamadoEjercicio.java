package POO;

import java.util.Scanner;

public class LlamadoEjercicio {
	Scanner sn = new Scanner(System.in);

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
		System.out.println("El perimetro de este rectangulo es: " + r.perimetroRec());
		System.out.println("La superficie del rectangulo planteado es: " + r.superficieRec());
		r.dibujarRec();
	}

	public void ejecutor5() {
//		Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//		atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//		operaciones asociadas a dicha clase son:
//		• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//		• Agregar los métodos getters y setters correspondientes
//		• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//		• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//		ingresar y se la sumara a saldo actual.
//		• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//		se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//		pondrá el saldo actual en 0.
//		• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//		que el usuario no saque más del 20%.
//		• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//		• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
		CuentaBancariaEjer5POO cuenta1 = new CuentaBancariaEjer5POO();
		int comando;
		do {
			cuenta1.menu();
			System.out.println("Ingrese su accion de menu");
			comando = sn.nextInt();
			cuenta1.acciones(comando);

		} while (comando != 0);
	}

	public void ejecutor6() {
//		 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
//		capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
//		cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
//		menos, los siguientes métodos: 18
//		• Constructor predeterminado o vacío
//		• Constructor con la capacidad máxima y la cantidad actual
//		• Métodos getters y setters.
//		• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//		máxima. 
//		• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//		tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//		cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//		método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//		cuanto quedó la taza.
//		• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//		• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//		recibe y se añade a la cafetera la cantidad de café indicada.
		CafeteraEjer6POO cafe1 = new CafeteraEjer6POO(1000, 300);
		int comando;
		do {
			cafe1.menu();
			System.out.println("Ingrese su accion de menu");
			comando = sn.nextInt();
			cafe1.acciones(comando);

		} while (comando != 0);
	}

	public void ejecutor7() {
//		. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//		sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
//		otro atributo, puede hacerlo. Los métodos que se implementarán son:
//		• Un constructor por defecto.
//		• Un constructor con todos los atributos como parámetro.
//		• Métodos getters y setters de cada atributo.
//		• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//		al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//		Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//		O. Si no es correcto se deberá mostrar un mensaje
//		• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//		kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//		función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//		(incluidos), significa que el peso está por debajo de su peso ideal y la función
//		devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
//		significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
//		hacer uso de constantes para devolver estos valores.
//		• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//		devuelve un booleano.
//		A continuación, en la clase main hacer lo siguiente:
//		Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//		los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//		tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//		persona es mayor de edad.
//		Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//		en distintas variables, para después en el main, calcular un porcentaje de esas 4
//		personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//		encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//		cuantos menores.
		PersonaEjer7POO p1 = new PersonaEjer7POO();
		p1.crearPersona();
	}

}
