package newBingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Bingo {
	
	Integer numeroSorteado;
	
	List<Integer> lstbingo = new ArrayList<Integer>();

	public int getNumeroSorteado() {
		return numeroSorteado;
	}

	public void setNumeroSorteado(int numeroSorteado) {
		this.numeroSorteado = numeroSorteado;
	}	
	
	public void sortearNumero() {
		Random aleatorio  = new Random();
		numeroSorteado = aleatorio .nextInt(99) + 1;
		if(lstbingo.isEmpty()) {
			adicionarNumeroLista(numeroSorteado);
		} else 
		verificarNumeroRepetido(numeroSorteado);
	}
	
	public void verificarNumeroRepetido(Integer numeroSorteado) {
		if(!lstbingo.isEmpty()) {
		for(int i=0; i < lstbingo.size(); i++) {
			if(lstbingo.equals(numeroSorteado)) {
				sortearNumero();
			} else {
				adicionarNumeroLista(numeroSorteado);
				break;
			}
		}
		}
		}
	
	public void adicionarNumeroLista(int numeroSorteado) {
		lstbingo.add(numeroSorteado);
		System.out.println("Sorteado: " + numeroSorteado);
	}

	
	public void exibirTodosNumerosSorteados() {
		if(lstbingo.isEmpty()) {
			System.out.println("Nenhum número foi sorteado");
		} else if(!lstbingo.isEmpty()) {
		System.out.println("Foram sorteados " + lstbingo.size() + " números");
		System.out.println("Os números sorteados são: " + lstbingo.toString());
		}
		}
	}
	

