/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keretaapi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dewa
 */
public class DBConnection {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "kereta_api";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    
    public static Connection getConnection(){
        Connection cnt = null;
        
        MysqlDataSource data_source = new MysqlDataSource();
        
        data_source.setServerName(servername);
        data_source.setUser(username);
        data_source.setPassword(password);
        data_source.setDatabaseName(dbname);
        data_source.setPortNumber(portnumber);
        
        try{
            cnt = data_source.getConnection();
        }catch (SQLException e){
            Logger.getLogger("Get Connection -> "+ DBConnection.class.getName()).log(Level.SEVERE,null,e);
        }
        
        
        return cnt;
    }
}
