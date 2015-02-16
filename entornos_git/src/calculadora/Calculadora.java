package calculadora;
	
	/**
	 * La clase calculadora calcula suma, restas, multiplicaciones y divisiones
	 * @author ruben
	 * 
	 */


public class Calculadora {
	
	
	/**
	 *  El constructor de esta clase no necesita ningún parametro
	 * 
	 */
	public Calculadora(){
		
	}
	
	/**
	 *  Este método sumara dos números
	 * @param a primer número a sumar
	 * @param b segundo número a sumar
	 * @return devuelve la suma de a y b
	 */
	public double suma(double a, double b){
		return a+b;
	}
	
	/**
	 *  Este metodo resta dos números
	 * @param a primer número a restar
	 * @param b segundo número a restar
	 * @return la resta de a menos b
	 */
	public double resta(double a, double b){
		return a-b;
	}
	
	/**
	 *  Multiplica dos números
	 * @param a primer número a multiplicar
	 * @param b segundo número a multiplicar
	 * @return la multiplicación de a por b
	 */
	public double multiplica(double a, double b){
		return a*b;
	}
	
	/**
	 *  Divide dos números
	 * @param a primer número a dividir
	 * @param b segundo número a dividir
	 * @return la division de a entre b
	 */
	public double divide(double a, double b){
		return a/b;
	}
	/**
	 *  Eleve a la potencia
	 * @param a primer número
	 * @param b segundo número
	 * @return la potencia de a elevado a b
	 */
	public double potencia(int a, int b){
		int z=0;
		
		while (0<b){
			z=a*a;
			b--;
		}
		return z;
	}
	
	
}
