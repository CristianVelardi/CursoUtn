package CursoJAVA;
import java.util.Scanner;
public class GuiaN1 {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
			//1. Vamos a practicar operaciones básicas con números
			//a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
			//y “b”
		/*	
	int a = 20, b = 5;
	while(a>b) {
		System.out.println(b);
		b++;   }
		*/
		/*b. A lo anterior, solo muestre los números pares
		
		int a = 20, b = 5;
		while(a>b) {
			if(b %2==0) 
			System.out.println(b);
			b++;        
				   }
		*/
		/*	c. A lo anterior, con una variable extra, elija si se deben mostrar los números
		    pares o impares
		int a = 20, b = 5;
		boolean bo = true;
		if(bo = true) {
		while(a>b) {
			if(b %2==0) 
			System.out.println(b);
			b++;        
				   }  }
		 if (bo = false) {
			while(a>b) {
				if(b %2 != 0) 
				System.out.println(b);
				b++;        
					   } 
			
					     }
		*/
		
		/*d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden

	
		for(int i=20;i>5;i--) {
			if(i %2==0)
			System.out.println(i);
		}
		*/
		int ingresos,vehiculos,antiguedadvehiculo,inmuebles,activossocietarios;
		
			
		System.out.println("Aqui se determina si usted entra en la categoria de ingresos altos");
		
		System.out.println("Digite sus ingresos mensuales: ");
		ingresos = entrada.nextInt();
		System.out.println("En el caso de poseer vehiculos con menor antiguedad de 5 anios digite cuantos dispone a su nombre: ");
		vehiculos = entrada.nextInt();
		System.out.println("Digite si tiene inmuebles a su nombre: ");
		inmuebles = entrada.nextInt();
		System.out.println("Usted posee embarcaciones, aeronaves o activos societarios con alta rentabilidad...Digite cuantas: ");
		activossocietarios = entrada.nextInt();
		
		if ((ingresos >= 489083)||(vehiculos >= 3)||(inmuebles >=3)||(activossocietarios>=1)){
			System.out.println("Usted tiene plata\n Gracias y disculpe las molestias");
		}
		else System.out.println("No entra en la categoria de Acaudalado\n Por no decirle Pobre"); 
}
	}
