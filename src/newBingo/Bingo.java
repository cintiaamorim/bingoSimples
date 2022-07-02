package newBingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
	
	Integer numeroSorteado;	
	
	List<Integer> lstBingo = new ArrayList<Integer>();
	
	public void verificarLetraDigitada() {
		System.out.println("Digite a letra (R para sortear, X para sair)");
	}
	
	public void sortearNumero() {
		Random aleatorio  = new Random();
		numeroSorteado = aleatorio.nextInt(5) + 1;
		if(lstBingo.isEmpty()) {
			adicionarNumeroLista(numeroSorteado);
		} else 
		verificarNumeroRepetido(numeroSorteado);
	}
	
	public void verificarNumeroRepetido(int numeroSorteado) {
		if(!lstBingo.isEmpty()) {
		for(int i=0; i < lstBingo.size(); i++) {
			if(lstBingo.contains(numeroSorteado)) {
				sortearNumero();
				break;
			} else {
				adicionarNumeroLista(numeroSorteado);
				break;
			}
		}
		}
		}
	
	public void adicionarNumeroLista(int numeroSorteado) {
		lstBingo.add(numeroSorteado);
		System.out.println("Sorteado: " + numeroSorteado);
	}

	
	public void exibirTodosNumerosSorteados() {
		System.out.println("Fim do Sorteio");
		if(lstBingo.isEmpty()) {
			System.out.println("Nenhum número foi sorteado");
		} else if(!lstBingo.isEmpty()) {
		System.out.println("Foram sorteados " + lstBingo.size() + " número(s)");
		Collections.sort(lstBingo);
		System.out.println("Os números sorteados são: " + lstBingo.toString());
		}
		}
	}
	

