/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

import java.util.ArrayList;

/**
 *
 * @author mimi
 */
public class GerenciadorSalao implements Gerenciador {
    private ArrayList<Cliente> clientes;
    // Implementação dos métodos abstratos
    public GerenciadorSalao()
    {
        clientes = new ArrayList<Cliente>();
    }
    @Override
    public void adicionarCliente(Cliente c) {
        if(c != null)
            clientes.add(c);
    }
    /*@Override
    public void removerCliente(Cliente c) {
        clientes.remove(c);
    }*/
    @Override
    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }
    public static Gerenciador gerenciador;
}
