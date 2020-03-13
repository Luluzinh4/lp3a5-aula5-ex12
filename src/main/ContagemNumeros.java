package main;

public class ContagemNumeros implements Runnable{

	private int primNumero;
	private int segNumero;
	private int auxiliar;
	private int contador = 1;
	private int soma = 0;
	
	
	public ContagemNumeros(int primNumero, int segNumero) {
		this.primNumero = primNumero;
		this.segNumero = segNumero;
	}

	@Override
	public void run() {
		soma = primNumero;
		auxiliar = primNumero;
		while(segNumero >= soma) {
			contador++;
			auxiliar++;
			soma += auxiliar;
		}
		
		System.out.println("Valor Final da contagem: " + contador);
		
	}

}
