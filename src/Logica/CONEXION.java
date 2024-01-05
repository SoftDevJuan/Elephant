
package Logica;
import java.util.logging.Logger;
import java.sql.*;
import java.util.logging.Level;

public class CONEXION {
private String Servidor="localhost";
private String Base="elephant";
private String Usuario="root";
private String Password="";

private Connection conex;
public Connection getConex(){
 return this.conex;   
}

public String Conectar(){
    String Mensaje="";
    String URL="jdbc:mysql://localhost:3306/elephant";
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conex=DriverManager.getConnection(URL,Usuario,Password);
         Mensaje="Conexion exitosa";
    }catch(ClassNotFoundException ex){
        Mensaje="Error al intentar cargar el conector"+ex.getMessage();
        
    }catch (SQLException ex){
      Mensaje="Error al intentar conectar "+ ex.getMessage();    
    }
    return Mensaje;
}
public String desconectar(){
    String Mensaje="";
    try {
        conex.close();
    } catch (SQLException ex) {
       Mensaje= "Error al intentar cerrar la base de datos"+ ex.getMessage();
    }
    return Mensaje;
}

}
