package newBingo;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String letra;

		Bingo bingo = new Bingo();	
		
		System.out.println("Digite a letra (R para sortear, X para sair)");
		letra = entrada.next();		
		
		while(letra.equalsIgnoreCase("R")) {
			bingo.sortearNumero(); 
			bingo.verificarLetraDigitada();
			letra = entrada.next();
			if(letra.equalsIgnoreCase("X")) {				
				break;
			}
		}		
  
        bingo.exibirTodosNumerosSorteados();

	}

}
