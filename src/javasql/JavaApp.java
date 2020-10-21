/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleDriver;
import java.sql.PreparedStatement;
/**
 *
 * @author domdu
 */
public class JavaApp {
    public static void main(String[] args) throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE","hr", "inf5180");
        
        String sql = "insert into COUNTRIES values(?,?,?)";
    
        PreparedStatement stm=con.prepareStatement(sql);
        stm.setString(1,"SP");
        stm.setString(2,"Singapore");
        stm.setInt(3,1);
        
        
        int nombre= stm.executeUpdate();
    
        System.out.println("Le nombre est "+nombre);
    
    
    
        con.close();
        
    }
}
