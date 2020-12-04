/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eu
 */
package analiseprojetossistemas;

public class Produto {
    
    private int codigoProduto;
    private String descricaoProduto;
    private double valorCompra;
    private double custoArmazenagemouBeneficiamento;
    private double margemLucro;
    private int qtdEstoque;
    
    

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    
    void compra(int qtd){
        qtdEstoque = qtdEstoque + qtd;
    }
    
    void venda(int qtd){
        qtdEstoque = qtdEstoque - qtd;
    }

    double calculaPrecodeVenda (){
        return valorCompra + custoArmazenagemouBeneficiamento + margemLucro *(valorCompra + custoArmazenagemouBeneficiamento);
    }
    
    /**
     *
     */
    public Produto(){
        
    }

    public Produto(int codigoProduto, String descricaoProduto, double valorCompra, double custoArmazenagemouBeneficiamento, double margemLucro) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorCompra = valorCompra;
        this.custoArmazenagemouBeneficiamento = custoArmazenagemouBeneficiamento;
        this.margemLucro = margemLucro;
    }

    public Produto(int codigoProduto, String descricaoProduto) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public Produto(int codigoProduto, String descricaoProduto, double valorCompra, double custoArmazenagemouBeneficiamento, double margemLucro, int qtdEstoque) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorCompra = valorCompra;
        this.custoArmazenagemouBeneficiamento = custoArmazenagemouBeneficiamento;
        this.margemLucro = margemLucro;
        this.qtdEstoque = qtdEstoque;
    }
    
    
    
    /**
     * @return the valorCompra
     */
    public double getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * @return the custoArmazenagemouBeneficiamento
     */
    public double getCustoArmazenagemouBeneficiamento() {
        return custoArmazenagemouBeneficiamento;
    }

    /**
     * @param custoArmazenagemouBeneficiamento the custoArmazenagemouBeneficiamento to set
     */
    public void setCustoArmazenagemouBeneficiamento(double custoArmazenagemouBeneficiamento) {
        this.custoArmazenagemouBeneficiamento = custoArmazenagemouBeneficiamento;
    }

    /**
     * @return the margemLucro
     */
    public double getMargemLucro() {
        return margemLucro;
    }

    /**
     * @param margemLucro the margemLucro to set
     */
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
    
    
}
