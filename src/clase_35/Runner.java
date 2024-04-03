package clase_35;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		
	Alumno[] alumnos= new Alumno[2];
	Scanner scanner= new Scanner(System.in);
		
		for(int i=0; i < alumnos.length;i++){
			System.out.println("-------------------------------");
			Alumno alumno= new Alumno();
			
			System.out.println("Ingrese el nombre del Alumno:");
			alumno.nombre= scanner.nextLine();
			
			System.out.println("Ingrese el promedio de Matematicas:");
			alumno.promedioMatematica= scanner.nextDouble();
			
			System.out.println("Ingrese el promedio de Lenguaje:");
			alumno.promedioLenguaje= scanner.nextDouble();
			
			System.out.println("Ingrese el promedio de Historia:");
			alumno.promedioHistoria= scanner.nextDouble();
			
			System.out.println("Ingrese el promedio de Ciencia:");
			alumno.promedioCiencia= scanner.nextDouble();
			
			promedio(alumno);
			alumnos[i]=alumno;
			scanner.nextLine();
		}
		
		double acumulador=0;
		for(Alumno alumno : alumnos) {
			
			String estado="Reprueba";
			if(alumno.promedioFinal>=4) {
				estado="Aprueba";
			}
			
			acumulador+= alumno.promedioFinal;
			
			System.out.println("El Alumno "+alumno.nombre.toUpperCase()+ " promedio: "+alumno.promedioFinal+ " y estado final es "+estado);
		}
		System.out.println("El Promedio del curso es "+(acumulador/alumnos.length));
		
		
		
		
		
	
	}
	
	private static void promedio(Alumno alumno) {
		double matematica=alumno.promedioMatematica;
		double lenguaje=alumno.promedioLenguaje;
		double historia=alumno.promedioHistoria;
		double ciencia=alumno.promedioCiencia;
		
		double promedio=(matematica+lenguaje+historia+ciencia)/4;
		
		alumno.promedioFinal= Math.round(promedio);
	}

}
