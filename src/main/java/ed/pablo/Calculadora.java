package ed.pablo;

/**
 *
 * Clase para realizar operaciones matematicas
 * <p>
 * Esta clase es la encargada de realizar las operaciones básicas de una calculadora ... 
 * 
 * @author Pablo Conca Sánchez
 * @version 2.5
 * @since 1.9, junio de 2019
 */
public class Calculadora {

	/**
	 * Metodo encargado de realizar una suma dados dos parametros
	 * @param a parametro 1 a sumar
	 * @param b parametro 2 a sumar
	 * @return el resultado de la suma
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Metodo encargado de realizar una resta dados dos parametros
	 * @param a parametro 1 a resta
	 * @param b parametro 2 a resta
	 * @return  el resultado de la resta
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Metodo encargado de realizar una multiplicacion dados dos parametros
	 * @param a parametro 1 a multiplicacion
	 * @param b parametro 2 a multiplicacion
	 * @return  el resultado de la multiplicacion
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Metodo encargado de realizar una division dados dos parametros
	 * @param a parametro 1 a division
	 * @param b parametro 2 a division
	 * @return  el resultado de la division
	 * @exception ArithmeticException si el parametro b es 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	/**
	 * Este metodo se encarga de multiplicar un numero n cantidad de veces
	 * @param numeroMultiplicar corresponde al numero a multiplicar
	 * @param cantidadDeVecesAMultiplicar corresponde al exponencial
	 * @return  el resultado de multiplicar el numero, por si mismo, tantas veces como indica el exponente
	 */
	public int potenciaDeUnNumero(int numeroMultiplicar , int cantidadDeVecesAMultiplicar ){

		int resultado = 1;

		for ( int i = 0; i < cantidadDeVecesAMultiplicar ; i++ ){
			resultado = resultado * numeroMultiplicar;
		}
		return resultado;

	}
	/**
	 * Este metodo se encarga de multiplicar un numero n cantidad de veces
	 * @param numeroAComprobar corresponde al numero a comprobar
	 * @return en caso de que el numero sea para devolvera true, en caso contrario, devolvera false
	 */
	public boolean esPar ( int numeroAComprobar ){

		boolean resultado;

		if ( numeroAComprobar % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;

	}
	/**
	 * Este metodo recibe como parametro un numero y dividimos ese numero entre 2 miestras sea mayor que 0,guardando sus modulos.
	 * @param parametroADividir numero el cual dividiremos.
	 * @return cadena de caracteres empleada para guardar todos los modulos.
	 */
	public String calcularModulos(int parametroADividir){

		String resultado = "";
		int numeroADividir = parametroADividir;
		int modulo;

		while ( numeroADividir > 0) {

			modulo = numeroADividir % 2;

			resultado = modulo + resultado;

			numeroADividir = numeroADividir / 2;


		}
		return resultado;

	}

}
