
package contabancar;

import javax.swing.JOptionPane;

public class ContaBancar {

    public static void main(String[] args) {
    DadoConta dados = new DadoConta();
        
        dados.setagencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agência: ")));
        dados.setNumconta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
        dados.setsenha(JOptionPane.showInputDialog("Digite sua senha: "));    
         
        dados.logar(dados.getagencia(), dados.getNumconta(), dados.getsenha());
        
        }
        
        
    }
    