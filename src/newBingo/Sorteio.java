package newBingo;

import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		Bingo bingo = new Bingo();		
		
		String letra;
		
		System.out.println("Digite a letra (R para sortear, X para sair)");
		letra = entrada.next();
		if(letra.equalsIgnoreCase("X")) {
			System.out.println("Fim do sorteio");
		}
		
		while(letra.equalsIgnoreCase("R")) {
			bingo.sortearNumero(); 
			System.out.println("Digite a letra (R para sortear, X para sair)");
			letra = entrada.next();
			if(letra.equalsIgnoreCase("X")) {				
				break;
			}
		}		
  
        bingo.exibirTodosNumerosSorteados();

	}

}
