
package conversão;


import java.util.Scanner;


public class Conversão {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
       double dolar, real, conve;
       
        System.out.println("Quantos reais vai converter?");
        real = entrada.nextDouble();
        
        System.out.println("Qual o valor do dolar?");
        dolar = entrada.nextDouble();
        
        conve = real / dolar ;
        
        System.out.println("Você tem: "+conve+" dolares convertidos.");
                
                
        
      
    }
    
}
