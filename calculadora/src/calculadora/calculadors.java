package calculadora;

import java.io.EOFException;
import java.util.Scanner;

public class calculadors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				while(true) {
						System.out.print("Elige un numero del 1 al 4");
						System.out.print("\n");
						System.out.print("1.Sumar");
						System.out.print("\n");
						System.out.print("2.Restar");
						System.out.print("\n");
						System.out.print("3.Multiplicar");
						System.out.print("\n");
						System.out.print("4.Dividir");
						System.out.print("\n");
						System.out.print("5.Salir");
						Scanner scr=new Scanner(System.in);
						int opcion=scr.nextInt();
						switch(opcion) {
						case 1:
							sumar();
							break;
						case 2:
							restar();
							break;
						case 3:
							multiplicar();
							break;
						case 4:
							divi();
							break;
						case 5:
							System.exit(0);
							break;
							default:
								System.out.println("Esa opción "+opcion+" no esta");
						}
				}
						
					}
					
					static void sumar() {
						
						int numero1 = 0;
						int numero2 = 0;
						int resultado;
						Scanner scr= new Scanner(System.in);
						try {
							System.out.print("Dime el primer número: ");
							 numero1=scr.nextInt();			
							System.out.print("Dime el Segundo número: ");
							numero2=scr.nextInt();	
							
							resultado=numero1+numero2;
							System.out.println("El resultado de la suma es:  "+resultado);
						}catch(Exception e) {
							System.out.print("\nTiene que ser un número");
						}
						
						
					}
					static void restar() {
						int numero1 = 0;
						int numero2 = 0;
						int resultado;
						Scanner scr= new Scanner(System.in);
						try {
							System.out.print("Dime el primer número: ");
							 numero1=scr.nextInt();			
							System.out.print("Dime el Segundo número:");
							numero2=scr.nextInt();	
							
							resultado=numero1-numero2;
							System.out.println("El resultado de la resta es:  "+resultado);
						}catch(Exception e) {
							System.out.print("\nTiene que ser un número");
						}
						
						
					}
					static  void multiplicar() {
						int numero1 = 0;
						int numero2 = 0;
						int resultado;
						Scanner scr= new Scanner(System.in);
						try {
							System.out.print("Dime el primer número: ");
							 numero1=scr.nextInt();			
							System.out.print("Dime el Segundo número: ");
							numero2=scr.nextInt();	
							
							resultado=numero1*numero2;
							System.out.println("El resultado de la multi es: "+resultado);
						}catch(Exception e) {
							System.out.print("\nTiene que ser un número");
						}
						
					}
					
					
					
					
					static void divi() {
						int numero1 = 0;
						int numero2 = 0;
						int resultado;
						Scanner scr= new Scanner(System.in);
						
						try {
							System.out.print("Dime el primer número: ");
							 numero1=scr.nextInt();			
							System.out.print("Dime el Segundo número: ");
							numero2=scr.nextInt();	
							if( numero2 !=0) {
								resultado=numero1/numero2;
								System.out.println("El resultado de la división es: "+resultado);
							}else {
								System.out.print("\nEl número no se puede divir entre 0");
							}
							
						}catch(Exception e) {
							System.out.print("\nTiene que ser un número");
							
						}
			
	}
	
}
