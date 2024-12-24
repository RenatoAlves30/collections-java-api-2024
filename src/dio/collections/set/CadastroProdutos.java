package dio.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPornome() {
        Set<Produto> produtosPornome = new TreeSet<>(produtoSet);
        return produtosPornome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Produto 5", 15, 5);
        cadastroProdutos.adicionarProduto(2, "Produto 0", 20, 10);
        cadastroProdutos.adicionarProduto(1, "Produto 3", 10, 2);
        cadastroProdutos.adicionarProduto(9, "Produto 9", 2, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPornome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
