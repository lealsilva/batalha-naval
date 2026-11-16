
package batalhanaval.model;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.iniciarTabuleiro();
        Navio navio = new Navio(3, "submarino");
        tabuleiro.posicionarNavio(navio);
        
        System.out.println("Digite a linha que deseja realiza o tiro: ");
        int linha = leia.nextInt();
        System.out.println("Digite a coluna que deseja realizar o tiro");
        int coluna = leia.nextInt();
        
        tabuleiro.realizarTiro(linha, coluna);
        
        
        

        
        tabuleiro.mostrarTabuleiro();
    }
}
