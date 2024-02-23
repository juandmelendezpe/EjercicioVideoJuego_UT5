package VideoJuego.Ejercicio1;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char index;
		do {
			System.out.println("---MENU----");
			System.out.println("1----------");
			System.out.println("2----------");
			System.out.println("3----------");
			System.out.println("4----------");
			System.out.println("5----------");
			System.out.println("6----------");
			System.out.println("7----------");
			System.out.println("8-----SALIR-----");
			do {
				System.out.print("introduce la opcion deseada :");
			 index = sc.nextLine().charAt(0);
				
			}while(index < '1' || index >'8');
			
			switch (index) {
			case '1': 
				System.out.println("hola opcion 1");
				break;
				case '2':
					System.out.println("opcion 2");
					break;
				case '7':
					
					System.out.println("opcion 7");
					
					break;
					
			} if(index !='8') {
				System.out.println("pulse una tecla para continuar");
				sc.nextLine();
			}
			}while(index !='8');
			sc.close();
	
	}
}
