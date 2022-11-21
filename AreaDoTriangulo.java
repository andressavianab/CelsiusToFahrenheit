package ExercíciosDeConceitosBásicos;

import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		
        // b*h/2
		Scanner entrada = new Scanner(System.in);
		//comandos
		System.out.println("Digite o valor da altura do triângulo ");
		Double altura = entrada.nextDouble();
		System.out.println("Digite o valor da base do triângulo ");
		Double base = entrada.nextDouble();
		
		//formula
		Double multiplicador =(double) 2;
		Double resultado = base*altura/multiplicador;
		
		System.out.println("A área do triângulo é: " + resultado);
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
