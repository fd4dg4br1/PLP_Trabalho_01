import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha minhaPilha = new Pilha(5); // Instancia uma pilha com limite de 5 elementos
        int opcao = 0;

        System.out.println("=================================");
        System.out.println("  SIMULADOR DE PILHA - JAVA (OO)");
        System.out.println("=================================");

        // Laço de repetição mantém o menu ativo
        while (opcao != 3) {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1. Empilhar (Push)");
            System.out.println("2. Desempilhar (Pop)");
            System.out.println("3. Sair");
            System.out.print("Opção: ");

            // Valida se o usuário digitou um número
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a empilhar: ");
                        if (scanner.hasNextInt()) {
                            int valor = scanner.nextInt();
                            minhaPilha.push(valor);
                        } else {
                            System.out.println("\n[ERRO] Por favor, digite um número inteiro válido.");
                            scanner.next(); // Limpa o buffer de erro
                        }
                        minhaPilha.exibir();
                        break;
                    case 2:
                        minhaPilha.pop();
                        minhaPilha.exibir();
                        break;
                    case 3:
                        System.out.println("\nEncerrando a demonstração...");
                        break;
                    default:
                        System.out.println("\n[ERRO] Opção inválida!");
                        break;
                }
            } else {
                System.out.println("\n[ERRO] Entrada inválida! Por favor, digite um número.");
                scanner.next(); // Limpa o buffer para a próxima leitura
            }
        }
        
        scanner.close(); // Fecha o leitor para evitar vazamento de memória
    }
}
