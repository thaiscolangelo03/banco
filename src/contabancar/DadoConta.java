
package contabancar;

import javax.swing.JOptionPane;

public class DadoConta {
    public int numconta;
    public int agencia;
    public String nome;
    private double saldo;
    private String senha;
    private boolean logado = false;

    
    public int getNumconta() {
    return numconta;
    }
    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }
    
    
    public int getagencia() {
    return agencia;
    }
    public void setagencia(int agencia) {
        this.agencia = agencia;
    }
    
    
    public String getNomecliente() {
        return nome;
    }
    public void setNomecliente(String nomecliente) {
        this.nome = nomecliente;
    }
    
    
    public String getsenha() {
        return senha;
    }
    public void setsenha(String senha) {
        this.senha = senha;
    }
   
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public boolean islogado() {
    return logado;
    }
    public void setlogado(boolean logado) {
        this.logado = logado;
    }
    
    public boolean logar(int agencia, int numConta, String senha){
        if (agencia == 1234 && numConta == 1 && "abc123".equals(senha)) {
        this.logado = true;
        atual(this.logado);
        }
        else{
            JOptionPane.showMessageDialog(null, "Dados Incorretos!");
            this.logado = false;
        }
        return this.logado;
    }
     
    public void atual (boolean logado){
        if (logado == true) {
            int escolha;
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n"
            + "1 - Depósito\n"
            + "2 - Saque\n"
            + "3 - Consulta de Saldo\n"
            + "4 - Sair"));
        switch(escolha){
            case 1:
                depositar (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o depósito")), this.logado);
                break;
            case 2:
                sacar (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o saque")), this.logado);
                break;
            case 3:
                consultarSaldo (this.logado);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Obrigado! \n"
                + "retorne sempre que preciso!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");      
                    }
                        }
        
                                    }    
    
        public void depositar (double valor, boolean logado){
        this.saldo = this.saldo + valor;
            String opcao;
            opcao = JOptionPane.showInputDialog("Deseja realizar alguma outra operação?\n"
            + "1 - Sim\n"
            + "0 - Não");
            
        switch(opcao){
            case "1":
                atual(this.logado);
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "Obrigado\n"
                + "retorne sempre que preciso!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");      
                    }
                                                            }
        
        public void consultarSaldo (boolean logado){

            JOptionPane.showMessageDialog(null, "O saldo atual de sua conta é de:\n"
            + "R$ " + getSaldo());
            String opcao;
            opcao = JOptionPane.showInputDialog("Deseja realizar alguma outra operação?\n"
            + "1 - Sim\n"
            + "0 - Não");
            
        switch(opcao){
            case "1":
                atual(this.logado);
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "Obrigado\n"
                + "retorne sempre que preciso!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");      
                    }
                                                     }
        
        
        public void sacar(double valor, boolean logado){
        this.saldo = this.saldo - valor;
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar alguma outra operação?\n"
            + "1 - Sim\n"
            + "0 - Não");  
        switch(opcao){
        case "1":
                atual(this.logado);
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "Obrigado\n"
                + "retorne sempre que preciso!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "opção Inválida!");      
                    }    
        }
    
        
}  

