
package Logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;



public class Aprobaciones {
   private String fecha, hora, proecedencia, destino, status, localidadOrgien,localidadDestino;
   private int nticket, id, cantidad, nsentencia, nomina, cantidadOrigen, nuevaCant, nTienda;

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
   
    
    
    
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    
   public String Sentencia(){
       String mensaje = "";
       if(getNsentencia() == 1){
           mensaje = "select * from movimientos where nticket=?";
       }else if(getNsentencia() == 2){
           mensaje = "select * from movimientos where status=?";
       }else{}
       
       return mensaje;
   }
    
   
   
   
   
   public String DatoSQL(){
       String mensaje = "";
       if(getNsentencia() == 1){
           mensaje = String.valueOf(getNticket());
       }else{mensaje = getStatus();}
       return mensaje;
   }
   
   
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
   
    
    public String ConsultarNticket(){
      String mensaje = "no opera nada";
        CONEXION con = new CONEXION();
        mensaje = con.Conectar();
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
    
    
    }
    
    
    
    
    
    public DefaultTableModel MostrarDatos(){
        DefaultTableModel newrow = new DefaultTableModel();
        CONEXION con = new CONEXION();
        
        
        String[] columnas = {"Folio", "ID Producto", "Fecha", "Hora", "Origen", "Destino","Status", "Requisitor", "Cantidad Solicitada","Localidad Origen", "Localidad Destino"};
        newrow.setColumnIdentifiers(columnas);
        String mensaje = con.Conectar();
        if(con.getConex() != null){
            //String sentenciaSQL = "select * from empleado";
            try{
                PreparedStatement ps = con.getConex().prepareStatement(Sentencia()); //SentenciaSelect()"select * from inventariogdl"
                ps.setString(1,DatoSQL());
                ResultSet resultado = ps.executeQuery();
                
                while(resultado.next()){
                    Object[] fila = new Object[11];
                    fila[0] = resultado.getObject(1);
                    fila[1] = resultado.getObject(2);
                    fila[2] = resultado.getObject(3);
                    fila[3] = resultado.getObject(4);
                    fila[4] = resultado.getObject(5);
                    fila[5] = resultado.getObject(6);
                    fila[6] = resultado.getObject(7);
                    fila[7] = resultado.getObject(8);
                    fila[8] = resultado.getObject(9);
                    fila[9] = resultado.getObject(10);
                    fila[10] = resultado.getObject(11);
                    
                    
                    
                    newrow.addRow(fila);
                    
                }
                con.desconectar();
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        
        }
        
        return newrow;
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//class
