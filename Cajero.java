import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;


public class Cajero{	
	public static void main (String args []){	
		Scanner can = new Scanner (System.in);
		Random rand = new Random();
		BigInteger numTrans = new BigInteger(50,rand);
		
		int saldo,a,b,c,d,f,g,e,op,k1;
		op = 0;
		
		int op1 = 50;
		int op2 = 100;
		int op3 = 200;
		int op4 = 500;
		int op5 = 1000;
		
		int max;
		max = 0;
		String Usuario; 
		String contrasena;
		char oper;
		
		
		System.out.println("Identifiquese porfavor. Quien eres?");
		System.out.println("1.Barne" );
		System.out.println("2.Juan ");
		System.out.println("3.Pedro");
		System.out.println("4.papa");
		System.out.println("5.lolo");	
			
		k1 = can.nextInt();
		
		switch (k1){
				case 1:
					do{
		
					System.out.println("Ingrese su nombre clave");
					Usuario = can.next();
					
					System.out.println("-----------------------------------");
					System.out.println("Ingrese su contraseña");
					contrasena = can.next();
					
				if(Usuario.equals("Barne") && contrasena.equals("pk2MeS8X")){
				System.out.println("Hola "+ Usuario);
					
					
					
					saldo = 200;
					System.out.println("Bienvenido barne");
					System.out.println("Su saldo es " + saldo);
					System.out.println("");
					
					System.out.println("-----------------------------------");
					System.out.println("Sacara dinero?");
			
					System.out.println("1.Si");
					System.out.println("2.No");
					
					a = can.nextInt();
					System.out.println("-----------------------------------");
				do{
				if	(a == 1){
					System.out.println("Sacara:");
					System.out.println("50 " );
					System.out.println("100 ");
					System.out.println("200 ");
					System.out.println("500 ");
					System.out.println("1000 ");
					System.out.println(" ");
					System.out.println("10.Salir");	
					System.out.println("-----------------------------------");
			
				}else if ( a >= 2){
					System.out.println("Adios");
					System.exit(0);
				}
			
			
					b = can.nextInt();
			
			
			switch (b){
					case 50:
					if (saldo >= 0 && saldo >= 50 && saldo <= 2000 ){
						
						c = saldo - op1;
						saldo = c;
						System.out.println("Ahora su saldo es: " + c);
						System.out.println("Numero de transaccion" + numTrans);
						System.out.println("Gracias por su retiro. Que pase un buen dia ");
					}else{ 
						System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
						break;
					}
					break;
			
					
					
					
					case 100:
					if (saldo >= 0 && saldo >= 50 && saldo <= 2000){
						d = saldo - op2;
						saldo = d;
						System.out.println("Ahora su saldo es: " + d );
						System.out.println("Numero de transaccion" + numTrans);
						System.out.println("Gracias por su retiro. Que pase un buen dia ");
						break;
					
						}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
								System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
								System.out.println("Gracias ´por usar nuestro banco");
								System.exit(0);
						break;
						}
					
					
					case 200:
					if (saldo >= 0 && saldo >= 50 && saldo <= 2000 && b <= saldo){
						e = saldo - op3;
						saldo = e;
						System.out.println("Ahora su saldo es: " + e );
						System.out.println("Numero de transaccion" + numTrans);
						System.out.println("Gracias por su retiro. Que pase un buen dia ");
						break;
					
						}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
								System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
								System.out.println("Gracias ´por usar nuestro banco");
								System.exit(0);
						break;
						}
					
					
					case 500:
					if (saldo >= 0 && saldo >= 50 && saldo <= 2000 && b < 200){
						f = saldo - op4;
						saldo = f;
						System.out.println("Ahora su saldo es: " + f );
						System.out.println("Numero de transaccion" + numTrans);
						System.out.println("Gracias por su retiro. Que pase un buen dia ");
						break;
					
						}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
								
						break;
						}
				
					
					case 1000:
					if (saldo >= 0 && saldo >= 50 && saldo <= 2000 && b < 200){
								g = saldo - op5;
								saldo = g;
								System.out.println("Ahora su saldo es: " + g );
								System.out.println("Numero de transaccion" + numTrans);
								System.out.println("Gracias por su retiro. Que pase un buen dia ");
						break;
						}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
							
						break;
						}
						
					case 10:
						System.out.println("Gracias por Usar nuestro banco (ouo)");
						System.exit(0);
						break;
					
					
					default: System.out.println( "No es una opcion valida: " );
			}
		}while (1 == 1);
				}else{ System.out.println("-----------------------------------");
						System.out.println("Usuario invalido, intente denuevo");
				}		System.out.println("-----------------------------------");
				}while (1==1);
					
					case 2:
					do{
						System.out.println("Ingrese su nombre clave");
						Usuario = can.next();
					
						System.out.println("-----------------------------------");
						System.out.println("Ingrese su contraseña");
						contrasena = can.next();
					
					if(Usuario.equals("Juan") && contrasena.equals("pk2MeS8X")){
					System.out.println("Hola "+ Usuario);
					
						saldo = 300;
						System.out.println("Bienvenido Juan");
						System.out.println("Su saldo es " + saldo);
						System.out.println("");
					System.out.println("-----------------------------------");
						System.out.println("Sacara dinero?");
			
						System.out.println("1.Si");
						System.out.println("2.No");
				
						a = can.nextInt();
						System.out.println("-----------------------------------");
			do{
				if	(a == 1){
				System.out.println("-----------------------------------");
				System.out.println("Sacara:");
				System.out.println("50 " );
				System.out.println("100 ");
				System.out.println("200 ");
				System.out.println("500 ");
				System.out.println("1000 ");
				System.out.println(" ");
				System.out.println("10.Salir");	
				System.out.println("-----------------------------------");
			}else if ( a >= 2){
				System.out.println("Adios");
				System.exit(0);
			}
			
				
			
				b = can.nextInt();
			
			switch (b){
				case 50:
				if (saldo >= 0 && saldo >= 50 && saldo <=300){
		
					c = saldo - op1;
					saldo = c;
					System.out.println("Ahora su saldo es: " + c);
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
			
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
						
					break;
						
					}
					
					
				case 100:
				if (saldo >= 0 && saldo >= 50 && saldo <=300){
					
					d = saldo - op2;
					saldo = d;
					System.out.println("Ahora su saldo es: " + d );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 200:
				if (saldo >= 0 && saldo >= 50 && saldo <=300){
					
					e = saldo - op3;
					saldo = e;
					System.out.println("Ahora su saldo es: " + e );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 500:
				if (saldo >= 0 && saldo >= 50 && saldo <=300){
					
					f = saldo - op4;
					saldo = f;
					System.out.println("Ahora su saldo es: " + f );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						
					break;
				}
					
					
				case 1000:
					if (saldo >= 0 && saldo >= 50 && saldo <=300){
					
					g = saldo - op5;
					saldo = g;
					System.out.println("Ahora su saldo es: " + g );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						
					break;
				}
				case 10:
						System.out.println("Gracias por Usar nuestro banco (ouo)");
						System.exit(0);
						break;
				
					
				default: System.out.println( "No tiene suficiente dinero porque su saldo es: "+ saldo);
				break;
			}
		}while (1 == 1);
				}else{ 	System.out.println("-----------------------------------");
						System.out.println("Usuario invalido, intente denuevo");}
						System.out.println("-----------------------------------");
				}while (1 == 1);
						
			case 3:
				do{
				System.out.println("Ingrese su nombre clave");
				Usuario = can.next();
					
					System.out.println("-----------------------------------");
					System.out.println("Ingrese su contraseña");
					contrasena = can.next();
					
				if(Usuario.equals("Pedro") && contrasena.equals("pk2MeS8X")){
					System.out.println("Hola "+ Usuario);
					
					
				saldo = 400;
				System.out.println("Bienvenido Pedro");
				System.out.println("Su saldo es " + saldo);
				System.out.println("");
				System.out.println("-----------------------------------");
				System.out.println("Sacara dinero?");
			
				System.out.println("1.Si");
				System.out.println("2.No");
				System.out.println("-----------------------------------");
				
				a = can.nextInt();
			do{
			if	(a == 1){
				System.out.println("-----------------------------------");
				System.out.println("Sacara:");
				System.out.println("50 " );
				System.out.println("100 ");
				System.out.println("200 ");
				System.out.println("500 ");
				System.out.println("1000 ");
				System.out.println(" ");
				System.out.println("10.Salir");	
				System.out.println("-----------------------------------");
			}else if ( a >= 2){
				System.out.println("Adios");
				System.exit(0);
			}
			
				
				b = can.nextInt();
			
			switch (b){
				case 50:
				if (saldo >= 0 && saldo >= 50 && saldo <= 400){
		
					c = saldo - op1;
					saldo = c;
					System.out.println("Ahora su saldo es: " + c);
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
			
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
						
					}
					
					
				case 100:
				if (saldo >= 0 && saldo >= 50 && saldo <= 400){
					
					d = saldo - op2;
					saldo = d;
					System.out.println("Ahora su saldo es: " + d );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 200:
				if (saldo >= 0 && saldo >= 50 && saldo <= 400){
					
					e = saldo - op3;
					saldo = e;
					System.out.println("Ahora su saldo es: " + e );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 500:
				if (saldo >= 0 && saldo >= 50 && saldo <= 400){
					
					f = saldo - op4;
					saldo = f;
					System.out.println("Ahora su saldo es: " + f );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						
						
					break;
				}
					
					
				case 1000:
					if (saldo >= 0 && saldo >= 50 && saldo <= 400){
					
					g = saldo - op5;
					saldo = g;
					System.out.println("Ahora su saldo es: " + g );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						
					
					break;
				}
				case 10:
						System.out.println("Gracias por Usar nuestro banco (ouo)");
						System.exit(0);
						break;
					
				default: System.out.println( "No tiene suficiente dinero porque su saldo es: "+ saldo);
				break;
			}
		}while (1 == 1);
				}else{ 	System.out.println("-----------------------------------");
						System.out.println("Usuario invalido, intente denuevo");
						System.out.println("-----------------------------------");}
						
				}while (1 == 1);
				
				case 4:
				do{
					System.out.println("Ingrese su nombre clave");
					Usuario = can.next();
					
					System.out.println("--------------------------------");
					System.out.println("Ingrese su contraseña");
					contrasena = can.next();
					
				if(Usuario.equals("papa") && contrasena.equals("pk2MeS8X")){
				System.out.println("Hola "+ Usuario);
					
					
				saldo = 500;
				System.out.println("Bienvenido papa");
				System.out.println("Su saldo es " + saldo);
				System.out.println("");
				System.out.println("-----------------------------------");
				System.out.println("Sacara dinero?");
			
				System.out.println("1.Si");
				System.out.println("2.No");
				System.out.println("-----------------------------------");
				a = can.nextInt();
			
			do{
			if	(a == 1){
				System.out.println("-----------------------------------");
				System.out.println("Sacara:");
				System.out.println("50 " );
				System.out.println("100 ");
				System.out.println("200 ");
				System.out.println("500 ");
				System.out.println("1000 ");
				System.out.println(" ");
				System.out.println("10.Salir");	
				System.out.println("-----------------------------------");
				
			}else if ( a >= 2){
				System.out.println("Adios");
				System.exit(0);
			}
			
				
				b = can.nextInt();
			
			switch (b){
				case 50:
				if (saldo >= 0 && saldo >= 50 && saldo <= 500){
		
					c = saldo - op1;
					saldo = c;
					System.out.println("Ahora su saldo es: " + c);
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
			
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
						
					}
					
					
				case 100:
				if (saldo >= 0 && saldo >= 50 && saldo <= 500){
					
					d = saldo - op2;
					saldo = d;
					System.out.println("Ahora su saldo es: " + d );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 200:
				if (saldo >= 0 && saldo >= 50 && saldo <= 500){
					
					e = saldo - op3;
					saldo = e;
					System.out.println("Ahora su saldo es: " + e );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 500:
				if (saldo >= 0 && saldo >= 50 && saldo <= 500){
					
					f = saldo - op4;
					saldo = f;
					System.out.println("Ahora su saldo es: " + f );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 1000:
					if (saldo >= 0 && saldo >= 50 && saldo <= 500){
					
					g = saldo - op5;
					saldo = g;
					System.out.println("Ahora su saldo es: " + g );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						
					break;
				}
				case 10:
						System.out.println("Gracias por Usar nuestro banco (ouo)");
						System.exit(0);
						break;
					
				default: System.out.println( "No tiene suficiente dinero porque su saldo es: "+ saldo);
				break;
			}
		}while (1 == 1);
				}else{ 	System.out.println("-----------------------------------");
						System.out.println("Usuario invalido, intente denuevo");}
						System.out.println("-----------------------------------");
				}while (1==1);
					
				case 5:
					do{
					System.out.println("Ingrese su nombre clave");
					Usuario = can.next();
					
					System.out.println("--------------------------------");
					System.out.println("Ingrese su contraseña");
					contrasena = can.next();
					
					if(Usuario.equals("lolo") && contrasena.equals("pk2MeS8X")){
					System.out.println("Hola "+ Usuario);
				
					
					saldo = 2500;
					System.out.println("Bienvenido lolo");
					System.out.println("Su saldo es " + saldo);
					System.out.println("");
					
					System.out.println("Sacara dinero?");
			
					System.out.println("1.Si");
					System.out.println("2.No");
					System.out.println("--------------------------------");
			
			a = can.nextInt();
			
			do{
			if	(a == 1){
				System.out.println("-----------------------------------");
				System.out.println("Sacara:");
				System.out.println("50 " );
				System.out.println("100 ");
				System.out.println("200 ");
				System.out.println("500 ");
				System.out.println("1000 ");
				System.out.println(" ");
				System.out.println("10.Salir");	
				System.out.println("-----------------------------------");
			
			}else if ( a >= 2){
				System.out.println("Adios");
				System.exit(0);
			}
			
			
				b = can.nextInt();
			
			switch (b){
				case 50:
				if (saldo >= 0 && saldo >= 50 && max < 2000){
		
					c = saldo - op1;
					saldo = c;
					saldo = max;
					System.out.println("Ahora su saldo es: " + c);
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					
					break;
			
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
						
					}
					
					
				case 100:
				if (saldo >= 0 && saldo >= 50 && max < 2000){
					
					d = saldo - op2;
					saldo = d;
					saldo = max;
					System.out.println("Ahora su saldo es: " + d );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 200:
				if (saldo >= 0 && saldo >= 50 && max < 2000){
					
					e = saldo - op3;
					saldo = e;
					saldo = max;
					System.out.println("Ahora su saldo es: " + e );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 500:
				if (saldo >= 0 && saldo >= 50 && max < 2000){
					
					f = saldo - op4;
					saldo = f;
					saldo = max;
					System.out.println("Ahora su saldo es: " + f );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
					
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
					
					
				case 1000:
					if (saldo >= 0 && saldo >= 50 && max <= 2000){
					
					g = saldo - op5;
					saldo = g;
					saldo = max;
					System.out.println("Ahora su saldo es: " + g );
					System.out.println("Numero de transaccion" + numTrans);
					System.out.println("Gracias por su retiro. Que pase un buen dia ");
					break;
				}else{ System.out.println("Su saldo no es suficiente porque su saldo es" +saldo);
						System.out.println("Ahora que no tiene dinero y no puede realizar acciones tendremos que sacarlo del sistema");
						System.out.println("Gracias ´por usar nuestro banco");
						System.exit(0);
					break;
				}
				case 10:
						System.out.println("Gracias por Usar nuestro banco (ouo)");
						System.exit(0);
						break;
					
				default: System.out.println( "No tiene suficiente dinero porque su saldo es: "+ saldo);
				break;
			}
		}while (1 == 1);
				}else{ 
					System.out.println("--------------------------------");
					System.out.println("Usuario invalido, intente denuevo");}
					System.out.println("--------------------------------");
				
			}while (1 == 1);	
	}
}
}

/*

	
	if(condicion){
		// si se cumple la condicion
		system.out.println("Bienvenido usuario");
	}else{
		// si no se cumple
		SYstem.out.println("no tienes permitido estar aqui");
	}



*/