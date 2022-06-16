import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Faw
 */
public class koneksi {
    public static Connection tiket_kereta;
    
    public static Connection getConnection()throws SQLException {
       if(tiket_kereta==null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    tiket_kereta = DriverManager.getConnection
                        ("jdbc:mysql://localhost/tiket_kereta","root","");
                    
            }catch(SQLException ex){
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tiket_kereta;

    }

    public static Object getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}