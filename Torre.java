import javax.swing.JOptionPane;

/**
 * Classe Torre, Define as regras e movimento para essa peca.
 *
 * @author (Andre Soares)
 * @author (Laura Franccine)
 * @version (001 08/11/2020)
 */
public class Torre
{
    // instance variables - replace the example below with your ow
    
    private int cor;

    /**
     * Constructor for objects of class Cavalo
     */
    public Torre(int cor)
    {
        // deixei essa variavel para implementar o metodo mover depois, mas talvez nao seja necessaria. (Andre)
        
        this.cor = cor;
        
    }
    
    /**
     * movimenta  a peca para o local de destino caso esteja correto.
     */
    public Casa mover(Casa casa, Casa destino, Peca peca, Tabuleiro tabuleiro) {
        
        //variavel de controle. (Andre)
        Casa novaCasa = casa;
        
        // verifica pelo metodo podeMover(), se o destino esta na posicao permitida para o tipo de peca. (Andre)
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
        
            // variaveis para simplificar o codigo (Andre)
            
            int x = destino.x;
            int y = destino.y;
            
            //Verifica se o destino esta no mesmo eixo x e y. (Andre)
            
           if(casa.x == x){
               if(y > casa.y){
                   for(int i = casa.y + 1; i < y; i++){
                       if (tabuleiro.getCasa(casa.x, i).getPeca() instanceof Peca ) {
                           return false; }
                   }
                   return true;
               }
               if(y < casa.y){
                   for(int i = casa.y - 1; i > y; i--){
                       
                       if (tabuleiro.getCasa(casa.x, i).getPeca() instanceof Peca ) {
                           return false; }
                   }
                   return true;
               }
            }
                                
           if(casa.y == y){
                if(x > casa.x){
                   for(int i = casa.x + 1; i < x; i++){
                       if (tabuleiro.getCasa(i, casa.y).getPeca() instanceof Peca ) {
                           return false; }
                   }
                   return true;
               }
               if(x < casa.x){
                   for(int i = casa.x - 1; i > x; i--){
                       
                       if (tabuleiro.getCasa(i, casa.y).getPeca() instanceof Peca ) {
                           return false; }
                   }
                   return true;
               }
           }       
           
           return false;
    } 
        
}
