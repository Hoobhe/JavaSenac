
package mediaaluno1;

import java.util.Scanner;

public class MediaAluno1 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        String aluno;
        double nota1, nota2, nota3, media;
        
        System.out.println("Informe seu nome: ");
        aluno = entrada.nextLine();
        
        System.out.println("Informe sua primeira nota: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Informe sua segunda nota: ");
        nota2 = entrada.nextDouble();
        
        System.out.println("Informe sua terceira nota: ");
        nota3 = entrada.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média do aluno(a) " +aluno + " nas avaliações é de: <"+media+">");
        
    }
    
}
