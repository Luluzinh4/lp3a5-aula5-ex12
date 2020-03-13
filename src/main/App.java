package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = scanner.nextInt();
		do {
			System.out.print("Digite o segundo valor: ");
			numero2 = scanner.nextInt();
			if(numero2 < numero1) {
				System.out.println("Segunda valor menor que o primeiro! Tente novamente...");
			}
		} while(numero2 < numero1);
		
		Thread contagem = new Thread(new ContagemNumeros(numero1, numero2));
		contagem.start();
		
		scanner.close();

	}

}
