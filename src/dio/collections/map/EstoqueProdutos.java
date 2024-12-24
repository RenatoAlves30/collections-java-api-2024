package dio.collections.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibitProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalDoEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto produto : estoqueProdutosMap.values()) {
                valorTotalDoEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotalDoEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3, "Produto C", 2, 15.0);

        estoqueProdutos.exibitProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais CARO: " + estoqueProdutos.obterProdutoMaisCaro());
    }


}
