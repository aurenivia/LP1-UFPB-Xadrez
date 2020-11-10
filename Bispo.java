/**
 * Classe Cavalo, Define as regras e movimento para essa peca.
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
    public Casa mover(Casa casa, Casa destino, Peca peca) {
        
            //variavel de controle. (Laura)
            Casa novaCasa = casa;
            
            // verifica pelo metodo podeMover(), se o destino esta na posicao permitida para o tipo de peca. (Laura)
            if(this.podeMover(casa, destino)){
                casa.removerPeca();
                destino.colocarPeca(peca); 
                novaCasa = destino;
                
            }
            return novaCasa;
        
    }
    
    
    /**
    * Verifica se o movimento e valido, retorna um boolean. 
    */
    public Boolean podeMover(Casa casa, Casa destino) {
        
        // variaveis para simplificar o codigo (Laura)
        
        int x = destino.x;
        int y = destino.y;        
  
       
            //Verifica se o destino está nas diagonais (Laura)
            for(int i = -4; i <= 4; i++) {                    
                    if( (casa.x + i == x && casa.y + i == y) || (casa.x + i == x && casa.y + (i * -1) == y)){
                        return true;
                    }
                }
            return false;
          
       
    }
}
