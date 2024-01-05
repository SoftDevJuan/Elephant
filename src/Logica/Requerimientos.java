
package Logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Requerimientos {
    private String nombres,apellidos, sucursalOrigen, sucursalDestino, locDestino,locOrigen,gerente,status,fecha,hora;
    private int nomina, idProducto, cantidad,ticket, ultimoTicket;
    
    
    public Requerimientos(){
    
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSucursalOrigen() {
        return sucursalOrigen;
    }

    public void setSucursalOrigen(String sucursalOrigen) {
        this.sucursalOrigen = sucursalOrigen;
    }

    public String getSucursalDestino() {
        return sucursalDestino;
    }

    public void setSucursalDestino(String sucursalDestino) {
        this.sucursalDestino = sucursalDestino;
    }

    public String getLocDestino() {
        return locDestino;
    }

    public void setLocDestino(String locDestino) {
        this.locDestino = locDestino;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getUltimoTicket() {
        return ultimoTicket;
    }

    public void setUltimoTicket(int ultimoTicket) {
        this.ultimoTicket = ultimoTicket;
    }

    public String getLocOrigen() {
        return locOrigen;
    }

    public void setLocOrigen(String locOrigen) {
        this.locOrigen = locOrigen;
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public String GenerarPedido(){
        String mensaje="";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        if(connect.getConex() != null){
            try{
                PreparedStatement ps3 = connect.getConex().prepareStatement("insert into movimientos (id_art,fecha,hora,origen,destino,status,n_empleado,cantidad_T,locorigen,locdestino) values(?,?,?,?,?,?,?,?,?,?)");
                
                ps3.setInt(1,getIdProducto());
                ps3.setString(2,getFecha());
                ps3.setString(3,getHora());
                ps3.setString(4,getSucursalOrigen());
                ps3.setString(5, getSucursalDestino());
                ps3.setString(6, getStatus());
                ps3.setInt(7,getNomina());
                ps3.setInt(8, getCantidad());
                ps3.setString(9, getLocOrigen());
                ps3.setString(10, getLocDestino());
                
                int nfila = ps3.executeUpdate();
                connect.desconectar();
                
                mensaje = "Ticket Generado con extido !";
                }catch(SQLException ex){
                    mensaje = "Error en el insert " + ex.getMessage();
                }
        }else{mensaje = "error al contectar con la db en insert";}
        
        
        return mensaje;
    }
    
    public String ConsultarNumeroTicket(){
        String mensaje = "";
        CONEXION con = new CONEXION();
        if(con.getConex() != null){
            
            try{
                PreparedStatement ps4 = con.getConex().prepareStatement("select * from movimientos where nticket=? order by (nticket) limit 1"); //hay que cambuar la sentencia para que arroje el ultimo ticket
                
                ResultSet resultado = ps4.executeQuery();
                if(resultado.first()){
                    
                    setIdProducto(resultado.getInt(1));
                    setFecha(resultado.getString(2));
                    setHora(resultado.getString(3));
                    setSucursalOrigen(resultado.getString(4));
                    setSucursalDestino(resultado.getString(5));
                    setStatus(resultado.getString(6));
                    setNomina(resultado.getInt(7));
                    setCantidad(resultado.getInt(8));
                    setLocOrigen(resultado.getString(9));
                    setLocDestino(resultado.getString(10));
                }
                con.desconectar();
                mensaje = "ultimo ticket consultado";
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        
        }
        
        return mensaje;
    }
    
    
    public String TicketNuevo(){
        String mensaje = "";
        CONEXION con = new CONEXION();
        mensaje = con.Conectar();
        if(con.getConex() != null){
            try{
                PreparedStatement ps4 = con.getConex().prepareStatement("select * from movimientos order by (nticket) desc limit 1"); //hay que cambuar la sentencia para que arroje el ultimo ticket
                ResultSet resultado = ps4.executeQuery();
                if(resultado.next()){
                    setTicket(resultado.getInt(1));
                    setIdProducto(resultado.getInt(2));
                    setFecha(resultado.getString(3));
                    setHora(resultado.getString(4));
                    setSucursalOrigen(resultado.getString(5));
                    setSucursalDestino(resultado.getString(6));
                    setStatus(resultado.getString(7));
                    setNomina(resultado.getInt(8));
                    setCantidad(resultado.getInt(9));
                    setLocOrigen(resultado.getString(10));
                    setLocDestino(resultado.getString(11));
                    mensaje = "nuevo ticket consultado";
                    con.desconectar();
                    
                }else{mensaje = "fallo consulta";}
                
                
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        
        }else{mensaje = "Error al conectar con la BD";}
        
        return mensaje;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//class
