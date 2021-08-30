package Herencia;

import Herencia.Figura.MenuFigura;

public class ejecutorHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MenuAnimal.menuAnimal();
//		MenuElectrodo.menuElectro();
		MenuFigura.menuFigura();
	}

	/*
	 * 
	 * Ejercicio 1:
	 * 
	 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
	 * Caballo. La clase Animal tendr� como atributos el nombre, alimento, edad y
	 * raza del Animal. Crear un m�todo en la clase Animal a trav�s del cual cada
	 * clase hija deber� mostrar luego un mensaje por pantalla informando de que se
	 * alimenta. Generar una clase Main que realice lo siguiente
	 * 
	 * 
	 * Ejercicio 2:
	 * 
	 * Crear una superclase llamada Electrodom�stico con los siguientes atributos:
	 * precio, color, consumo energ�tico (letras entre A y F) y peso. Los
	 * constructores que se deben implementar son los siguientes: � Un constructor
	 * vac�o. � Un constructor con todos los atributos pasados por par�metro. Los
	 * m�todos a implementar son: � M�todos getters y setters de todos los
	 * atributos. 11 � M�todo comprobarConsumoEnergetico(char letra): comprueba que
	 * la letra es correcta, sino es correcta usara la letra F por defecto. Este
	 * m�todo se debe invocar al crear el objeto y no ser� visible. � M�todo
	 * comprobarColor(String color): comprueba que el color es correcto, y si no lo
	 * es, usa el color blanco por defecto. Los colores disponibles para los
	 * electrodom�sticos son blanco, negro, rojo, azul y gris. No importa si el
	 * nombre est� en may�sculas o en min�sculas. Este m�todo se invocar� al crear
	 * el objeto y no ser� visible. � Metodo crearElectrodomestico(): le pide la
	 * informaci�n al usuario y llena el electrodom�stico, tambi�n llama los m�todos
	 * para comprobar el color y el consumo. Al precio se le da un valor base de
	 * $1000. � M�todo precioFinal(): seg�n el consumo energ�tico y su tama�o,
	 * aumentar� el valor del precio. Esta es la lista de precios: LETRA //PRECIO A
	 * // $1000 B // $800 C // $600 D // $500 E // $300 F // $100 PESO // PRECIO
	 * Entre 1 y 19 kg // $100 Entre 20 y 49 kg // $500 Entre 50 y 79 kg // $800
	 * Mayor que 80 kg // $1000 A continuaci�n se debe crear una subclase llamada
	 * Lavadora, con el atributo carga, adem�s de los atributos heredados. Los
	 * constructores que se implementar�n ser�n: � Un constructor vac�o. � Un
	 * constructor con la carga y el resto de atributos heredados. Recuerda que
	 * debes llamar al constructor de la clase padre. Los m�todos que se
	 * implementara ser�n: � M�todo get y set del atributo carga. � M�todo
	 * crearLavadora (): este m�todo llama a crearElectrodomestico() de la clase
	 * padre, lo utilizamos para llenar los atributos heredados del padre y despu�s
	 * llenamos el atributo propio de la lavadora. M�todo precioFinal(): este m�todo
	 * ser� heredado y se le sumar� la siguiente funcionalidad. Si tiene una carga
	 * mayor de 30 kg, aumentar� el precio en $500, si la carga es menor o igual, no
	 * se incrementar� el precio. Este m�todo debe llamar al m�todo padre y a�adir
	 * el c�digo necesario. Recuerda que las condiciones que hemos visto en la clase
	 * Electrodom�stico tambi�n deben afectar al precio. Se debe crear tambi�n una
	 * subclase llamada Televisor con los siguientes atributos: resoluci�n (en
	 * pulgadas) y sintonizador TDT (booleano), adem�s de los atributos heredados.
	 * Los constructores que se implementar�n ser�n: � Un constructor vac�o. � Un
	 * constructor con la resoluci�n, sintonizador TDT y el resto de atributos
	 * heredados. Recuerda que debes llamar al constructor de la clase padre. Los
	 * m�todos que se implementara ser�n: � M�todo get y set de los atributos
	 * resoluci�n y sintonizador TDT. � M�todo crearTelevisor(): este m�todo llama a
	 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
	 * atributos heredados del padre y despu�s llenamos los atributos del televisor.
	 * � M�todo precioFinal(): este m�todo ser� heredado y se le sumar� la siguiente
	 * funcionalidad. Si el televisor tiene una resoluci�n mayor de 40 pulgadas, se
	 * incrementar� el precio un 30% y si tiene un sintonizador TDT incorporado,
	 * aumentar� $500. Recuerda que las condiciones que hemos visto en la clase
	 * Electrodomestico tambi�n deben afectar al precio. Finalmente, en el main
	 * debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor y
	 * llamar a los m�todos necesarios para mostrar el precio final de los dos
	 * electrodom�sticos.
	 * 
	 * Ejercicio 3:
	 * 
	 * Los m�todos que se implementara ser�n: � M�todo get y set de los atributos
	 * resoluci�n y sintonizador TDT. � M�todo crearTelevisor(): este m�todo llama a
	 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
	 * atributos heredados del padre y despu�s llenamos los atributos del televisor.
	 * � M�todo precioFinal(): este m�todo ser� heredado y se le sumar� la siguiente
	 * funcionalidad. Si el televisor tiene una resoluci�n mayor de 40 pulgadas, se
	 * incrementar� el precio un 30% y si tiene un sintonizador TDT incorporado,
	 * aumentar� $500. Recuerda que las condiciones que hemos visto en la clase
	 * Electrodomestico tambi�n deben afectar al precio. Finalmente, en el main
	 * debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor y
	 * llamar a los m�todos necesarios para mostrar el precio final de los dos
	 * electrodom�sticos.
	 * 
	 * Ejercicio 4 :
	 * 
	 * Se plantea desarrollar un programa que nos permita calcular el �rea y el
	 * per�metro de formas geom�tricas, en este caso un circulo y un rect�ngulo. Ya
	 * que este calculo se va a repetir en las dos formas geom�tricas, vamos a crear
	 * una Interfaz, llamada calculosFormas que tendr�, los dos m�todos para
	 * calcular el �rea, el per�metro y el valor de PI como constante. 13
	 * Desarrollar el ejercicio para que las formas implementen los m�todos de la
	 * interfaz y se calcule el �rea y el per�metro de los dos. En el main se
	 * crear�n las formas y se mostrar� el resultado final. �rea circulo: PI * radio
	 * ^ 2 / Per�metro circulo: PI * di�metro. �rea rect�ngulo: base * altura /
	 * Per�metro rect�ngulo: (base + altura) * 2.
	 * 
	 * 
	 */

}
