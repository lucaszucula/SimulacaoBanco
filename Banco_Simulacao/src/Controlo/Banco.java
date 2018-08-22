
package Controlo;

import Modelo.ContaBancaria;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Banco implements Imprimivel{
    
    
    static ArrayList <ContaBancaria> contas = new ArrayList<>();
    
    
    /**
     * metodo para inserir contas 
     * @return 
     */

    public boolean inserir (ContaBancaria conta ){
        conta.setNumeroDeConta(contas.size());
        if(contas.add(conta))
            JOptionPane.showMessageDialog(null,"conta criada com exito");
        
        return true;
        
    }   
    @Override
    public String mostrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
