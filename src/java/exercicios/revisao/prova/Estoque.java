package exercicios.revisao.prova;

public class Estoque {
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;

    public Estoque(Produto produto, Fornecedor fornecedor, int quantidade){
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public Fornecedor getFornecedor() { return fornecedor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Estoque)) return false;
        Estoque outro = (Estoque) o;
        return this.produto.getCodigo().equals(outro.produto.getCodigo()) &&
               this.fornecedor.getCodigo().equals(outro.fornecedor.getCodigo());
    }
}