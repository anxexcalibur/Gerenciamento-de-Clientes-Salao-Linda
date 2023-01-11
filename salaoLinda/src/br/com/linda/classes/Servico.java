/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public class Servico {
    private String nome;
    private double preco;
    private Salao salao;
    
    public Servico(String nome, double preco,int pontosFidelidade){
        this.nome = nome;
        this.preco = preco;
    }
    public String GetNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    //esse metodo serve para calcular quantos pontos o cliente ganha realizando uma compra
     //método para calcular a quantidade de pontos de fidelidade que um cliente ganha ao realizar esse serviço
    public void atribuirPontosFidelidade(Cliente cliente){
        //calculando pontos de fidelidade baseado no preço do serviço
        int pontos = (int) (this.preco / 10);
        //regra adicional para atribuir mais pontos para serviços mais caros
        if(this.preco > 50) pontos += 5;
        salao.atribuirPontosFidelidade(cliente, pontos);
    }
}
