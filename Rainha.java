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
    public Casa mover(Casa casa, Casa destino, Peca peca) {
        
            //variavel de controle. (Matheus)
            Casa novaCasa = casa;
            
            // verifica pelo metodo podeMover(), se o destino esta na posicao permitida para o tipo de peca. (Matheus)
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
        
        // variaveis para simplificar o codigo (Matheus)
        
        int x = destino.x;
        int y = destino.y;        
  
       
            //Verifica se o destino está nas diagonais e horizontal e vertical (Matheus)
            //combinação dos movimetos do Bispo e da Torre
            for(int i = -7; i <= 7; i++) {                    
                    if( (casa.x + i == x && casa.y + i == y) || (casa.x + i == x && casa.y + (i * -1) == y) || 
                    (casa.x == x || casa.y == y)){
                        return true;
                    }
                }
            return false;
          
       
    }
}
