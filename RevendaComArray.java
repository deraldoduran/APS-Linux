

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
    private ArrayList<Produto> produto;

    
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
        
        this.produto = new ArrayList (indice);
        for(int i = 0;i<indice; i++){
            this.produto.add(new Produto());

    }
    }
    
    

   // public void inserirProduto(int indice, Produto codigoProduto, Produto descricaoProduto, Produto valorCompra, Produto custoArmazenagemouBeneficiamento, Produto margemLucro, Produto  qtdEstoque){
       // produto.set(indice, new Produto(codigoProduto, descricaoProduto, valorCompra, custoArmazenagemouBeneficiamento, margemLucro, qtdEstoque));
   // }
    
   // public void comprar(int code, int qtdcomprada){
       // int cont = 0;
      //  for(int i = 0; i<this.indice; i++){
      //  if(this.produto.get(i).getCodigoProduto().equals(code)){
         //   this.produto.get(i).compra(qtdcomprada);
       // }if (this.produto.get(i).getCodigoProduto() != code){
       //     cont++;
       // }
        //    }
       // if(cont == this.indice){
         //   System.out.println("Esse produto nao existe!");
      //  }
   // }
    
    
//}
    public void inserirProduto(int indice, Produto codigoProduto, Produto descricaoProduto, Produto valorCompra, Produto custoArmazenagemouBeneficiamento, Produto margemLucro, Produto  qtdEstoque){
        
        this.produto.set(indice, codigoProduto);
        this.produto.set(indice, descricaoProduto);
        this.produto.set(indice, valorCompra);
        this.produto.set(indice, custoArmazenagemouBeneficiamento);
        this.produto.set(indice, margemLucro);
        this.produto.set(indice, qtdEstoque);
        
//(codigoProduto, descricaoProduto, valor(Compra, custoArmazenagemouBeneficiamento, margemLucro, qtdEstoque);
        
        //(codigoProduto, descricaoProdu valorCompra, custoArmazenagemouBeneficiamento, margemLucro, qtdEstoque));
    }
    
    
    public void comprar(int code, int qtd){ //inserir mais quantidade comprada
            int cont=0;
        for(int i = 0; i<indice; i++){
            if(code == produto.get(i).getCodigoProduto()){
                produto.get(i).compra(qtd);
            }if(this.produto.get(i).getCodigoProduto()!=code){
                cont++;
            }
        }
        if(cont == this.indice){
            System.out.println("Produto Inexistente, tente outro código!");
        }
    }

    public void vender(int code, int qtd){ 
        int cont=0;
    for(int i = 0; i<indice; i++){
        if(code == produto.get(i).getCodigoProduto()){
            produto.get(i).venda(qtd);
        }if(this.produto.get(i).getCodigoProduto()!=code){
            cont++;
        }
    }
    if(cont == this.indice){
        System.out.println("Produto Inexistente, tente outro código!");
    }
}

public void consultaPrecoVenda(int code){ 
    int cont=0;
for(int i = 0; i<indice; i++){
    if(code == produto.get(i).getCodigoProduto()){
        System.out.println (produto.get(i).calculaPrecodeVenda ());
    }if(this.produto.get(i).getCodigoProduto()!=code){
        cont++;
    }
}
if(cont == this.indice){
    System.out.println("Produto Inexistente, tente outro código!");
}
}

public void listarPrecos (){
    for(int i = 0; i<this.indice; i++){
        System.out.println(this.produto.get(i).getCodigoProduto());
        System.out.println(this.produto.get(i).getDescricaoProduto());
        System.out.println(this.produto.get(i).getValorCompra());
    }
}

}