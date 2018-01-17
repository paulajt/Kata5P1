
package kata5_p1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Kata5_P1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Class.forName("org.sqlite.JDBC");	
         Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\paula\\Desktop\\Kata5.db");	
    
        Statement statement = (Statement) connection.createStatement();        
        ResultSet rs = statement.executeQuery("SELECT * FROM PEOPLE;");
                  
        while (rs.next()) {
        System.out.println("ID = " + rs.getInt("Id"));
        System.out.println("NAME = " + rs.getString("Nombre"));
        }
        
        statement.execute("CREATE TABLE 'MAIL' ('Id' INTEGER PRIMARY KEY AUTOINCREMENT,"
                                              + "'Mail' INTEGER NOT NULL);");
    }
    
}
