/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.donation;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author com
 */
public class ConnectToServer {
    
     public static Connection getConnection() {

        Connection connection=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood finder","root","");            

        } catch (Exception e) {
        }
        
        return connection;

    }

    
}

