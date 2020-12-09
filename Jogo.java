 
/**
 * Armazena o tabuleiro e responsavel por posicionar as pecas.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public class Jogo {

    private Tabuleiro tabuleiro;
    public Controle controle;
    
    public Jogo() {
        controle = new Controle();
        tabuleiro = new Tabuleiro();
        criarPecas();
    }
    
    /**
     * Posiciona pe�as no tabuleiro.
     * Utilizado na inicializa�ao do jogo.
     */
    private void criarPecas() {
        
        // Pecas Brancas 
            
        Torre peca1  =   new Torre(tabuleiro.getCasa(0, 0), Peca.BRANCO);
        Cavalo peca2  =  new Cavalo(tabuleiro.getCasa(1, 0), Peca.BRANCO);
        Bispo peca3  =   new Bispo(tabuleiro.getCasa(2, 0), Peca.BRANCO);
        Rainha peca4  =  new Rainha(tabuleiro.getCasa(3, 0), Peca.BRANCO);
        Rei peca5  =     new Rei(tabuleiro.getCasa(4, 0), Peca.BRANCO);
        Bispo peca6  =   new Bispo(tabuleiro.getCasa(5, 0), Peca.BRANCO);
        Cavalo peca7  =  new Cavalo(tabuleiro.getCasa(6, 0), Peca.BRANCO);
        Torre peca8  =   new Torre(tabuleiro.getCasa(7, 0), Peca.BRANCO);
        Peao peca9  =    new Peao(tabuleiro.getCasa(0, 1), Peca.BRANCO);
        Peao peca10 =    new Peao(tabuleiro.getCasa(1, 1), Peca.BRANCO);
        Peao peca11 =    new Peao(tabuleiro.getCasa(2, 1), Peca.BRANCO);
        Peao peca12 =    new Peao(tabuleiro.getCasa(3, 1), Peca.BRANCO);
        Peao peca13 =    new Peao(tabuleiro.getCasa(4, 1), Peca.BRANCO);
        Peao peca14 =    new Peao(tabuleiro.getCasa(5, 1), Peca.BRANCO);
        Peao peca15 =    new Peao(tabuleiro.getCasa(6, 1), Peca.BRANCO);
        Peao peca16 =    new Peao(tabuleiro.getCasa(7, 1), Peca.BRANCO);
        
        // Pecas Pretas
        
        Torre peca17 =   new Torre(tabuleiro.getCasa(0, 7), Peca.PRETO);
        Cavalo peca18 =  new Cavalo(tabuleiro.getCasa(1, 7), Peca.PRETO);
        Bispo peca19 =   new Bispo(tabuleiro.getCasa(2, 7), Peca.PRETO);
        Rainha peca20 =  new Rainha(tabuleiro.getCasa(3, 7), Peca.PRETO);
        Rei peca21 =     new Rei(tabuleiro.getCasa(4, 7), Peca.PRETO);
        Bispo peca22 =   new Bispo(tabuleiro.getCasa(5, 7), Peca.PRETO);
        Cavalo peca23 =  new Cavalo(tabuleiro.getCasa(6, 7), Peca.PRETO);
        Torre peca24 =   new Torre(tabuleiro.getCasa(7, 7), Peca.PRETO);
        Peao peca25 =    new Peao(tabuleiro.getCasa(0, 6), Peca.PRETO);
        Peao peca26 =    new Peao(tabuleiro.getCasa(1, 6), Peca.PRETO);
        Peao peca27 =    new Peao(tabuleiro.getCasa(2, 6), Peca.PRETO);
        Peao peca28 =    new Peao(tabuleiro.getCasa(3, 6), Peca.PRETO);
        Peao peca29 =    new Peao(tabuleiro.getCasa(4, 6), Peca.PRETO);
        Peao peca30 =    new Peao(tabuleiro.getCasa(5, 6), Peca.PRETO);
        Peao peca31 =    new Peao(tabuleiro.getCasa(6, 6), Peca.PRETO);
        Peao peca32 =    new Peao(tabuleiro.getCasa(7, 6), Peca.PRETO);

        
    }
    
    /**
     * Comanda uma Pe�a na posicao (origemX, origemY) fazer um movimento 
     * para (destinoX, destinoY).
     * 
     * @param origemX linha da Casa de origem.
     * @param origemY coluna da Casa de origem.
     * @param destinoX linha da Casa de destino.
     * @param destinoY coluna da Casa de destino.
     */
    public Boolean moverPeca(int origemX, int origemY, int destinoX, int destinoY) {
        Casa origem = tabuleiro.getCasa(origemX, origemY);
        Casa destino = tabuleiro.getCasa(destinoX, destinoY);
        Peca peca = origem.getPeca(); 
                                
        return peca.mover(destino, tabuleiro);    
               
        
    }
    
    /**
     * @return o Tabuleiro em jogo.
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    
}
