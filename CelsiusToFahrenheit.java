package ExercíciosDeConceitosBásicos;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		//TC/5 = (TF – 32)/9, em que TC é temperatura em graus
		
		Scanner entrada = new Scanner(System.in);
		//comandos 
		System.out.println("Qual a temperatura em Celsius?");
		Double tempC = entrada.nextDouble();
		
		//atribuições
		Double TC = tempC;
		Double subtraendo =(double) 32;
		Double divisor2 =(double) 9;
		Double divisor1 =(double) 5;
		//String TFX = "X";
		//Double TF = Double.parseDouble(TFX);
		
		//formula
		Double multiplicação = TC*divisor2;
		Double parentese = divisor1*(-subtraendo);
		Double subtração = parentese-multiplicação;
		Double TF = subtração/(-divisor1);
		
		System.out.println("A temperatura em Fahrenheit é: " + TF + "°");
		
		entrada.close();
		
		
		
		
		
		
		
	}
}
