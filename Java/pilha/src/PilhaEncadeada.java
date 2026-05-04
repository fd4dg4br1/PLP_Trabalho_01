
public class PilhaEncadeada implements Pilha_Humano {
    private Nó topo; // referência para o nó do topo
    private int tam; // número de itens na pilha

    public PilhaEncadeada() {
        topo = null;
        tam = 0;
    }

    public int tamanho() {
        return tam;
    }

    public boolean vazia() {
        return (topo == null);
    }

    public void empilha(Object item) {
        Nó v = new Nó(); // cria um novo nó
        v.posItem(item);
        v.posProx(topo); // encadeia o novo nó
        topo = v;
        tam++;
    }

    public Object topo() throws StackEmptyException {
        if (vazia())
            throw new StackEmptyException("Pilha está vazia.");
        return topo.retItem();
    }

    public Object desempilha() throws StackEmptyException {
        if (vazia())
            throw new StackEmptyException("Pilha está vazia.");
        Object aux = topo.retItem();
        topo = topo.retProx(); // aponta para o próximo nó
        tam--;
        return aux;
    }
}