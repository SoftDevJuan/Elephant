
package Logica;
import java.sql.*;
import visual.*;

public class Logueo {
    private String usuarioin, passwordin, usuarioout,passwordout, puesto, nombre,apellidos,sucursal;
    private int nomina, ntienda, nlogeo;
    public Logueo(){
    
    }

    public String getUsuarioin() {
        return usuarioin;
    }

    public void setUsuarioin(String usuarioin) {
        this.usuarioin = usuarioin;
    }

    public String getPasswordin() {
        return passwordin;
    }

    public void setPasswordin(String passwordin) {
        this.passwordin = passwordin;
    }

    public String getUsuarioout() {
        return usuarioout;
    }

    public void setUsuarioout(String usuarioout) {
        this.usuarioout = usuarioout;
    }

    public String getPasswordout() {
        return passwordout;
    }

    public void setPasswordout(String passwordout) {
        this.passwordout = passwordout;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public int getNtienda() {
        return ntienda;
    }

    public void setNtienda(int ntienda) {
        this.ntienda = ntienda;
    }

    public int getNlogeo() {
        return nlogeo;
    }

    public void setNlogeo(int nlogeo) {
        this.nlogeo = nlogeo;
    }
    
    
    
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public String ValidarUser(){
        String mensaje = "";
        CONEXION con = new CONEXION();
        mensaje = con.Conectar();
        
        if(con.getConex() != null){
            try{
                PreparedStatement ps = con.getConex().prepareStatement("select * from empleado where usuario=? and contrasena=?");
                ps.setString(1,getUsuarioin());
                ps.setString(2, getPasswordin());
                
                ResultSet resultado = ps.executeQuery();
                if(resultado.first()){
                    setNomina(resultado.getInt(1));
                    setNombre(resultado.getString(2));
                    setApellidos(resultado.getString(3));
                    setUsuarioout(resultado.getString(4));
                    setPasswordout(resultado.getString(5));
                    setPuesto(resultado.getString(6));
                    setNtienda(resultado.getInt(7));
                    
                    if(getUsuarioin().equals(getUsuarioout()) && getPasswordin().equals(getPasswordout())){
                        mensaje = "Perfil: " + getPuesto() + " Welcome!";
                    }else{
                        mensaje = "Credenciales no validas";
                    }
                }else{
                    mensaje = "Datos Invalidos";
                }
                
            }catch(SQLException ex){
                mensaje = "ERROR " + ex.getMessage();
            }
        }else{
            mensaje = "fallo conexion con la DB";
        }
        
        if(getNtienda()==1){
            setSucursal("Guadalajara");
        }else if(getNtienda()==2){
            setSucursal("Zapopan");
        }else if(getNtienda()==3){
            setSucursal("Tlaquepaque");
        }else if(getNtienda()==4){
            setSucursal("CEDIS");
        }else{
            setSucursal("Null");
        }
        return mensaje;
    }
    
    public String RegistrarLogin(){
        String mensaje = "";
        CONEXION con = new CONEXION();
        Perf perfil = new Perf();
        mensaje = con.Conectar();
        
        if(con.getConex() != null){
            try{
                PreparedStatement ps = con.getConex().prepareStatement("insert into registrologin (nomina,nombre,apellido,usuario,contrasena,puesto,numtienda) values(?,?,?,?,?,?,?)");
                ps.setInt(1,getNomina());
                ps.setString(2, getNombre());
                ps.setString(3, getApellidos());
                ps.setString(4, getUsuarioout());
                ps.setString(5, getPasswordout());
                ps.setString(6, getPuesto());
                ps.setInt(7, getNtienda());
                
                int nFila = ps.executeUpdate();
               
                    
               
                
            }catch(SQLException ex){
                mensaje = "ERROR " + ex.getMessage();
            }
        }else{
            mensaje = "fallo conexion con la DB";
        }
        
       
        
        return mensaje;
    }
    
    
    
    
    
    
    public String ValidarLgin(){
        String mensaje = "";
        CONEXION con = new CONEXION();
        Perf perfil = new Perf();
        mensaje = con.Conectar();
        
        if(con.getConex() != null){
            try{
                PreparedStatement ps = con.getConex().prepareStatement("select * from registrologin order by conteo desc limit 1");
                
                ResultSet resultado = ps.executeQuery();
                if(resultado.first()){
                    setNlogeo(resultado.getInt(1));
                    setNomina(resultado.getInt(2));
                    setNombre(resultado.getString(3));
                    setApellidos(resultado.getString(4));
                    setUsuarioout(resultado.getString(5));
                    setPasswordout(resultado.getString(6));
                    setPuesto(resultado.getString(7));
                    setNtienda(resultado.getInt(8));
                    
                    
                        mensaje = "Perfil: " + getPuesto();
                    
                    
                }else{
                    mensaje = "Datos Invalidos";
                }
                
            }catch(SQLException ex){
                mensaje = "ERROR " + ex.getMessage();
            }
        }else{
            mensaje = "fallo conexion con la DB";
        }
        
        if(getNtienda()==1){
            setSucursal("Guadalajara");
        }else if(getNtienda()==2){
            setSucursal("Zapopan");
        }else if(getNtienda()==3){
            setSucursal("Tlaquepaque");
        }else if(getNtienda()==4){
            setSucursal("CEDIS");
        }else{
            setSucursal("Null");
        }
        return mensaje;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//class
