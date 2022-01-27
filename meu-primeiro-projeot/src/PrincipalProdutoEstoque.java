import java.util.Scanner;

public class PrincipalProdutoEstoque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos produtos?");
		int quantidadeProdutos = sc.nextInt();
		
		/*
		 * 		precisamos dessa linha extra para garantir que uma nova linha seja lida,  
		 * 		pois o nextInt não lê nova linha, mas apenas um número inteiro.
		 */
		sc.nextLine();
		
		Estoque estoque = new Estoque();
		
		estoque.produtos = new Produto[quantidadeProdutos];
		
		for(int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\nProduto " + i);
			System.out.println("--------------");
			
			System.out.println("Descrição: ");
			estoque.produtos[i].descricao = sc.nextLine();
			
			System.out.println("Quantidade de itens: ");
			estoque.produtos[i].quantidade = sc.nextInt();
			
			sc.nextLine();
		}
		estoque.listarProdutos();
	}
}
