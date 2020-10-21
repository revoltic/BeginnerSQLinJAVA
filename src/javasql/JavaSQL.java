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
/**
 *
 * @author domdu
 */
public class JavaSQL {
    
    public static void main(String[] args) throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE","hr", "inf5180");
        
        Statement stm=con.createStatement();
        
        String sql= "select r.region_name, c.country_id, c.country_name" 
                +" from regions r join countries c on r.region_id=c.region_id";
    
        ResultSet rs=stm.executeQuery(sql);
        int id;
        String idc, nomr, nomc;
        while(rs.next()){
            idc = rs.getString(2);
            nomc = rs.getString(3);
             nomr = rs.getString(1);
            System.out.println(nomr+" - "+ idc+" - "+nomc);
        }
        
        con.close();
    }
}
