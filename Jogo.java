 
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
            
        Peca peca1  = new Peca(tabuleiro.getCasa(0, 0), Peca.TORRE, Peca.BRANCO);
        Peca peca2  = new Peca(tabuleiro.getCasa(1, 0), Peca.CAVALO, Peca.BRANCO);
        Peca peca3  = new Peca(tabuleiro.getCasa(2, 0), Peca.BISPO, Peca.BRANCO);
        Peca peca4  = new Peca(tabuleiro.getCasa(3, 0), Peca.RAINHA, Peca.BRANCO);
        Peca peca5  = new Peca(tabuleiro.getCasa(4, 0), Peca.REI, Peca.BRANCO);
        Peca peca6  = new Peca(tabuleiro.getCasa(5, 0), Peca.BISPO, Peca.BRANCO);
        Peca peca7  = new Peca(tabuleiro.getCasa(6, 0), Peca.CAVALO, Peca.BRANCO);
        Peca peca8  = new Peca(tabuleiro.getCasa(7, 0), Peca.TORRE, Peca.BRANCO);
        Peca peca9  = new Peca(tabuleiro.getCasa(0, 1), Peca.PEAO, Peca.BRANCO);
        Peca peca10 = new Peca(tabuleiro.getCasa(1, 1), Peca.PEAO, Peca.BRANCO);
        Peca peca11 = new Peca(tabuleiro.getCasa(2, 1), Peca.PEAO, Peca.BRANCO);
        Peca peca12 = new Peca(tabuleiro.getCasa(3, 1), Peca.PEAO, Peca.BRANCO);
        Peca peca13 = new Peca(tabuleiro.getCasa(4, 1), Peca.PEAO, Peca.BRANCO);
        Peca peca14 = new Peca(tabuleiro.getCasa(5, 1), Peca.PEAO, Peca.BRANCO);
        Peca peca15 = new Peca(tabuleiro.getCasa(6, 1), Peca.PEAO, Peca.BRANCO);
        Peca peca16 = new Peca(tabuleiro.getCasa(7, 1), Peca.PEAO, Peca.BRANCO);
        
        // Pecas Pretas
        
        Peca peca17 = new Peca(tabuleiro.getCasa(0, 7), Peca.TORRE, Peca.PRETO);
        Peca peca18 = new Peca(tabuleiro.getCasa(1, 7), Peca.CAVALO, Peca.PRETO);
        Peca peca19 = new Peca(tabuleiro.getCasa(2, 7), Peca.BISPO, Peca.PRETO);
        Peca peca20 = new Peca(tabuleiro.getCasa(3, 7), Peca.RAINHA, Peca.PRETO);
        Peca peca21 = new Peca(tabuleiro.getCasa(4, 7), Peca.REI, Peca.PRETO);
        Peca peca22 = new Peca(tabuleiro.getCasa(5, 7), Peca.BISPO, Peca.PRETO);
        Peca peca23 = new Peca(tabuleiro.getCasa(6, 7), Peca.CAVALO, Peca.PRETO);
        Peca peca24 = new Peca(tabuleiro.getCasa(7, 7), Peca.TORRE, Peca.PRETO);
        Peca peca25 = new Peca(tabuleiro.getCasa(0, 6), Peca.PEAO, Peca.PRETO);
        Peca peca26 = new Peca(tabuleiro.getCasa(1, 6), Peca.PEAO, Peca.PRETO);
        Peca peca27 = new Peca(tabuleiro.getCasa(2, 6), Peca.PEAO, Peca.PRETO);
        Peca peca28 = new Peca(tabuleiro.getCasa(3, 6), Peca.PEAO, Peca.PRETO);
        Peca peca29 = new Peca(tabuleiro.getCasa(4, 6), Peca.PEAO, Peca.PRETO);
        Peca peca30 = new Peca(tabuleiro.getCasa(5, 6), Peca.PEAO, Peca.PRETO);
        Peca peca31 = new Peca(tabuleiro.getCasa(6, 6), Peca.PEAO, Peca.PRETO);
        Peca peca32 = new Peca(tabuleiro.getCasa(7, 6), Peca.PEAO, Peca.PRETO);

        
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
