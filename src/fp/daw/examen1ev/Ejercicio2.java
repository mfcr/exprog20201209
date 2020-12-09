package fp.daw.examen1ev;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random rnd=new Random();
		for (int i=0;i<100;i++) {
			int anyo=rnd.nextInt(2200);
			System.out.println("El año "+anyo+" "+((esBisiesto(anyo)==true)?"SI":"NO")+" es bisiesto");
		}

	}
	
	
	public static boolean esBisiesto(int anyo) {
		return (anyo%4==0 && (anyo%100!=0 || (anyo%100==0 && anyo%400==0)));
		
	}

}
