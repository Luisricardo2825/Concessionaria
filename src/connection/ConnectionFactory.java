package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

private static final String DRIVER = "com.mysql.jdbc.Driver";
private static final String URL = "jdbc:mysql://localhost:3306/concessionaria";
private static final String USER = "root";
private static final String PASSWORD = "";
    
public static Connection getConnection(){
    
    //colocamos a função com static para fazer referenciação a ela e a classe, sem precisar instanciar a classe.
    //utilizando instrção try-catch em casos de erro, por exemplo, a classe não existir, não for importada, etc.
    try {
        Class.forName(DRIVER);
        //método estático - não precisa instanciar. ~~~blablabla
        return DriverManager.getConnection(URL, USER, PASSWORD);
      
    } catch (ClassNotFoundException | SQLException ex){
        //Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        throw new RuntimeException("Erro na Conexão! :(", ex);
    }

}

//criando métodos estáticos para fechar a conexão e evitar sobrecarga do servidor na hora de utilizar o mesmo!
//sobrecargas... ithink
public static void closeConnection(Connection con){
//recebendo como parâmetro uma conexão.
        try {
           if(con != null){
            //se con (a Conexão) for diferente de nulo, ou seja, está aberta, feche.
            con.close();
           }
            }
         catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

public static void closeConnection(Connection con, PreparedStatement stmt){
    //fechamos a Conexão con, com o método closeConnection criado acima.
    closeConnection(con);
    
    try {
        if(stmt != null){
            //fechando o stmt no mesmo estilo do Connection con.
            stmt.close();
        }
         } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
    //fechamos a Conexão con e stmt, com  a função closeConnection(con,stmt) criado acima.
    closeConnection(con, stmt);
    
    try {
        if(rs != null){
            //fechando o stmt no mesmo estilo do Connection con e stmt.
            rs.close();
        }
         } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

}
