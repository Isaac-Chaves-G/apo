
import java.util.Scanner;
public class primeraCalculadora{	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("por favor escribe el numero 1: ");
		int numero1 = entrada.nextInt();
		System.out.println("Por favor escribe el numero 2: ");
		int numero2= entrada.nextInt();
		//
		int resSuma;
		resSuma = sumaDosNumeros(numero1,numero2); //invocacion o llamada del metodo
		System.out.println("la suma es: " + resSuma);
			
		}

		public static int sumaDosNumeros(int numero1, int numero2){
			int resultado; //variable local del metodo
			resultado = numero1 + numero2;
			return resultado;
		}
	}