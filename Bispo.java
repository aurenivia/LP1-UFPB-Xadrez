/**
 * Classe Bispo, Define as regras e movimento para essa peca.
 *
 * @author (Laura Franccine)
 * @version (001 10/11/2020)
 */
public class Bispo
{
    // instance variables - replace the example below with your ow
    
    private int cor;

    /**
     * Constructor for objects of class Cavalo
     */
    public Bispo(int cor)
    {
        // deixei essa variavel para implementar o metodo mover depois, mas talvez nao seja necessaria. (Andre)
        
        this.cor = cor;
        
    }
    
    /**
     * movimenta  a peca para o local de destino caso esteja correto.
     */
    public Casa mover(Casa casa, Casa destino, Peca peca, Tabuleiro tabuleiro) {
        
            //variavel de controle. (Laura)
            Casa novaCasa = casa;
            
            // verifica pelo metodo podeMover(), se o destino esta na posicao permitida para o tipo de peca. (Laura)
            if(this.podeMover(casa, destino, tabuleiro)){
                casa.removerPeca();
                destino.colocarPeca(peca); 
                novaCasa = destino;
                JanelaPrincipal.retornaJogo().controle.jogada();
            }
            return novaCasa;
        
    }
    
    
    /**
    * Verifica se o movimento e valido, retorna um boolean. 
    */
    public Boolean podeMover(Casa casa, Casa destino, Tabuleiro tabuleiro) {
        
            // variaveis para simplificar o codigo (Laura)
            // tabuleiro.getCasa(casa.x + i, casa.y + i).getPeca() instanceof Peca
            int x = destino.x;
            int y = destino.y; 
             
       
            //Verifica se o destino está nas diagonais (Laura)
            for(int i = -7; i <= 7; i++) {
                if(casa.x + i == x && casa.y + i == y){
                   if(!this.pulouPeca(1, casa, destino, tabuleiro)) { 
                       return true;
                   }
                   return false;
                   
                }
                if(casa.x + i == x && casa.y + (i * -1) == y){
                    if(!this.pulouPeca(2, casa, destino, tabuleiro)) { 
                       return true;
                   }
                   return false;
                    
                }
            }
            
            return false;
          
       
    }
    
    /**
     * Verifica se ha uma outra peca na tragetoria de movimentacao da peca
     */
    public Boolean pulouPeca(int diagonal, Casa casa, Casa destino, Tabuleiro tabuleiro ){
        
        int x = destino.x;
        int y = destino.y;
        
        switch(diagonal){
            case 1:
                if(x > casa.x){
                   //verifica se pulou peca
                   for(int j = 1; j < x - casa.x; j++){
                       if(tabuleiro.getCasa(casa.x + j, casa.y + j).getPeca() instanceof Peca){
                           return true;
                        }
                   }
                }
               if(casa.x > x){
                   //verifica se pulou peca
                  for(int j = 1; j < casa.x - x; j++){
                       if(tabuleiro.getCasa(x + j, y + j).getPeca() instanceof Peca){
                           return true;
                        }
                   } 
               }
               return false; 
            case 2:
                if(y > casa.y){
                   //verifica se pulou peca
                   for(int j = 1; j < y - casa.y; j++){
                       if(tabuleiro.getCasa(casa.x - j, casa.y + j).getPeca() instanceof Peca){
                           return true;
                        }
                   }
               }
               if(casa.y > y){
                   //verifica se pulou peca
                  for(int j = 1; j < casa.y - y; j++){
                       if(tabuleiro.getCasa(casa.x + j, casa.y - j).getPeca() instanceof Peca){
                           return true;
                        }
                   } 
               }
               return false;
        }
        
        return true;
    }
}
