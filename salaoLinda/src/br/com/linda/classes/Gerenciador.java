/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public interface Gerenciador {
    //Interface para colocar metodos necessarios a todas as classes filhas
    void adicionarCliente(Cliente c);
    void removerCliente(Cliente c);
    Cliente pesquisarCliente(String nome);
    void adicionarServico(Servico s);
    void removerServico(Servico s);
    Servico pesquisarServico(String nome);
}
