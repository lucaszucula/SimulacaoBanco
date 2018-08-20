
package Modelo;

/**
 *
 * @author Lucas
 * subclasse da classe conta bancaria
 */


public class ContaCorrente extends ContaBancaria implements Imprimivel{
    
    
    private double taxaDeOperacao;
    private double TaxaDeOperacao;

    

   
   
    
    public ContaCorrente() {
    }

    /**
     *
     * @param NumeroDeConta
     * @param saldo
     * @param Historico
     * @param tipoDeConta
     */
    public ContaCorrente(int NumeroDeConta, double saldo, String Historico, String tipoDeConta) {    
        super(NumeroDeConta, saldo, Historico, tipoDeConta);
    }

    public double getTaxaDeOperacao() {
        double TaxaDeOperacao = 0;
        return TaxaDeOperacao;
    }
    private String getNumeroDaConta() {
        return getTipoDeConta();
    };

    public void setTaxaDeOperacao() {
       // if (Sacar(taxaDeOperaÃ§Ã£o))
        this.TaxaDeOperacao -= 0.4*this.TaxaDeOperacao;
    }
    
    public void Sacar(Double valor) {
       super.setSaldo(super.getSaldo()-valor); 
       this.setTaxaDeOperacao();
    }

//    public void Depositar(Double valor) {
//       setSaldo(getSaldo()+valor);
//        this.setTaxaDeOperacao();  
//    }


    @Override
    public double sacar(double valor) {
super.setSaldo(super.getSaldo()-valor); 
       this.setTaxaDeOperacao();
        return 0;
    }

  //  @Override
//    public boolean depositar(double valor) {
// setSaldo(getSaldo()+valor);
////        this.setTaxaDeOperacao();      }
//
//    
//
//
///**
// * 
// * @return 
// */
//    @Override
//     boolean mostrarDados() {
//        System.out.println("Conta Corente");
//        System.out.println("Numero da Conta"+getNumeroDaConta());
//        System.out.println("Saldo"+getSaldo());
//        System.out.println("Taxa de Operacao"+getTaxaDeOperacao());
//        return true;
//    }


    
    
    

    
}

