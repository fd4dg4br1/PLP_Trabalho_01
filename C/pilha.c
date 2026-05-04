#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX 5

// 1. Dados: A estrutura da Pilha
typedef struct {
    int itens[MAX];
    int topo;
} Pilha;

// 2. Comportamentos: Funções que recebem um ponteiro para alterar o estado da Pilha
void inicializar(Pilha *p) {
    p->topo = -1;
    // Limpeza inicial: garante que todas as variáveis do array comecem zeradas
    for (int i = 0; i < MAX; i++) {
        p->itens[i] = 0; 
    }
}

bool isEmpty(Pilha *p) {
    return p->topo == -1;
}

void exibir(Pilha *p) {
    if (isEmpty(p)) {
        printf("=> Estado atual da Pilha: []\n");
        return;
    }
    printf("=> Estado atual da Pilha: [");
    for (int i = 0; i <= p->topo; i++) {
        printf("%d", p->itens[i]);
        if (i < p->topo) {
            printf(", ");
        }
    }
    printf("]\n");
}

void push(Pilha *p, int valor) {
    if (p->topo < MAX - 1) {
        p->topo++;
        p->itens[p->topo] = valor;
        printf("\n[OK] %d empilhado.\n", valor);
    } else {
        printf("\n[ERRO] Pilha cheia! Nao e possivel empilhar.\n");
    }
}

void pop(Pilha *p) {
    if (!isEmpty(p)) {
        int valor = p->itens[p->topo];
        p->itens[p->topo] = 0; // LIMPEZA DA VARIÁVEL: Sobrescreve o valor antigo com 0
        p->topo--;
        printf("\n[OK] Valor desempilhado: %d\n", valor);
    } else {
        printf("\n[ERRO] A pilha esta vazia! Nao ha o que desempilhar.\n");
    }
}

// Nova função para limpar todas as variáveis da pilha de uma vez
void limparPilha(Pilha *p) {
    for (int i = 0; i <= p->topo; i++) {
        p->itens[i] = 0; // Zera cada item na memória
    }
    p->topo = -1; // Reseta o topo
    printf("\n[OK] Pilha completamente limpa!\n");
}

// Função auxiliar para evitar loops infinitos caso o usuário digite uma letra em vez de número
void limparBuffer() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

// 3. Execução Principal (Interatividade)
int main() {
    Pilha minhaPilha;
    inicializar(&minhaPilha); // Passa o endereço de memória da pilha para inicializá-la
    
    int opcao = 0;
    int valor;

    printf("=================================\n");
    printf("  SIMULADOR DE PILHA - C (IMPERATIVO)\n");
    printf("=================================\n");

    while (opcao != 4) {
        printf("\nO que voce deseja fazer?\n");
        printf("1. Empilhar (Push)\n");
        printf("2. Desempilhar (Pop)\n");
        printf("3. Limpar toda a Pilha\n");
        printf("4. Sair\n");
        printf("Opcao: ");

        // Verifica se a leitura do inteiro foi bem sucedida
        if (scanf("%d", &opcao) != 1) {
            printf("\n[ERRO] Entrada invalida! Por favor, digite um numero.\n");
            limparBuffer();
            continue;
        }

        switch (opcao) {
            case 1:
                printf("Digite o valor a empilhar: ");
                if (scanf("%d", &valor) == 1) {
                    push(&minhaPilha, valor);
                } else {
                    printf("\n[ERRO] Por favor, digite um numero inteiro valido.\n");
                    limparBuffer();
                }
                exibir(&minhaPilha);
                break;
            case 2:
                pop(&minhaPilha);
                exibir(&minhaPilha);
                break;
            case 3:
                limparPilha(&minhaPilha);
                exibir(&minhaPilha);
                break;
            case 4:
                printf("\nEncerrando a demonstracao...\n");
                break;
            default:
                printf("\n[ERRO] Opcao invalida!\n");
                break;
        }
    }

    return 0;
}