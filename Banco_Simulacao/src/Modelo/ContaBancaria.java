
package Modelo;

/**
 *
 * @author Lucas
 * Classe generica que simula as carecrtisticas principais de um banco
 */
public abstract class ContaBancaria {
    
    /**
     * atributos referiodos
     */
    private String nome =" llucas";
    private int numeroDeConta =123;
    private Double saldo =0.9 ;
    private String historico ="sempe com taco";
//construro vazio que permite inicializar as variaveis
    
    public ContaBancaria() {
    }

    
    /**
     * 
     * @param nome
     * @param numeroDeConta
     * @param saldo
     * @param historico 
     */
    
    
    public ContaBancaria(String nome, int numeroDeConta, Double saldo, String historico) {
        this.nome = nome;
        this.numeroDeConta = numeroDeConta;
        this.saldo = saldo;
        this.historico = historico;
    }
/**
 * os guetters e setters nos permitem aceder os atrubutos noutra classse
 * @return 
 */
    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(int numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    /**
     * metodos que permite depositar ou levantar o dinheiro na nossa conta
     * @param valor 
     */
    public abstract void  sacar( Double valor);
    
    
    public abstract void  depositar( Double valor);
   
    public static  void transferir ( double valor,ContaBancaria conta1,ContaBancaria conta2){
       conta1.depositar(valor);
       conta2.sacar(valor);
        
    }
}
