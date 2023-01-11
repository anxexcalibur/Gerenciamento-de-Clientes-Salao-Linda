/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

import java.util.List;

/**
 *
 * @author mimi
 */
public class GerenciadorSalao implements Gerenciador {
    List<Cliente> clientes;
    List<Servico> servicos;
    // Implementação dos métodos abstratos
    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }
    public void removerCliente(Cliente c) {
        clientes.remove(c);
    }
    public Cliente pesquisarCliente(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equals(nome)) {
                return c;
            }
        }
        return null;
    }
    public void adicionarServico(Servico s) {
        servicos.add(s);
    }
    public void removerServico(Servico s) {
        servicos.remove(s);
    }
    public Servico pesquisarServico(String nome) {
        for (Servico s : servicos) {
            if (s.getNome().equals(nome)) {
                return s;
            }
        }
        return null;
    }
}
