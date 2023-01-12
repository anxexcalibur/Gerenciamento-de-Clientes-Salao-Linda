/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.dal;

import java.sql.*;

/**
 *
 * @author mimi
 */
public class ModuloConexao {
    //classe responsavel pela conexao entre o programa jar e o bd
    //metodo responsavel por estabelecer a conexao com o bd
    public static Connection conectar()
    {
        Connection conexao=null;
        //o comando abaixo "chama" o driver
        String driver="com.mysql.cj.jdbc.Driver";
        //armazenando informações referentes ao banco
        String url="jdbc:mysql://localhost:3306/dbInfoCliente";
        String user="root";
        String password="Jpjm32217%";
        //Estabelecendo a conexao com o banco
        try
        {
            Class.forName(driver);
            conexao=DriverManager.getConnection(url, user, password);
            return conexao;
        }
        catch (Exception e)
        {
            //o comando abaixo expoe o erro
            //System.out.println(e);
            return null;
        }    
    }
}
