
/**
 * Escreva a descrição da classe Peao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Peao
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int cor;
    
    /**
     * COnstrutor para objetos da classe Peao
     */
    public Peao(int cor)
    {
        this.cor = cor;
    }

    public Casa mover(Casa casa, Casa destino, Peca peca) {
        
        //variavel de controle. (Andre)
        Casa novaCasa = casa;
        
        // verifica pelo metodo podeMover(), se o destino esta na posicao permitida para o tipo de peca. (Andre)
        if(this.podeMover(casa, destino)){
            casa.removerPeca();
            destino.colocarPeca(peca); 
            novaCasa = destino;
            
        }
        
        if((this.cor == 0 && destino.y == 7) || (this.cor == 6 && destino.y == 0)){
            System.out.println("Vira rainha por padrao");
            peca.mudaTipo(3);
        }
        return novaCasa;
        
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
           else{
               if(casa.x == x && (casa.y == y + 1 || (casa.y == 6 && y == 4)) && (destino.getPeca() == null)){
                   return true;                   
               }
               else if((casa.x == x + 1 || casa.x == x - 1) && (casa.y == y + 1) && (destino.getPeca() != null)){
                   return true;
               }
               else {
                   return false;
               }
           }           

    } 
    
}
