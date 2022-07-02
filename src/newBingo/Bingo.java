package newBingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
	
	Integer numeroSorteado;		
	
	boolean maxLista = false;
	
	List<Integer> lstBingo = new ArrayList<Integer>();
	
	public void sortearNumero() 
	{
			if(lstBingo.size() == 5) 
			{
				System.out.println("N�o existem mais n�meros poss�veis para sortear");
				maxLista = true;
			} else 
			{
				Random aleatorio = new Random();
				numeroSorteado = aleatorio.nextInt(5) + 1;
				if(lstBingo.isEmpty()) 
				{
					adicionarNumeroLista(numeroSorteado);
				} else 
					{
						verificarNumeroRepetido(numeroSorteado);
					}
	 		} 
	}
	
	public void verificarNumeroRepetido(int numeroSorteado) {
		if(!lstBingo.isEmpty()) {
		for(int i=0; i < lstBingo.size();) {
			if(lstBingo.contains(numeroSorteado)) {
				sortearNumero();
				break;
				} else 
				adicionarNumeroLista(numeroSorteado);
				break;			
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
			System.out.println("Nenhum n�mero foi sorteado");
		} else if(!lstBingo.isEmpty()) {
		System.out.println("Foram sorteados " + lstBingo.size() + " n�mero(s)");
		Collections.sort(lstBingo);
		System.out.println("Os n�meros sorteados s�o: " + lstBingo.toString());
		}
		}
	}
	

