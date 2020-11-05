
/**
 * Armazena o tabuleiro e responsavel por posicionar as pecas.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public class Jogo {

    private Tabuleiro tabuleiro;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        criarPecas();
    }
    
    /**
     * Posiciona pe�as no tabuleiro.
     * Utilizado na inicializa�ao do jogo.
     */
    private void criarPecas() {
        
        // Pecas Brancas
            
        Peca peca1  = new Peca(tabuleiro.getCasa(0, 0), Peca.TORRE_BRANCA);
        Peca peca2  = new Peca(tabuleiro.getCasa(1, 0), Peca.CAVALO_BRANCO);
        Peca peca3  = new Peca(tabuleiro.getCasa(2, 0), Peca.BISPO_BRANCO);
        Peca peca4  = new Peca(tabuleiro.getCasa(3, 0), Peca.RAINHA_BRANCA);
        Peca peca5  = new Peca(tabuleiro.getCasa(4, 0), Peca.REI_BRANCO);
        Peca peca6  = new Peca(tabuleiro.getCasa(5, 0), Peca.BISPO_BRANCO);
        Peca peca7  = new Peca(tabuleiro.getCasa(6, 0), Peca.CAVALO_BRANCO);
        Peca peca8  = new Peca(tabuleiro.getCasa(7, 0), Peca.TORRE_BRANCA);
        Peca peca9  = new Peca(tabuleiro.getCasa(0, 1), Peca.PEAO_BRANCO);
        Peca peca10 = new Peca(tabuleiro.getCasa(1, 1), Peca.PEAO_BRANCO);
        Peca peca11 = new Peca(tabuleiro.getCasa(2, 1), Peca.PEAO_BRANCO);
        Peca peca12 = new Peca(tabuleiro.getCasa(3, 1), Peca.PEAO_BRANCO);
        Peca peca13 = new Peca(tabuleiro.getCasa(4, 1), Peca.PEAO_BRANCO);
        Peca peca14 = new Peca(tabuleiro.getCasa(5, 1), Peca.PEAO_BRANCO);
        Peca peca15 = new Peca(tabuleiro.getCasa(6, 1), Peca.PEAO_BRANCO);
        Peca peca16 = new Peca(tabuleiro.getCasa(7, 1), Peca.PEAO_BRANCO);
        
        // Pecas Pretas
        
        Peca peca17 = new Peca(tabuleiro.getCasa(0, 7), Peca.TORRE_PRETA);
        Peca peca18 = new Peca(tabuleiro.getCasa(1, 7), Peca.CAVALO_PRETO);
        Peca peca19 = new Peca(tabuleiro.getCasa(2, 7), Peca.BISPO_PRETO);
        Peca peca20 = new Peca(tabuleiro.getCasa(3, 7), Peca.RAINHA_PRETA);
        Peca peca21 = new Peca(tabuleiro.getCasa(4, 7), Peca.REI_PRETO);
        Peca peca22 = new Peca(tabuleiro.getCasa(5, 7), Peca.BISPO_PRETO);
        Peca peca23 = new Peca(tabuleiro.getCasa(6, 7), Peca.CAVALO_PRETO);
        Peca peca24 = new Peca(tabuleiro.getCasa(7, 7), Peca.TORRE_PRETA);
        Peca peca25 = new Peca(tabuleiro.getCasa(0, 6), Peca.PEAO_PRETO);
        Peca peca26 = new Peca(tabuleiro.getCasa(1, 6), Peca.PEAO_PRETO);
        Peca peca27 = new Peca(tabuleiro.getCasa(2, 6), Peca.PEAO_PRETO);
        Peca peca28 = new Peca(tabuleiro.getCasa(3, 6), Peca.PEAO_PRETO);
        Peca peca29 = new Peca(tabuleiro.getCasa(4, 6), Peca.PEAO_PRETO);
        Peca peca30 = new Peca(tabuleiro.getCasa(5, 6), Peca.PEAO_PRETO);
        Peca peca31 = new Peca(tabuleiro.getCasa(6, 6), Peca.PEAO_PRETO);
        Peca peca32 = new Peca(tabuleiro.getCasa(7, 6), Peca.PEAO_PRETO);

        
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
    public void moverPeca(int origemX, int origemY, int destinoX, int destinoY) {
        Casa origem = tabuleiro.getCasa(origemX, origemY);
        Casa destino = tabuleiro.getCasa(destinoX, destinoY);
        Peca peca = origem.getPeca();
        peca.mover(destino);
    }
    
    /**
     * @return o Tabuleiro em jogo.
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
