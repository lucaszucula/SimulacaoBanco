
package Modelo;

/**
 *E  subclasse da conta bancaria
 * @author Lucas
 */
public  abstract class ContaPoupanca extends ContaBancaria implements Imprimivel{
    
    
     public Double limite;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int NumeroDeConta, double saldo, String Historico, String tipoDeConta) {
        super(NumeroDeConta, saldo, Historico, tipoDeConta);
    }

      public void setLimite(double limite) {
        //setSaldo(limite+ getSaldo());
        this.limite = limite;
    }
 

      
         

//    @Override
//    public void Depositar(Double valor) {
//        setSaldo(getSaldo()+valor);
//    }

     

     


//    @Override
//      public  boolean mostrarDados() {
//        System.out.println("Conta Poupanca");
//        System.out.println("Numero da Conta"+this.getNumeroDeConta());
//        System.out.println("Saldo"+this.getSaldo());
//        System.out.println("Limite"+this.getLimite());
//        return true;    
//    }
//
//  
//    
//}
//
//    private String getLimite() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//  
     
    }

    


            
   
    

    


     
     
     
  
    


    
    

