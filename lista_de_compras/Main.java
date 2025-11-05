import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Adicionar");
            System.out.println("2. Listar");
            System.out.println("3. Remover");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção (1-4): ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o item para adicionar: ");
                    String item = scanner.nextLine();
                    lista.add(item); 
                    System.out.println("Item adicionado!");
                    break;

                case "2":
                    System.out.println("\n--- Itens na Lista ---");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + ". " + lista.get(i));
                        }
                    }
                    break;

                case "3":
                    System.out.print("Digite o índice (número) do item para remover: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        
                        if (indice >= 0 && indice < lista.size()) {
                            lista.remove(indice); 
                            System.out.println("Item removido!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                    }
                    break;

                case "4":
                    System.out.println("Saindo do programa...");
                    scanner.close(); 
                    return; 

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

