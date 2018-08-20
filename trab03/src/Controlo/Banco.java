/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlo;
import Modelo.ContaBancaria;
import Modelo.ContaCorrente;
import Modelo.Tabela;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucas
 */
public class Banco extends AbstractTableModel {
   public static List<ContaBancaria> contaBancarias = new ArrayList();
    private boolean controlar =false;
   public static int sentinela=0 ;
    public void Inserir(ContaBancaria bancaria){
        this.contaBancarias.add(bancaria);
        JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso!!!");
        sentinela++;
        fireTableRowsInserted(contaBancarias.size() - 1, contaBancarias.size() - 1);
    }
    
    
    public void Remover(ContaBancaria bancaria){
       this.contaBancarias.remove(bancaria);
       JOptionPane.showMessageDialog(null, "Removido Com Sucesso!!!");
    fireTableRowsInserted(contaBancarias.size()-1, contaBancarias.size()-1);
    sentinela--;
    }
    
    public Void Actuaalizar(){
            fireTableRowsInserted(contaBancarias.size()-1, contaBancarias.size()-1);
       return null;

    }
    public ContaBancaria Pesquisa(int numeroDaConta){
       for(ContaBancaria bancaria: contaBancarias){
           if(bancaria.getNumeroDaConta()== numeroDaConta){
              controlar = true; 
               sentinela= contaBancarias.indexOf(bancaria);
              return bancaria;
             
           }
       }
            JOptionPane.showMessageDialog(null, "Ouve um erro, Numero da conta inexistente !!!", "ATENÃ‡ÃƒO OUVE UM ERRO", JOptionPane.ERROR_MESSAGE);    

              return null; 
    }
   public void verificar(){
       System.out.println(this.contaBancarias.isEmpty());
    }

    public boolean Deposito(ContaBancaria bancaria,double v){
         bancaria = this.contaBancarias.get(this.sentinela);
        bancaria.Depositar(v);
        this.contaBancarias.set(sentinela, bancaria);
        System.out.println(this.contaBancarias.isEmpty());
                fireTableRowsInserted(contaBancarias.size() - 1, contaBancarias.size() - 1);

        return true;
        
    }

    @Override
    public int getRowCount() {
       return this.contaBancarias.size();
    }

    @Override
    public int getColumnCount() {
       return  3;
    }
    @Override
    public String getColumnName(int coluna){
      switch(coluna){
          case 0:
              return "Numero Da Conta";
          case 1:
              return "Saldo";
          case 2:
              return "Tipo de Conta";
          default:
              return "";      
      }  
    }
  public ContaBancaria getValet(int linha){
      return contaBancarias.get(linha);
  }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ContaBancaria contaBancaria = contaBancarias.get(rowIndex);
        switch(columnIndex){
            case 0:
                return contaBancaria.getNumeroDaConta();
            case 1:
                return contaBancaria.getSaldo();
            case 2:
                return contaBancaria.getTipoDeConta();

            default:
                return "";
            
        }
        
    }
}

