import java.util.Scanner;

public class ShoppingCart {
    public static void SshoppingCart(String[] args) {
        // Declare e inicialize a variável booleana
        boolean outOfStock = false;
        
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Peça ao usuário para inserir a quantidade desejada
        System.out.print("Insira a quantidade desejada: ");
        int quantidade = scanner.nextInt();
        
        // Verifique se o item está fora de estoque
        if (quantidade <= 0) {
            outOfStock = true;
            System.out.println("O item não está disponível.");
        } else {
            // Verifique se a quantidade é maior que 1 para alterar a mensagem para plural
            String mensagem = (quantidade > 1) ? "itens" : "item";
            
            // Calcule o custo total (suponha que o custo unitário seja 10)
            double custoTotal = quantidade * 10;
            
            // Imprima a mensagem e o custo total
            System.out.println("Você selecionou " + quantidade + " " + mensagem + ".");
            System.out.println("O custo total é: $" + custoTotal);
        }
        
        // Feche o Scanner
        scanner.close();
    }
}