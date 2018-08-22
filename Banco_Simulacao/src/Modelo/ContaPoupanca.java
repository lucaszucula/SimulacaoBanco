
package Modelo;

import Controlo.Imprimivel;
import javax.swing.JOptionPane;

/**
 *e subclasse da conta bancaria limita o valor a ser levantado
 * @author Lucas
 */
public class  ContaPoupanca extends ContaBancaria implements Imprimivel{
   public static final double limite = 600;

    @Override
    public void sacar(Double valor) {
        if(valor <= this.getSaldo() + limite){
        this.setSaldo(this.getSaldo()- valor);
        JOptionPane.showMessageDialog(null,"Sacado com sucesso!");
        
        } else{
        JOptionPane.showMessageDialog(null,"Sacado com sucesso!");
}
        
    }

    @Override
    public void depositar(Double valor) {
        if(valor >0){
            this.setSaldo(this.getSaldo() + valor);
       
        JOptionPane.showMessageDialog(null,"depositaste um valor de "+valor+ "Mt");
        }else {
           JOptionPane.showMessageDialog(null,"Nao pode depositar abaixo de 1 metical");
        }
         
        
    

}

    @Override
    public String mostrarDados() {
        return "Cliente :"+this.getNome()+ "proprietario da conta corrente "+this.getNumeroDeConta()+"com seguinte historico:"+this.getHistorico();
    }
}