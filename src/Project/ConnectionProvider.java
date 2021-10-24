/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author moham
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","mysql");
//            Statement st = con.createStatement();
//            ResultSet result = st.executeQuery("select * from buyer");
            
            return con;
        }catch(Exception e){
            e.printStackTrace(); 
            return null;
        }
    }
}
