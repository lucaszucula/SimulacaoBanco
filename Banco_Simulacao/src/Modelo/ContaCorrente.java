
package Modelo;

import Controlo.Imprimivel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 * Classe que herda da conta bancaria que contem atributo que permite descontar quando
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel {
    //taxxa
    double taxaDeOperacao = 0.1;

    @Override
    public void sacar(Double valor) {
        
        if(this.getSaldo()>= valor + valor*taxaDeOperacao){
            this.setSaldo(this.getSaldo()- valor- (valor*taxaDeOperacao));
        JOptionPane.showMessageDialog(null,"Sacado com sucess0!");
        } else{
            JOptionPane.showMessageDialog(null,"Sem sucesso ao sacar");
                
                }
   
    }
    /**
     * metodo qpara depositar incluindo taxa de operacao
     * @param valor 
     */
    @Override
    public void depositar(Double valor) {
        if(valor>0){
            this.setSaldo(this.getSaldo()+valor- (valor*taxaDeOperacao));
            JOptionPane.showMessageDialog(null,"deposito bem sucedido");
    }else 
            JOptionPane.showMessageDialog(null,"deposito mal sucedido");
    
}

    @Override
    public String mostrarDados() {
return "cliente :"+this.getNome()+ "conta  poupanca "+this.getNumeroDeConta()+" com seguinte historico :"+this.getHistorico();
        }
}
