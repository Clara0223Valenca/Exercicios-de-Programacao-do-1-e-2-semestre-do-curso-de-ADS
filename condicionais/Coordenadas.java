package condicionais;
import java.util.*;

public class Coordenadas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Informe valor de x");
		double x = tec.nextDouble();
		
		System.out.print("Informe valor de y");
		double y = tec.nextDouble();
		
		
		//Q1
		if (x>0 && y>0) {
			System.out.println(" Quadrante 01");
		}
		
		//Q2
		if (x<0 && y>0) {
			System.out.println(" Quadrante 02");
		}
				
		//Q3
		if (x<0 && y<0) {
			System.out.println(" Quadrante 03");
		}		

		//Q4
		if (x>0 && y<0) {
			System.out.println(" Quadrante 04");
			}		

		//eixo x
		if (y==0) {
			System.out.println("Eixo x");
		}	
		
		//eixo y
		if (x==0) {
			System.out.println("Eixo y");
		}		

		//origem
		if (x==0 && y==0) {
			System.out.println("Origem");
		}
		
		
		   /*
		    					 ^ y
							     |
							     |
					   	q2	     |		q1
							     |
							     |
			   -------------------------------------> x 
							     |
							     |
						q3	     |       q4
							     |
							     |
		      
		      
		     */
		
	}

}
