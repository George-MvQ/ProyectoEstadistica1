
package Proyecto;

import javax.swing.JOptionPane;



/**
 *
 * @author George Vasquez
 */
public class Funcion {
    
    double factorial(int n){
   
        
        if(n<0){
            JOptionPane.showMessageDialog(null,"Error Numero negativo\nrevise sus datos ");
            return 0;
        }
        else if (n==1||n==0){
        return 1;
        }
        else{
          return n*factorial(n-1); 
        } 
    
    }
    
  
    
    
     double teoremaDos (int n, int r){
        return factorial(n)/factorial(n-r);

    }
     
    
     double teoremaTres(int n){
         return factorial(n-1) ;
    }
    
    
     double teoremaSeis(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
     }
     
    
     
     
     
     float teoremaSiete(float PA,float PB,float PAnB){
         return PA+PB-PAnB;
     }
     
    
   public static double teoremaOcho(float PA,float PB,float PC,float PAnB,float PAnC,float PBnC,float PAnBnC ){
         return PA+PB+PC-PAnB-PAnC-PBnC+PAnBnC; 
     }
     
     
   public static double TeoremaNueve(float numero){
          return 1-numero;
   }  
   
     
}//fin clase
    





