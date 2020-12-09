package fp.daw.examen1ev;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio1 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner teclado=new Scanner(System.in);
		char[] textoChars;
		try {
			System.out.println("Introduzca un texto para meterlo en un array de caracteres.");
			textoChars=br.readLine().toLowerCase().toCharArray();
			//ordenamos el array. Metodo de la burbuja.

			//No encontré el método que devuelve el array de chars ordenado.

			for (int i=0;i<textoChars.length;i++) { //Puntero.
				for (int j=textoChars.length-1;j>i;j--) {
					if (textoChars[j]<textoChars[j-1]) {
						char aux=textoChars[j-1];
						textoChars[j-1]=textoChars[j];
						textoChars[j]=aux;
					}
					
				}
			}			
			//Mostramos el array ordenado:
			System.out.println("\n El array de chars ordenado es:");
			
			String txtResult=new String(textoChars);
			//String txtResult=String.copyValueOf(textoChars); //OTRA MANERA de Hacerlo. 

			System.out.print(txtResult); //Esto no funciona.
			
		} catch (Exception e) {
			System.out.println ("Error al introducir el texto");
		}
	}
}
