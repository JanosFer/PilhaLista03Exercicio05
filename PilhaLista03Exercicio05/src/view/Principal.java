package view;

import javax.swing.JOptionPane;

import br.com.jonas.estruturas.PilhaString;
import controller.HistoricoController;

public class Principal {

	public static void main(String[] args) {
		PilhaString historico = new PilhaString();
		HistoricoController hc = new HistoricoController();
		
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: \n 1 - Inserir um novo endereço no histórico; \n 2 - Exibir o último endereço visitado; \n 3 - Remover o último endereço do histórico;  \n 4 - Limpar histórico; \n 9 - Sair."));
			switch(opc) {
				case 1:
					String endereco = "";
					while (true) {
						endereco = JOptionPane.showInputDialog("Informe um endereço de site: ");
						if(endereco.contains("http://www.") && (endereco.contains(".com") || endereco.contains(".br") || endereco.contains(".net") || endereco.contains(".gov"))) {
							break;
						}
					}
					
					hc.insereEndereco(historico, endereco);
					break;
				case 2:
					hc.consultaUltimoEndereco(historico);
					break;
				case 3:
					hc.removeUltimoEndereco(historico);
					break;
				case 4:
					hc.limpaHistorico(historico);
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Operação inválida!");
			}
		}
	}

}
