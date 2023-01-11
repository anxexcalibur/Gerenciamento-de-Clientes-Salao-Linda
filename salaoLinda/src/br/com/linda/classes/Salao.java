/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public class Salao {
     //vetor de objetos Cliente para armazenar todos os clientes cadastrados no salão
    private ArrayList<Cliente> clientes;
    //vetor de objetos Servico para armazenar todos os serviços oferecidos pelo salão
    private ArrayList<Servico> servicos;

    public Salao(){
        this.clientes = new ArrayList<Cliente>();
        this.servicos = new ArrayList<Servico>();
    }
}
