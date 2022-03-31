/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;

/**
 *
 * @author Fatec
 */
public class ClienteDAO {
    private Connection connection;
    
    public ClienteDAO(){
        this.connection = new ConnectionFactory().getConnection();
    } 
    
    public void adiciona(Cliente cliente){
        String sql = "INSERT INTO cliente(cli_nome) VALUES(?)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement (sql);
            //String id_aux=Integer.toString(cliente.getId());
            stmt.setString(1, cliente.getNome());
            stmt.execute();
            stmt.close();
        }
        
        catch (SQLException u){
            throw new RuntimeException(u);
        }
    }
}
