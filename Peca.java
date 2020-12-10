
/**
 * Representa uma Pe�a do jogo.
 * Possui uma casa e um tipo associado.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public class Peca {

    public static final int TORRE = 0;
    public static final int CAVALO = 1;
    public static final int BISPO = 2;
    public static final int RAINHA = 3;
    public static final int REI = 4;
    public static final int PEAO = 5;
    
    //com as cores diferentes ha 12 tipos de pecas, somando o tipo de peca a cor chegamos aos 12 tipos. (Andre)
    
    public static final int PRETO = 6;
    public static final int BRANCO = 0;
    

    protected Casa casa;
    protected int tipo;   
    protected int cor;         
    
    public Peca(Casa casa, int tipo, int cor) {
        
        this.casa = casa;
        this.tipo = tipo;
        this.cor = cor;
                    
        casa.colocarPeca(this);
    }
    
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public Boolean mover(Casa destino, Tabuleiro tabuleiro) {
        
        //Default
        
        Casa novaCasa;
        
        novaCasa = this.casa;
        this.casa.removerPeca();
        destino.colocarPeca(this);
        this.casa = destino;
             
        if(this.casa != novaCasa) {
            this.casa = novaCasa;
            return true;
        }
        
        return false;
                
    }
    
    /**
     * Verifica se a casa de destino não contém uma peça de sua cor.
     * 
     */
    public Boolean verificaDestino(Peca origem, Casa destino ) {

        Peca destinoPeca = destino.getPeca();
        int corOrigem = origem.getCor();

        if(destinoPeca instanceof Peca){
            int corDestino = destinoPeca.getCor();
            if(corOrigem != corDestino){
                return true;
            }
            return false;
        }
         return true;
    }
    
    /**
     * Valor    Tipo
     *   0      Torre
     *   1      Cavalo
     *   2      Bispo
     *   3      Rainha
     *   4      Rei
     *   5      Peao  
     *
     * @return o tipo da peca.
     */
    public int getTipo() {
        return tipo;
    }    
    
    
    /**
     * Valor    Cor
     *   6      Preto
     *   0      Branco
          
     * @return o tipo da peca.
     */
    public int getCor() {
        return cor;
    }

    
}
