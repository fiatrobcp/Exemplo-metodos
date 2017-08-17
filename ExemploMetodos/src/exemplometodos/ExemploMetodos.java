/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodos;

import javax.swing.JOptionPane;

/**
 *
 * @author robso
 */
public class ExemploMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        metodoA();
        int resultado = metodoB();
        System.out.println("Saída do método B: " +resultado);
        JOptionPane.showMessageDialog(null, metodoC());
        
       
    }
    
        static void metodoA(){
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite B: "));
            int soma = a + b;
            System.out.println("Saéda do método A: "+soma);
            JOptionPane.showMessageDialog(null,"Saída do método A: "+ soma);
          
      }  
        
        
        static int metodoB(){
           int a = Integer.parseInt(JOptionPane.showInputDialog("Digite A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite B: "));
            int soma = a + b;
            return soma;
        } 
        
        static String metodoC(){
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite B: "));
            int soma = a + b;
            if (soma % 2 == 0){
                return "PAR";
            }else{
              return "IMPAR";  
            }
            
        }
        
        
        
        
}
