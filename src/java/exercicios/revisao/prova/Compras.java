package exercicios.revisao.prova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compras {
    private Map<String, Produto> cProduto = new HashMap<>();
    private Map<String, Fornecedor> cFornecedor = new HashMap<>();
    private List<Estoque> cEstoque = new ArrayList<>();

    public boolean adicionaProduto(Produto p){
        if (p == null || cProduto.containsKey(p.getCodigo())) {
            return false;
        }
        cProduto.put(p.getCodigo(), p);
        return true;
    }

    public boolean adicionaFornecedor(Fornecedor f){
        if(f == null || cFornecedor.containsKey(f.getCodigo())){
            return false;
        }
        cFornecedor.put(f.getCodigo(), f);
        return true;
    }

    public void compra(String codigoProduto, String codigoFornecedor, int qtd) {
        Produto p = cProduto.get(codigoProduto);
        Fornecedor f = cFornecedor.get(codigoFornecedor);
        
        if (p != null && f != null) {
            Estoque novoEstoque = new Estoque(p, f, qtd);
            int index = cEstoque.indexOf(novoEstoque); // Usa o método equals de Estoque
            
            if (index != -1) {
                // Caso II: o estoque já existe, apenas incrementa
                Estoque existente = cEstoque.get(index);
                existente.setQuantidade(existente.getQuantidade() + qtd);
            } else {
                // Caso I: o estoque não existe, adiciona na lista
                cEstoque.add(novoEstoque);
            }
        }
    }

    public double quantidadeDeProduto(String codigoProduto) {
        double total = 0;
        for (Estoque e : cEstoque) {
            if (e.getProduto().getCodigo().equals(codigoProduto)) {
                total += e.getQuantidade();
            }
        }
        return total;
    }

    public String totalPorProduto() {
        StringBuilder sb = new StringBuilder("Total Produto\n");
        for (Produto p : cProduto.values()) {
            double qtdTotal = quantidadeDeProduto(p.getCodigo());
            if (qtdTotal > 0) {
                sb.append("Produto:").append(p.getDescricao()).append("\n");
                sb.append("Total:").append(p.getPreco() * qtdTotal).append("\n");
            }
        }
        return sb.toString().trim();
    }

    public String fornecedorProdutos() {
        StringBuilder sb = new StringBuilder("Lista de Fornecedores e seus produtos\n");
        for (Fornecedor f : cFornecedor.values()) {
            sb.append("Fornecedor: ").append(f.getDescricao()).append("\n");
            for (Estoque e : cEstoque) {
                if (e.getFornecedor().getCodigo().equals(f.getCodigo())) {
                    sb.append("Produto:").append(e.getProduto().getDescricao()).append("\n");
                }
            }
        }
        return sb.toString().trim();
    }

    // Método main conforme PDF
    public static void main(String args[]) {
        Compras c = new Compras();
        
        Produto[] p = new Produto[3];
        p[0] = new Produto(); p[0].setCodigo("P-1"); p[0].setPreco(1.20);
        c.adicionaProduto(p[0]);
        
        p[1] = new Produto(); p[1].setCodigo("P-30");
        p[1].setDescricao("Papel"); p[1].setPreco(15);
        c.adicionaProduto(p[1]);
        
        p[2] = new Produto(); p[2].setCodigo("P-3"); p[2].setPreco(3.25);
        c.adicionaProduto(p[2]);
        
        Fornecedor[] f = new Fornecedor[2];
        f[0] = new Fornecedor();
        f[0].setCodigo("F-1");
        f[0].setDescricao("Empresa XO");
        c.adicionaFornecedor(f[0]);
        
        f[1] = new Fornecedor();
        f[1].setCodigo("F-2");
        f[1].setDescricao("Empresa ABC");
        c.adicionaFornecedor(f[1]);
        
        c.compra("P-3", "F-1", 10);
        c.compra("P-3", "F-1", 20);
        c.compra("P-30", "F-1", 5);
        c.compra("P-30", "F-1", 50);
        c.compra("P-1", "F-1", 20);
        c.compra("P-1", "F-2", 30);
        
        p[0].setDescricao("CD");
        p[2].setDescricao("Cola");
        
        System.out.println(c.quantidadeDeProduto("P-30"));
        System.out.println(c.totalPorProduto());
        System.out.println(c.fornecedorProdutos());
    }
}