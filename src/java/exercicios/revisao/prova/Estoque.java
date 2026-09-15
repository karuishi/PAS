package exercicios.revisao.prova;

public class Estoque {
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;

    Estoque(Produto produto, Fornecedor fornecedor, int quantidade){
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return produto;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public Fornecedor getFornecedor(){
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public boolean equals(Object o){
        //O critério de igualdade é se tiver o mesmo código do produto e o mesmo código do fornecedor
        if(this == o) return true;
        if(!(o instanceof Estoque)) return false;
        Estoque outro = (Estoque) o;
        return this.produto.getCodigo().equals(outro.produto.getCodigo()) &&
        this.fornecedor.getCodigo().equals(outro.fornecedor.getCodigo());
    }
}
