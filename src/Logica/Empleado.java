
package Logica;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class Empleado {
    private String nombre, apellidos, usuario, password, puesto;
    private int nomina, numtienda;
   
    
    public Empleado(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public int getNumtienda() {
        return numtienda;
    }

    public void setNumtienda(int numtienda) {
        this.numtienda = numtienda;
    }


    
    
    
    
    
    //metodos SQL
    
    public String Insertar(){
        String mensaje = "";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        if(connect.getConex() != null){
        try{
            String SQLsentence = "insert into empleado values(?,?,?,?,?,?,?)";
            PreparedStatement ps = connect.getConex().prepareStatement(SQLsentence);
            ps.setInt(1,getNomina());
            ps.setString(2,getNombre());
            ps.setString(3,getApellidos());
            ps.setString(4,getUsuario());
            ps.setString(5,getPassword());
            ps.setString(6,getPuesto());
            ps.setInt(7,getNumtienda());
            
            int nfila = ps.executeUpdate();
            mensaje = "Registro exitoso";
            
        }catch(SQLException ex){
            mensaje = "Error " + ex.getMessage();
        }
        }else{mensaje = "registro fallido";}
        
        return mensaje;
    }
    
    
    public String Consular(){
        String mensaje = "";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        
        if(connect.getConex() != null){
            try{
                String SQLsentence = "select * from empleado";
                PreparedStatement ps = connect.getConex().prepareStatement(SQLsentence);
                ps.setInt(1,nomina);
                ps.setString(2,nombre);
                ps.setString(3,apellidos);
                ps.setString(4,usuario);
                ps.setString(5,password);
                ps.setString(6,puesto);
                ps.setDouble(7,numtienda);
              
                ResultSet resultado = ps.executeQuery();
                if(resultado.first()){
                    this.setNomina(resultado.getInt(1));
                    this.setNombre(resultado.getString(2));
                    this.setApellidos(resultado.getString(3));
                    this.setUsuario(resultado.getString(4));
                    this.setPassword(resultado.getString(5));
                    this.setPuesto(resultado.getString(6));
                    this.setNumtienda(resultado.getInt(6));
                    
                    mensaje = "consulta completada";
                    connect.desconectar();
                }else{mensaje = "no se encontraron datos";}
            }catch(SQLException ex){
                mensaje = "error" + ex.getMessage();
            }
        }else{mensaje = "consulta fallida";}
        
        
        return mensaje;
    }
    
    public DefaultTableModel MostrarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Nombre", "Apellidos", "NSS", "F.Nac.", "Direccion", "Sexo", "Salario", "NSSsuper", "No. Depto."};
        modelo.setColumnIdentifiers(columnas);
        CONEXION con = new CONEXION();
        String mensaje = con.Conectar();
        if(con.getConex() != null){
            String sentenciaSQL = "select * from empleado";
            try{
                PreparedStatement ps = con.getConex().prepareStatement(sentenciaSQL);
                ResultSet resultado = ps.executeQuery();
                while(resultado.next()){
                    Object[] fila = new Object[9];
                    fila[0] = resultado.getString(1);
                    fila[1] = resultado.getString(2);
                    fila[2] = resultado.getInt(3);
                    fila[3] = resultado.getString(4);
                    fila[4] = resultado.getString(5);
                    fila[5] = resultado.getString(6);
                    fila[6] = resultado.getDouble(7);
                    fila[7] = resultado.getInt(8);
                    fila[8] = resultado.getInt(9);
                    modelo.addRow(fila);
                }
                con.desconectar();
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        
        }
        
        return modelo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}//class
