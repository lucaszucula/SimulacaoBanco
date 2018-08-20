
package Modelo;

/**
 *
 * @author Lucas
 */
public abstract class ContaBancaria {
    /**
     * ATRIBUTOS DA CLASSE PRINCIPAL QUE IRAO SER HERDADOS POR TODAS AS CLASSES
     */
    private int NumeroDeConta;
    private double saldo;
   private String Historico;
   private String tipoDeConta;
//Construtor vazio que permite a inicilazacao dos objectos na classe teste
   
    public ContaBancaria() {
    }
// construtor com parametros que permite retorna or nao as varis solicitadas
    public ContaBancaria(int NumeroDeConta, double saldo, String Historico,String tipoDeConta ) {
        this.tipoDeConta=tipoDeConta;
        this.NumeroDeConta = NumeroDeConta;
        
        this.saldo = saldo;
        this.Historico = Historico;
    }
/**
 * 
 * @return 
 */
    public String getHistorico() {
        return Historico;
    }
/**
 * 
 * @param Historico 
 */
    public void setHistorico(String Historico) {
        this.Historico = Historico;
    }
/**
 * 
 * @return 
 */
    public int getNumeroDeConta() {
        return NumeroDeConta;
    }
/**
 * 
 * @param NumeroDeConta 
 */
    public void setNumeroDeConta(int NumeroDeConta) {
        this.NumeroDeConta = NumeroDeConta;
    }
/**
 * vai exibir o saldo actual
 * @return 
 */
    public double getSaldo() {
        return saldo;
    }
    

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    

/**
 * permite alterar o saldo no deposito ou levantamento
 * @param saldo 
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * permitem fazer o levantamento
     * @param valor
     * @return 
     */
    public abstract double sacar(double valor);
    
    /**
     * meteo para o deposito
     * @param valor
     * @return 
     */
    
     public abstract double depositar(double valor);

    public int getNumeroDaConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Depositar(double v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
