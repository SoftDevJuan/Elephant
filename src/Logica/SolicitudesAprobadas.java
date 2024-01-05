
package Logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SolicitudesAprobadas {
    private String  proecedencia, destino, status, localidadOrgien,localidadDestino, statusNuevo;
   private int nticket, id, cantidadSolicitada, nsentencia, nomina, cantidadOrigen, nuevaCant, nTienda;

  

    public String getProecedencia() {
        return proecedencia;
    }

    public void setProecedencia(String proecedencia) {
        this.proecedencia = proecedencia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNticket() {
        return nticket;
    }

    public void setNticket(int nticket) {
        this.nticket = nticket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidad) {
        this.cantidadSolicitada = cantidad;
    }

    public String getLocalidadOrgien() {
        return localidadOrgien;
    }

    public void setLocalidadOrgien(String localidadOrgien) {
        this.localidadOrgien = localidadOrgien;
    }

    public String getLocalidadDestino() {
        return localidadDestino;
    }

    public void setLocalidadDestino(String localidadDestino) {
        this.localidadDestino = localidadDestino;
    }

    public int getNsentencia() {
        return nsentencia;
    }

    public void setNsentencia(int nsentencia) {
        this.nsentencia = nsentencia;
    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public int getCantidadOrigen() {
        return cantidadOrigen;
    }

    public void setCantidadOrigen(int cantidadOrigen) {
        this.cantidadOrigen = cantidadOrigen;
    }

    public int getNuevaCant() {
        return nuevaCant;
    }

    public void setNuevaCant(int nuevaCant) {
        this.nuevaCant = nuevaCant;
    }

    public int getnTienda() {
        return nTienda;
    }

    public void setnTienda(int nTienda) {
        this.nTienda = nTienda;
    }
    
    
    public int ValidarNtienda(){
        if(getDestino().equals("Guadalajara")){
            nTienda = 1;
        }else if(getDestino().equals("Zapopan")){
            nTienda = 2;
        }else if(getDestino().equals("Tlaquepaque")){
            nTienda = 3;
        }else{}
        return nTienda;
    }
    
    
    public int RevisionCantidad(){
        if(cantidadOrigen >= cantidadSolicitada){
            nuevaCant = cantidadOrigen - cantidadSolicitada;
        }else{
            nuevaCant = 0;
        }
        return nuevaCant;
    }

    public String getStatusNuevo() {
        return statusNuevo;
    }

    public void setStatusNuevo(String statusNuevo) {
        this.statusNuevo = statusNuevo;
    }
    
    
    
    
    
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public String HacerDelete(){
        String mensaje = "Hacer Delete";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        if(connect.getConex() != null){
                try{
                    PreparedStatement ps3 = connect.getConex().prepareStatement("delete from inventario where cantidad=0");
                    ps3.executeUpdate();
                    
                    connect.desconectar();
                    
                }catch(SQLException ex){
                    mensaje = "Error en el insert " + ex.getMessage();
                }
            }else{mensaje = "error al contectar con la db en insert";}
               
        return mensaje;
    }
    
    
    
    public String HacerDelta(){
        String mensaje = "Transfer sin accion";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
            if(connect.getConex() != null){
                try{
                    PreparedStatement ps2 = connect.getConex().prepareStatement("update inventario set cantidad=? where sucursal=? and localidad=?");
                    ps2.setInt(1,RevisionCantidad());
                    ps2.setString(2,getProecedencia());
                    ps2.setString(3,getLocalidadOrgien());
                   
                    
                    
                    int nfila2 = ps2.executeUpdate();
                    HacerDelete();
                    connect.desconectar();
          
                    mensaje = "updated";
                    
                }catch(SQLException ex){
                    mensaje = "error en el update transfer" + ex.getMessage();
                }
            }else{mensaje = "fallo al conectar con la DB " ;}
        
        return mensaje;
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    /*public String ConsultarNticket(){
      String mensaje = "no opera nada";
        Conexion con = new Conexion();
        mensaje = con.conectar();
        if(con.getConex() != null){
            
            try{
                PreparedStatement ps4 = con.getConex().prepareStatement("select * from movimientos where nticket=? order by (nticket) limit 1"); //hay que cambuar la sentencia para que arroje el ultimo ticket
                ps4.setInt(1,getNticket());
                ResultSet resultado = ps4.executeQuery();
                if(resultado.first()){
                   setNticket(resultado.getInt(1));
                   setId(resultado.getInt(2));
                   setFecha(resultado.getString(3));
                   setHora(resultado.getString(4));
                   setProecedencia(resultado.getString(5));
                   setDestino(resultado.getString(6));
                   setStatus(resultado.getString(7));
                   setNomina(resultado.getInt(8));
                   setCantidad(resultado.getInt(9));
                   setLocalidadOrgien(resultado.getString(10));
                   setLocalidadDestino(resultado.getString(11));
                }
                con.desconectar();
                mensaje = "ultimo ticket consultado";
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        
        }
        
        return mensaje;
    
    
    }*/
    
    
    
   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    //esta cambia la tabla movimientos
    
    public String CambiarStatus(){
        
        String mensaje = "Hacer Update";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        
            if(connect.getConex() != null){
                try{
                    PreparedStatement ps = connect.getConex().prepareStatement("update movimientos set status=? where nticket=?");
                    ps.setString(1,getStatusNuevo());
                    ps.setInt(2,getNticket());
                    
                    
                    int nfila = ps.executeUpdate();
                    connect.desconectar();
                    HacerDelete();
                    //HacerDelta();
                    mensaje = "Se cambio Status" + HacerDelta();;
                }catch(SQLException ex){
                    mensaje = "error en el update " + ex.getMessage();
                }
            }else{mensaje = "fallo al conectar con la DB " ;}
        
        
        
        return mensaje;
    }
    
    
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //este cambia la tabla inventario
    
    
    
    public String ConsultarInventario(){
      String mensaje = "no opera nada";
        CONEXION con = new CONEXION();
        mensaje = con.Conectar();
        if(con.getConex() != null){
            
            try{
                PreparedStatement ps4 = con.getConex().prepareStatement("select * from inventario where idProducto=? and sucursal=? and localidad=?"); //hay que cambuar la sentencia para que arroje el ultimo ticket
                System.out.println(getId());
                System.out.println(getProecedencia());
                System.out.println(getLocalidadOrgien());
                ps4.setInt(1,getId());
                ps4.setString(2,getProecedencia());
                ps4.setString(3,getLocalidadOrgien());
                
                
                ResultSet resultado = ps4.executeQuery();
                if(resultado.first()){
                   setId(resultado.getInt(1));
                   setCantidadOrigen(resultado.getInt(2));
                   setLocalidadOrgien(resultado.getString(3));
                   setnTienda(resultado.getInt(4));
                   setProecedencia(resultado.getString(5));
                    
                }
                System.out.println(getId());
                    System.out.println(getCantidadOrigen());
                    System.out.println(getLocalidadOrgien());
                    System.out.println(getnTienda());
                    System.out.println(getProecedencia());
                con.desconectar();
                mensaje = "se consulto el ticket " + getNticket();
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        
        }
        
        return mensaje;
    
    
    }
    
    
    
    
    
    public String InsertarInventario(){
        //ConsultarInventario();
        String mensaje = "hacer Insert";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        if(cantidadOrigen < cantidadSolicitada){
            mensaje = "Cantidad solicitada " + getCantidadSolicitada() + " excede la cantidad disponible " +  getCantidadOrigen();
            connect.desconectar();
        }else{
            if(connect.getConex() != null){
                   try{
                    PreparedStatement ps3 = connect.getConex().prepareStatement("insert into inventario values(?,?,?,?,?)");
                    ps3.setInt(1,getId());
                    ps3.setInt(2,(getCantidadOrigen() - RevisionCantidad()));
                    ps3.setString(3,getLocalidadDestino());
                    ps3.setInt(4,ValidarNtienda());
                    ps3.setString(5, getDestino());
                    int nfila = ps3.executeUpdate();
                    connect.desconectar();
                    HacerDelete();
                    HacerDelta();
                    mensaje = "nuevo insert completado!";
                }catch(SQLException ex){
                    mensaje = "Error en el insert " + ex.getMessage();
                }
            }else{mensaje = "error al contectar con la db en insert";}
        }
        return mensaje +  getCantidadOrigen() + getLocalidadOrgien() + getnTienda() + getProecedencia();
    
    }
    
    
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//class
