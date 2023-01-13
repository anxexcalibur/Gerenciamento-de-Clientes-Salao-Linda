/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author mimi
 */
/*public class GerenciadorSalao implements Gerenciador {
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
    }
    @Override
    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }
    public static Gerenciador gerenciador;
}*/
public class GerenciadorSalao implements Gerenciador {
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    // Implementação dos métodos abstratos
    @Override
    public void adicionarCliente(Cliente c) {
        if(c != null)
            clientes.add(c);
    }
    @Override
    public void destruirRegistro() {
        clientes.clear();
        //Destruir registro em outras palavras é limpar todos os itens da lista
    }
    @Override
    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }
    public static void serializacaoArrays()
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("arrayClientes");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(clientes);
            oos.close();
            fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    public static void desSerializacaoArrays()
    {
        try
        {
            FileInputStream fis=new FileInputStream("arrayClientes");
            ObjectInputStream ois=new ObjectInputStream(fis);
            clientes=(ArrayList)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for(int i=0;i<clientes.size();i++)
            System.out.println(clientes.get(i));
        for(int i=0;i<=2;i++)
            System.out.println("");
    }
    
}
