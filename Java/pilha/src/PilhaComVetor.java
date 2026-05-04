public class PilhaComVetor implements Pilha_Humano {
    /* Tamanho máximo fixo do vetor usado como Pilha_Humano */
    public static final int CapacidadeMax = 1000;
    
    /* Capacidade da Pilha_Humano */
    private int Capacidade;
    
    /* Vetor usado como Pilha_Humano */
    private Object P[];
    
    /* índice do elemento do topo da Pilha_Humano */
    private int topo = -1;

    /* inicia a Pilha_Humano para usar um vetor com tamanho máximo Capacidade Max */
    public PilhaComVetor() {
        this(CapacidadeMax);
    }

    /* inicia a Pilha_Humano para um arranjo com o tamanho fornecido */
    public PilhaComVetor(int tam) {
        Capacidade = tam;
        P = new Object[Capacidade];
    }

    @Override
    public int tamanho() {
        return (topo + 1);
    }

    @Override
    public boolean vazia() {
        return (topo < 0);
    }

    // Método obrigatório pela interface para consultar o topo sem remover
    @Override
    public Object topo() throws StackEmptyException {
        if (vazia())
            throw new StackEmptyException("Pilha vazia!");
        return P[topo];
    }

    @Override
    public void empilha(Object obj) throws StackFullException {
        if (tamanho() == Capacidade)
            throw new StackFullException("Pilha cheia!");
        P[++topo] = obj;
    }

    @Override
    public Object desempilha() throws StackEmptyException {
        Object elemento;
        if (vazia())
            throw new StackEmptyException("Pilha vazia!");
        
        elemento = P[topo];
        P[topo] = null; // Libera P topo para a coleta de lixo
        topo--;
        return elemento;
    }
}