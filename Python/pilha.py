# Estado global da aplicação
MAX = 5
pilha = []

# Comportamentos (Funções que alteram ou leem o estado)
def is_empty():
    return len(pilha) == 0

def exibir():
    if is_empty():
        print("=> Estado atual da Pilha: []")
    else:
        # O Python já formata listas automaticamente com colchetes e vírgulas
        print(f"=> Estado atual da Pilha: {pilha}")

def push(valor):
    if len(pilha) < MAX:
        pilha.append(valor)
        print(f"\n[OK] {valor} empilhado.")
    else:
        print("\n[ERRO] Pilha cheia! Não é possível empilhar.")

def pop():
    if not is_empty():
        valor = pilha.pop()
        print(f"\n[OK] Valor desempilhado: {valor}")
        return valor
    else:
        print("\n[ERRO] A pilha está vazia! Não há o que desempilhar.")
        return None

# Execução Principal (Interatividade)
def main():
    print("=================================")
    print("  SIMULADOR DE PILHA - PYTHON")
    print("     (PARADIGMA IMPERATIVO)")
    print("=================================")

    opcao = ''
    
    while opcao != '3':
        print("\nO que você deseja fazer?")
        print("1. Empilhar (Push)")
        print("2. Desempilhar (Pop)")
        print("3. Sair")
        opcao = input("Opção: ")

        if opcao == '1':
            entrada = input("Digite o valor a empilhar: ")
            # Validação para garantir que o usuário digitou um número inteiro
            if entrada.lstrip('-').isdigit(): 
                valor = int(entrada)
                push(valor)
            else:
                print("\n[ERRO] Por favor, digite um número inteiro válido.")
            exibir()
            
        elif opcao == '2':
            pop()
            exibir()
            
        elif opcao == '3':
            print("\nEncerrando a demonstração...")
            
        else:
            print("\n[ERRO] Opção inválida!")

if __name__ == "__main__":
    main()