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
public class Salao {
     //vetor de objetos Cliente para armazenar todos os clientes cadastrados no salão
    private ArrayList<Cliente> clientes;
    //vetor de objetos Servico para armazenar todos os serviços oferecidos pelo salão

    public Salao(){
        this.clientes = new ArrayList<Cliente>();
    }
    public void atribuirPontosFidelidade(Cliente cliente,int pontos)
    {
        this.clientes.add(cliente); //Esse metodo adiciona um objeto cliente para array de clientes
        cliente.getPontosFidelidade(); //Estava tentando adicionar esses pontos um objeto instanciado de alguma maneira
    }
}
