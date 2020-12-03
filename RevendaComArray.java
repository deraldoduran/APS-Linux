
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eu
 */
public class RevendaComArray {
    private Produto[] produto;

    
    
    private int indice;
    
    /*private int codigoProduto;
    private String descricaoProduto;
    private double valorCompra;
    private double custoArmazenagemouBeneficiamento;
    private double margemLucro;
    private int qtdEstoque;
    Produto codigoProduto, Produto descricaoProduto, Produto valorCompra, Produto custoArmazenagemouBeneficiamento, Produto margemLucro, Produto  qtdEstoque
    produto.set(indice, new Produto(codigoProduto, descricaoProduto, valorCompra, custoArmazenagemouBeneficiamento, margemLucro, qtdEstoque));
    */

    public RevendaComArray(int indice ) {
        this.produto = new Produto[indice];
        
    }
    
    public void inserirProduto(int indice, Produto codigoProduto, Produto descricaoProduto, Produto valorCompra, Produto custoArmazenagemouBeneficiamento, Produto margemLucro, Produto  qtdEstoque){
        
        this.produto[indice] = new Produto(codigoProduto, descricaoProduto, valorCompra, custoArmazenagemouBeneficiamento, margemLucro, qtdEstoque);
        
        //(codigoProduto, descricaoProduto, valorCompra, custoArmazenagemouBeneficiamento, margemLucro, qtdEstoque));
    }
    
    
    public void comprar(int code, Produto qtdProduto){ //inserir mais quantidade comprada
        for(int i = 0; i<indice; i++){
            if(code = produto[i].getCodigoProduto(){
                produto[i].setQtdEstoque(produto[i].getQtdEstoque + qtdProduto);
            }
        }
    }
}
