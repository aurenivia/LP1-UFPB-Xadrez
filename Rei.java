import javax.swing.JOptionPane;

/**
 * Classe Cavalo, Define as regras e movimento para essa peca.
 *
 * @author (Andre Soares)
 * @version (001 08/11/2020)
 */
public class Rei extends Peca
{
    
    /**
     * Constructor for objects of class Cavalo
     */
    public Rei(Casa casa, int cor)
    {
        //public static final int REI = 4;
        super(casa, 4, cor);
        
    }
    
    /**
     * movimenta  a peca para o local de destino caso esteja correto.
     */
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
    
    
    /**
    * Verifica se o movimento e valido, retorna um boolean. 
    */
    public Boolean podeMover(Casa casa, Casa destino) {
        
        // variaveis para simplificar o codigo (Andre)
        
        int x = destino.x;
        int y = destino.y;
        
           if((x <= casa.x + 1 && x >= casa.x - 1) && (y <= casa.y + 1 && y >= casa.y - 1)){
             
            //Verifica se o destino nao esta no mesmo eixo x e y. (Andre)
            if(casa.x == x || casa.y == y){
                
                //Verifica se o destino nao esta nas diagonais. (Andre)
                for(int i = -2; i <= 2; i++) {                    
                    if( (casa.x + i == x && casa.y + i == y) || (casa.x + i == x && casa.y + (i * -1) == y)){
                        return true;
                    }
                }
                return true;
            }else{
                return true;
            }           
        }else { 
            return false;
        }       
       
    }
}
