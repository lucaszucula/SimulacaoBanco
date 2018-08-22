
package Modelo;
import Controlo.Relatorio;

/**
 *
 * @author Lucas
 */
public class Executavel {
    

    public static void main(String[] args) {
        
//        
//        ContaBancaria cc = new ContaCorrente();
//        ContaBancaria cp = new ContaPoupanca();
          ContaCorrente cc = new ContaCorrente();
          ContaPoupanca cp = new ContaPoupanca();
          Relatorio relatorio = new  Relatorio();

         
        cc.depositar(9000.0);
        cc.sacar(500.00);
//        cp.depositar(90.00);
//        cp.sacar(200.00);
        
        System.out.println(relatorio.gerarRelatorio(cc));
        System.out.println(relatorio.gerarRelatorio(cp));

    }
    
}
