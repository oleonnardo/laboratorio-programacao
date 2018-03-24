/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Leonardo
 */
public class Fornecedor{
    
    private Pessoa pessoa;
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(Pessoa pessoa, double valorCredito, double valorDivida) {
        this.pessoa = pessoa;
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }  
    
    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

}
