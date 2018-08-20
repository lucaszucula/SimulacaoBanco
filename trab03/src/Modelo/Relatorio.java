/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lucas
 */
public class Relatorio {
        public void gerarRelatorio(Imprimivel imprimivel){
            if (Imprimivel instanceof ContaCorrente){
            imprimivel.mostrarDados();  
         }
       
        
    }
//    public void gerarRelatÃ³rio(ContaBancaria conta){
//        ContaCorente corente;
//        ContaPoupanca poupanca;
//        
//         if (conta instanceof ContaCorente){
//          corente = (ContaCorente) conta;
//          corente.mostrarDados();
//        
//    }else {
//          poupanca = (ContaPoupanca) conta;
//          poupanca.mostrarDados();   
//         }  
//    }
    
}

    

