/**
 * Classe Rainha, Define as regras e movimento para essa peca.
 *
 * @author (Matheus Franccine)
 * @version (001 10/11/2020)
 */
public class Rainha
{
    // instance variables - replace the example below with your ow
    
    private int cor;

    /**
     * Constructor for objects of class Rainha
     */
    public Rainha(int cor)
    {
        // deixei essa variavel para implementar o metodo mover depois, mas talvez nao seja necessaria. (Andre)
        
        this.cor = cor;
        
    }
    
    /**
     * movimenta  a peca para o local de destino caso esteja correto.
     */
    public Casa mover(Casa casa, Casa destino, Peca peca, Tabuleiro tabuleiro) {
        
            //variavel de controle. (Matheus)
            Casa novaCasa = casa;
            
            // verifica pelo metodo podeMover(), se o destino esta na posicao permitida para o tipo de peca. (Matheus)
            if(this.podeMover(casa, destino, tabuleiro)){
                casa.removerPeca();
                destino.colocarPeca(peca); 
                novaCasa = destino;
            }
            return novaCasa;
        
    }
    
    
    /**
    * Verifica se o movimento e valido, retorna um boolean. 
    */
    public Boolean podeMover(Casa casa, Casa destino, Tabuleiro tabuleiro) {
        
            // variaveis para simplificar o codigo (Matheus)
            
            int x = destino.x;
            int y = destino.y;        
  
       
            //Verifica se o destino está nas diagonais e horizontal e vertical (Matheus)
            //combinação dos movimetos do Bispo e da Torre
            
            if(casa.x == x && !this.pulouPeca("reta",1, casa, destino, tabuleiro) ) {
                return true;
            }
            if(casa.y == y && !this.pulouPeca("reta",2, casa, destino, tabuleiro)) {
                return true;
            }
            
            for(int i = -7; i <= 7; i++) {                    
                if( (casa.x + i == x && casa.y + i == y) && !this.pulouPeca("diagonal",1, casa, destino, tabuleiro)){
                    return true;
                }
                if( (casa.x + i == x && casa.y + (i * -1) == y) && !this.pulouPeca("diagonal",2, casa, destino, tabuleiro)){
                    return true;
                }
            }
            return false;
          
       
    }
    
    /**
     * Verifica se a rainha pulou outra peca e retorna o true caso seja verdadeiro (andre)
     */
    public Boolean pulouPeca(String posicao, int eixo, Casa casa, Casa destino, Tabuleiro tabuleiro) {
         
            int x = destino.x;
            int y = destino.y;
            
            if(posicao == "reta") {
                switch(eixo) {
                    case 1:
                       if(y > casa.y){               
                           for(int i = casa.y + 1; i < y; i++){                       
                               if (tabuleiro.getCasa(casa.x, i).getPeca() instanceof Peca ) {                           
                                   return true; }
                           }                           
                       }               
                       if(y < casa.y){                   
                           for(int i = casa.y - 1; i > y; i--){                               
                               if (tabuleiro.getCasa(casa.x, i).getPeca() instanceof Peca ) {
                                   return true; }
                           }
                       }
                       return false;
                    case 2:
                        if(x > casa.x){
                           for(int i = casa.x + 1; i < x; i++){
                               if (tabuleiro.getCasa(i, casa.y).getPeca() instanceof Peca ) {
                                   return true; }
                           }                           
                       }
                       if(x < casa.x){
                           for(int i = casa.x - 1; i > x; i--){
                               
                               if (tabuleiro.getCasa(i, casa.y).getPeca() instanceof Peca ) {
                                   return true; }
                           }                          
                       }
                       return false;
                }               
                
            }
            
            if(posicao == "diagonal") {
                
                switch(eixo) {
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
            }
            
            return false;
    }
}
