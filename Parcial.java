/*
* <UNIME>
* <BSI>
* <PROGAMAÇÃO ORIENTADA A OBJETO 2>
* <PABLO ROXO>
* <LUIS RICARDO SOUSA BORGES>
*/



package parcial1;
import java.util.Scanner;

public class Parcial {

	public static void main(String[] args) {
		double nota1, nota2, nota3, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota: ");
		nota1 =  teclado.nextDouble();
		
		System.out.println("Digite a 2° nota: ");
		nota2 =  teclado.nextDouble();
		
		System.out.println("Digite a 3° nota: ");
		nota3 =  teclado.nextDouble();
		
		System.out.println("A nota final é: ");
		System.out.println(resultado = ((nota1 + nota2 + nota3) / 3));
		
		if (resultado >= 7) {
			System.out.println("Você esta aprovado");
		}
		 else if (resultado == 4) {
				System.out.println("Você esta na recuperação");
		 }
		 else if (resultado <= 3) {
				System.out.println("Você esta reprovado");
		 }
		
	}

}
