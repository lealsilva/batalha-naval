
package batalhanaval.model;

import java.util.Random;

public class Tabuleiro {
    
    
    private char [][] tabuleiro;
   
    public Tabuleiro(){
        tabuleiro = new char[10][10];
    }
    
    public void iniciarTabuleiro(){
        for (int linha = 0; linha < 10; linha ++){
            
            for(int coluna = 0; coluna < 10; coluna ++){
                
                tabuleiro[linha][coluna] = '~';
            }
        }
    }
    
    public void posicionarNavio(Navio navio){
        Random posicao = new Random();
        int tamanhoNavio = navio.getTamanhoNavio();
        boolean posicaoValida = false;
        
        
        while(!posicaoValida){
            boolean espacoLivre = true;
            int linhaInicial = posicao.nextInt(tabuleiro.length);
            int colunaInicial = posicao.nextInt(tabuleiro[0].length);
            int orientacaoNavio = posicao.nextInt(2);
            
            if(orientacaoNavio == 0){
                if((tamanhoNavio + colunaInicial) - 1 < tabuleiro[0].length){
                    for(int contador = 0; contador < tamanhoNavio; contador ++){
                        if(tabuleiro[linhaInicial][colunaInicial + contador] == 'n'){
                            espacoLivre = false;
                            break;
                        }     
                    }
                    if(espacoLivre){
                        for(int contador = 0; contador < tamanhoNavio; contador ++){
                            tabuleiro[linhaInicial][colunaInicial + contador] = 'n';
                        }
                        posicaoValida = true;
                    }
                }
            }else{
                if((tamanhoNavio + linhaInicial) -1 < tabuleiro.length){
                    for(int contador = 0; contador < tamanhoNavio; contador ++){
                        if(tabuleiro[linhaInicial + contador][colunaInicial] == 'n'){
                            espacoLivre = false;
                            break;
                        }
                    }
                    if(espacoLivre){
                        for(int contador = 0; contador < tamanhoNavio; contador ++){
                            tabuleiro[linhaInicial + contador][colunaInicial] = 'n';
                        }
                        posicaoValida = true;
                    }
                } 
            }
        }  
    } 
    
    public boolean realizarTiro(int linha, int coluna){
        
        if(tabuleiro[linha][coluna] == 'n'){
            tabuleiro[linha][coluna] = 'x';
            return true;
            
        }else if(tabuleiro[linha][coluna] == 'x' || tabuleiro[linha][coluna] == '0'){ // ja atirou nesse local
            return false;
            
        }else{
            tabuleiro [linha][coluna] = '0'; // acertou a agua
            return false;
        }
        
        
    }
    
    public void mostrarTabuleiro(){

        for(int linha = 0; linha < tabuleiro.length; linha++){
        
            for(int coluna = 0; coluna < tabuleiro[0].length; coluna++){

                System.out.print(tabuleiro[linha][coluna] + " ");
            }
        
            System.out.println();
        }
    }
}

