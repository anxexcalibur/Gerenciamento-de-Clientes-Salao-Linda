/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.linda.classes;
import java.util.ArrayList;
/**
 *
 * @author mimi
 */
public interface Gerenciador {
    //Interface para colocar metodos necessarios a todas as classes filhas
    public void adicionarCliente(Cliente c);
    //public void removerCliente(Cliente c);
    public ArrayList<Cliente> getClientes();
}
