import java.util.Scanner;

public class Pilha {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Construtor
    public Pilha(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Comportamento: Empilhar
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("\n[OK] " + value + " empilhado.");
        } else {
            System.out.println("\n[ERRO] Pilha cheia! Não é possível empilhar.");
        }
    }

    // Comportamento: Desempilhar
    public int pop() {
        if (!isEmpty()) {
            int value = stackArray[top--];
            System.out.println("\n[OK] Valor desempilhado: " + value);
            return value;
        } else {
            System.out.println("\n[ERRO] A pilha está vazia! Não há o que desempilhar.");
            return -1;
        }
    }

    // Verifica se está vazia
    public boolean isEmpty() {
        return (top == -1);
    }

    // Método auxiliar para visualizar a pilha no terminal
    public void exibir() {
        if (isEmpty()) {
            System.out.println("=> Estado atual da Pilha: []");
            return;
        }
        System.out.print("=> Estado atual da Pilha: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i]);
            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }  
}