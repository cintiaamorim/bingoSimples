package newBingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo {
	
	Integer numeroSorteado;
	
	List<Integer> lstBingo = new ArrayList<Integer>();
	
	public void sortearNumero() {
		Random aleatorio  = new Random();
		numeroSorteado = aleatorio .nextInt(99) + 1;
		if(lstBingo.isEmpty()) {
			adicionarNumeroLista(numeroSorteado);
		} else 
		verificarNumeroRepetido(numeroSorteado);
	}
	
	public void verificarNumeroRepetido(Integer numeroSorteado) {
		if(!lstBingo.isEmpty()) {
		for(int i=0; i < lstBingo.size(); i++) {
			if(lstBingo.equals(numeroSorteado)) {
				sortearNumero();
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
		if(lstBingo.isEmpty()) {
			System.out.println("Nenhum número foi sorteado");
		} else if(!lstBingo.isEmpty()) {
		System.out.println("Foram sorteados " + lstBingo.size() + " números");
		System.out.println("Os números sorteados são: " + lstBingo.toString());
		}
		}
	}
	

