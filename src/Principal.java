import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		String nombre;
		String app;
		String contraseña;
		int pin;
		double saldoInicial = 0;
		double deposito;
		Usuario usuario = null;
		Scanner lec = null;
		implementar imp = new implementar();
		int menuPrincipal;
		// TODO Auto-generated method stub
     do{
    	 System.out.println("******************Cajero*******************");
			System.out.print("1 Dar de alta  ");
			System.out.print(" 2 Mostrar ");
			System.out.print(" 3 retiro ");
			System.out.print(" 4 Deposito ");
			System.out.print(" 5 Salir ");
			lec = new Scanner(System.in);
			menuPrincipal= lec.nextInt();
			
			switch(menuPrincipal) {
			case 1:
				System.out.println("Ingrese el nombre");
				lec = new Scanner(System.in);
				nombre= lec.nextLine();
				
				System.out.println("Ingrese el app");
				lec = new Scanner(System.in);
				app= lec.nextLine();
				
				System.out.println("Ingrese la contraseña");
				lec = new Scanner(System.in);
				contraseña = lec.nextLine();
				
				System.out.println("Ingrese tu pin");
				lec = new Scanner(System.in);
				pin = lec.nextInt();
				
				System.out.println("Ingrese ti saldo inicial");
				lec = new Scanner(System.in);
				saldoInicial = lec.nextDouble();
				usuario = new Usuario(nombre,app,contraseña,pin,saldoInicial);
				imp.guardar(contraseña, usuario);
				System.out.println("se guardo el empleado "+ usuario.getNombre());

				break;
				case 2:
					imp.mostrar(); 
					break;
				case 3:
					System.out.println("Peliculas");
					System.out.println("\n Ingrese la contraseña");
					lec = new Scanner( System.in);
					contraseña = lec.nextLine();
					
					usuario = imp.buscar(contraseña);
					System.out.println("Se encontro la cuenta "+ contraseña);
					
					System.out.println("Ingrese la cantidad");
					lec = new Scanner( System.in);
					deposito = lec.nextDouble();
					imp.retirarDinero(contraseña, menuPrincipal);
					System.out.println("se realizo el deposito");
					imp.mostrar();
					
					break;
			}
			
			
     }while(menuPrincipal<5);
	}

}
