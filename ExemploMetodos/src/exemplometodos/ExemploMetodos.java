/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodos;

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
        System.out.println("Saída do método B:" +resultado);
        
       
    }
    
        static void metodoA(){
            int a = 15;
            int b = 10;
            int soma = a + b;
            System.out.println("Saéda do método A: "+soma);
          
      }  
        
        
        static int metodoB(){
            int a = 10;
            int b = 15;
            return a + b;
        }
    
}
