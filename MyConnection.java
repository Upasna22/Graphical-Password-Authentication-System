/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package desktopapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author Administrator
 */
public class MyConnection {
    
    public Connection con;
    public static String  jdbcDriver = "";
    public static String  dbURL = "";
    public static String  username = "";
    public static String  password = "";
    public static String  imagePath = "";
    public static String  wavPath = "";
    
    public Connection dbConnection()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/graphicalpassword","root","admin");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return con;
    }
    public void initaliseProperties() throws FileNotFoundException
    {
        try
        {
              Properties pro =new Properties();
              pro.load(new FileInputStream(new File("C:/Graphicalproperties.properties")));
              jdbcDriver = pro.getProperty("jdbc.driver");
              dbURL = pro.getProperty("jdbc.url");
              username = pro.getProperty("jdbc.user");
              password = pro.getProperty("jdbc.password");
              imagePath = pro.getProperty("Imagepath");
              wavPath = pro.getProperty("Tonepath");
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
     }
}
