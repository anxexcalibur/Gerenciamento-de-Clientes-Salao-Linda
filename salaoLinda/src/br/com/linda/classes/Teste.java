/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public class Teste {
    public static void main(String[] args) {
        String nome="a";
        String endereco="a";
        String telefone="b";
        int id=1;
        Cliente cliente=new Cliente(nome,endereco,telefone,id);
        GerenciadorSalao gerenciador=new GerenciadorSalao();
        gerenciador.adicionarCliente(cliente);
        gerenciador.serializacaoArrays();
    }
}
