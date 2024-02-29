package br.edu.fatecpg.controleversao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacao;
		double num1, num2, resultado = 0;
		Calculadora calc = new Calculadora();
		
		Scanner ler = new Scanner(System.in);
		
		while(true){
			
			System.out.println("digite a opração desejada \n 1 - soma "
					+ "\n 2 - subtração \n 3 - multiplicação 4 - divião \n 5 para sair");
			operacao = ler.nextInt();
			
			if(operacao == 5) {
				
				break;
			}
			
			System.out.println("Digite primeiro valor");
			num1 = ler.nextDouble();
			System.out.println("Digite segundo valor");
			num2 = ler.nextDouble();
			
			
			switch(operacao) {
			case 1: 
				resultado = calc.soma(num1, num2);
			break;
			case 2: 
				resultado = calc.subtrai(num1, num2);
			break;
			case 3: 
				resultado = calc.multiplicacao(num1, num2);
			break;
			case 4: 
				resultado = calc.divisao(num1, num2);
			break;
			

			}
			
			System.out.println(resultado);
		}
		
		
		System.out.println(calc.soma(20, 10));
	}
	

}
