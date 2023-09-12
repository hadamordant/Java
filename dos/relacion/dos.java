
package relacion;
import java.io.*;

public class dos {
	
	/**
	 * Method main
	 *
	 *
	 * @param args
	 * 
	 */
	 public static void main(String[] args) throws IOException {
		// permite que el Compilador corra
		InputStreamReader s = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(s);
		System.out.print("Bienvenido");
		String nombre = new String();
		nombre = stdin.readLine();
		System.out.println("Hola"+nombre);
	}	
}
