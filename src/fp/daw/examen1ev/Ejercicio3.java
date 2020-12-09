package fp.daw.examen1ev;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double x;
		try {
			System.out.println("Introduzca el valor de X. si usa decimales use punto: ");
			x=Double.parseDouble(teclado.nextLine()); //Asi con punto
			//double x=teclado.nextDouble(); //Asi con coma
		} catch (Exception e) {
			System.out.println("Error al introducir el valor de X");
			teclado.close();
			return; //Salimos del programa.
		}
		System.out.println("Introduzca los valores de los coeficientes separados por espacios, use punto para los decimales: ");
		String coef_Str=teclado.nextLine()+" "; //Introduzco artificialmente un espacio al final.
		if (coef_Str.equals("")) {
			System.out.println ("no ha introducido coeficientes");
		} else {
			System.out.printf("El resultado final es: %.2f",calculaPolinomico(coef_Str,x));
		}
		teclado.close();
	}
	
	public static double calculaPotencia(double base, double exp) {
		return (Math.pow(base, exp));
	}

	public static double calculaPolinomico(String coefStr, double x) {
		double rtdo=0;
		int last=0;
		int poli=0;
		
		for (int i=0;i<coefStr.length();i++) {
			//Recorremos el texto para ir sacando los coeficientes.
			String currChar=coefStr.substring(i, i+1);
			if (currChar.equals(" ")) {
				double coef=Double.parseDouble(coefStr.substring(last,i));
				rtdo+=coef*(calculaPotencia(x,poli));
				last=i;
				poli++;
			}
		}
		return (rtdo);
	}
	
}
