public class Nó {
    // Variáveis de instância
    private Object item;
    private Nó prox;

    // Construtores simples
    public Nó() {
        this (null, null);
    }

    public Nó (Object i, Nó n) {
        item = i;
        prox = n;
    }

    // Métodos de acesso
    Object retItem() {
        return item;
    }

    Nó retProx() {
        return prox;
    }

    // Modificadores
    void posItem (Object novoItem) {
        item = novoItem;
    }

    void posProx (Nó novoNó) {
        prox = novoNó;
    }
}
