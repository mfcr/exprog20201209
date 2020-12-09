package fp.daw.examen1ev;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[][] numsArray= {{1,5,5,2,4},{2,1,4,14,3},{3,7,11,2,8},{4,8,12,16,4}};
		Integer rtdoMax3x3=max3x3sum(numsArray);
		if (rtdoMax3x3==null) {
			System.out.println("La matriz de numeros introducida no es valida, ambas dimensiones tienen quwe ser >=3");
		} else {
			System.out.println("La suma de los elementos de la matriz es de "+rtdoMax3x3);
		}

	}
	
	public static Integer max3x3sum(int[][] array) {
		
		int maxrtdo=0;
		if (array.length<=3 || array[1].length<=3) {return (null);} //alguna dimension del array <=3
		
		for (int i=0;i<=array.length-3;i++) {
			for (int j=0;j<=array[i].length-3;j++) {
				//En este punto i y j forman la esquina sup izquierda del array de 3x3 a evaluar.
				int rtdo=0; 
				for (int k=0;k<3;k++) {
					for (int p=0;p<3;p++) {
						rtdo+=array[i+k][j+p];
					}
				}
				if (rtdo>maxrtdo) {maxrtdo=rtdo;}
			}
		}
		return(maxrtdo);
	}

}
