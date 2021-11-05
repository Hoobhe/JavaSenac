
package prestacoesloja;

import java.util.Scanner;


public class PrestacoesLoja {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
     double valor, prest;
     
        System.out.println("Qual o valor do produto?");
        valor = entrada.nextDouble();
        prest = valor / 5;
        
        System.out.println("O valor da prestação é de: "+prest);
        
    }
    
}
