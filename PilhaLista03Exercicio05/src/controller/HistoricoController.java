package controller;

import br.com.jonas.estruturas.PilhaString;

public class HistoricoController {
	public HistoricoController(){
		super();
	}
	
	public void insereEndereco(PilhaString historico, String endereco) {
		historico.push(endereco);
	}
	
	public void consultaUltimoEndereco(PilhaString historico) {
		try {
			System.out.println(historico.top());
		} catch (Exception e) {
			System.err.println("O histórico está vazio!");
		}
	}
	
	public void removeUltimoEndereco(PilhaString historico) {
		try {
			System.out.println("Endereço '" + historico.pop() + "' removido!");
		} catch (Exception e) {
			System.err.println("O histórico está vazio");
		}
	}
	
	public void limpaHistorico(PilhaString historico) {
		while(!historico.isEmpty()) {
			try {
				historico.pop();
			} catch (Exception e) {
				System.err.println("O histórico já está vazio");
			}
		}
		System.out.println("O histórico foi limpo!");
	}
}
