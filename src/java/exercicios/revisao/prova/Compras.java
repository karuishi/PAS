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
        return false; // produto nulo ou já cadastrado
        }
        cProduto.put(p.getCodigo(), p);
        return true;
    }

    public boolean adicionaFornecedor(Fornecedor f){
        if(f == null || cFornecedor.containsKey(f.getCodigo())){
            return false; // produto nulo ou já cadastrado
        }
        cFornecedor.put(f.getCodigo(), f);
        return true;
    }

    public void compra(String codigoProduto, String codigoFornecedor,int qtd){}
}
