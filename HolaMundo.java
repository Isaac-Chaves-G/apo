
import java.util.Scanner;
public class HolaMundo{	
	public static void main (String[] args) {
		
			Scanner in = new Scanner (System.in);
			String saborHelado; //declarar variable
			System.out.println("cual es tu sabor de helado favorito");
			saborHelado= in.nextLine();
			System.out.println ("tu sabor elegido fue: " + saborHelado);
		}
	}