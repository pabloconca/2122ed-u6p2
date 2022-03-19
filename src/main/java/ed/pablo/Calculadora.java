package ed.pablo;

/**
 * <pre>
 * Realiza operaciones matematicas
 *
 * Esta clase es la encargada de realizar las operaciones de la calculadora
 * </pre>
 * @author Pablo
 * @version 2.5
 * @since 1.9  junio de 2019
 */
public class Calculadora {

	/**
	 * Metodo encargado de realizar una suma dados dos parametros
	 * @param a parametro 1 a sumar
	 * @param b parametro 2 a sumar
	 * @return devuelve el resultado de la suma
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Metodo encargado de realizar una resta dados dos parametros
	 * @param a parametro 1 a resta
	 * @param b parametro 2 a resta
	 * @return devuelve el resultado de la resta
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Metodo encargado de realizar una multiplicacion dados dos parametros
	 * @param a parametro 1 a multiplicacion
	 * @param b parametro 2 a multiplicacion
	 * @return devuelve el resultado de la multiplicacion
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Metodo encargado de realizar una division dados dos parametros
	 * @param a parametro 1 a division
	 * @param b parametro 2 a division
	 * @return devuelve el resultado de la division
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
}
