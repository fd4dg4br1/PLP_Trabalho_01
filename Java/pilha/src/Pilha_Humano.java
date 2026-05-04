public interface Pilha_Humano {
    /* retorna o número de itens na pilha */
    public int tamanho();
    
    /* retorna true se a pilha está vazia, false senão */
    public boolean vazia();
    
    /*retorna, sem removê-lo, o item do topo da pilha;
    lança StackEmptyException se a pilha estiver vazia*/
    public Object topo() throws StackEmptyException;
    
    /* insere um item, passado em parâmetro, no topo da pilha */
    public void empilha (Object element);
    
    /* remove e retorna o item no topo da pilha; lança
    StackEmptyException se a pilha estiver vazia*/
    public Object desempilha() throws StackEmptyException;
}
