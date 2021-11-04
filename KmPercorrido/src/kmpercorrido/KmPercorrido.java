package kmpercorrido;

import java.util.Scanner;

public class KmPercorrido {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double kmInicial, kmFinal, kmTotal;
        double litros, consumo;

        System.out.println("Digite a quilometragem inicial: ");
        kmInicial = entrada.nextDouble();
        
        System.out.println("Digite a quilometragem final: ");
        kmFinal = entrada.nextDouble();
        
        kmTotal = kmFinal - kmInicial;
        
        System.out.println("Você percorreu um total de <" + kmTotal + "> KM");
        
        System.out.println("Quantos litros de gasolina foram abastecidos?");
        litros = entrada.nextDouble();
        
        consumo = kmTotal / litros;
        System.out.println("Sua média de consumo foi de: <"+consumo +"> KM/L");
        
         
    }

}
