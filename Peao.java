
/**
 * Escreva a descrição da classe Peao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Peao extends Peca
{
    
    /**
     * Construtor para objetos da classe Peao
     */
    public Peao(Casa casa, int cor)
    {
        //public static final int PEAO = 5;
        super(casa, 5, cor);
    }

    public Boolean mover(Casa destino, Tabuleiro tabuleiro) {
        
        if(this.verificaDestino(this, destino)) {
            
            if(this.podeMover(this.casa, destino)){
                
                this.casa.removerPeca();
                destino.colocarPeca(this);
                this.casa = destino;
                
                return true;
                
            }
            return false;
        }
        
        return false;
                
    }
    
    public Boolean podeMover(Casa casa, Casa destino) {
        
        // variaveis para simplificar o codigo (Andre)
        
        int x = destino.x;
        int y = destino.y;
        
        //Verifica se o destino esta no mesmo eixo x e y. (Andre)
           
           if(this.cor == 0){
               if(casa.x == x && (casa.y == y - 1 || casa.y == 1 && y == 3) && (destino.getPeca() == null)) {
                   return true;                   
               }
               else if((casa.x == x + 1 || casa.x == x - 1) && (casa.y == y - 1) && (destino.getPeca() != null)){
                   return true;
               }
               else {
                   return false;
               }     
           }
           if(this.cor == 6){
               if(casa.x == x && (casa.y == y + 1 || casa.y == 6 && y == 4) && (destino.getPeca() == null)){
                   return true;                   
               }
               else if((casa.x == x + 1 || casa.x == x - 1) && (casa.y == y + 1) && (destino.getPeca() != null)){
                   return true;
               }
               else {
                   return false;
               }
           }           
           return false;
    } 
    
}
