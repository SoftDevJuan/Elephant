
package Logica;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Movimientos {
    //try{
    private String locOrigen, locDestino, sucursal, update, insertar, categoria, marca, descripcion, select, suctabla, mensajeEx;
    private int nomina, ntienda, nticket, max, cantidadSolicitada, cantidadOrigen, cantidadDestino, nuevaCant, idProducto;
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getLocOrigen() {
        return locOrigen;
    }

    public void setLocOrigen(String Locorigen) {
        this.locOrigen = Locorigen;
    }

    public String getLocDestino() {
        return locDestino;
    }

    public void setLocDestino(String Locdestino) {
        this.locDestino = Locdestino;
    }



    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public int getNticket() {
        return nticket;
    }

    public void setNticket(int nticket) {
        this.nticket = nticket;
    }

    public int getCantidadOrigen() {
        return cantidadOrigen;
    }

    public void setCantidadOrigen(int cantidad) {
        this.cantidadOrigen = cantidad;
    }
    
     public int getCantidadDestino() {
        return cantidadDestino;
    }

    public void setCantidadDestino(int cantidad) {
        this.cantidadDestino = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getNuevaCant() {
        return nuevaCant;
    }

    public void setNuevaCant(int nuevaCant) {
        this.nuevaCant = nuevaCant;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getNtienda() {
        return ntienda;
    }

    public void setNtienda(int ntienda) {
        this.ntienda = ntienda;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getInsertar() {
        return insertar;
    }

    public void setInsertar(String insertar) {
        this.insertar = insertar;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getSuctabla() {
        return suctabla;
    }

    public void setSuctabla(String suctabla) {
        this.suctabla = suctabla;
    }

    public String getMensajeEx() {
        return mensajeEx;
    }

    public void setMensajeEx(String mensajeEx) {
        this.mensajeEx = mensajeEx;
    }
    
    
    
    
    
    
    
    
    
    
                            //Metodos condicionales
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    public String RevisionSucursal(){
        if(ntienda == 1){
            this.sucursal = "select * from inventariogdl where idProducto=? and localidad=?";
        }else if(ntienda == 2){
            this.sucursal = "select * from inventariozap where idProducto=? and localidad=?";
        }else if(ntienda == 3){
            this.sucursal = "select * from inventariotlaq where idProducto=? and localidad=?";
        }else{}
        
        return sucursal;
    }
    
    public String SentenciaUpdate(){
        if(ntienda == 1){
            this.update = "update inventariogdl set cantidad=? where idProducto=? and localidad=?";
        }else if(ntienda == 2){
            this.update = "update inventariozap set cantidad=? where idProducto=? and localidad=?";
        }else if(ntienda == 3){
            this.update = "update inventariotlaq set cantidad=? where idProducto=? and localidad=?";
        }else{}
        
        return update;
    
    }
    
    public String SentenciaInsert(){
        if(ntienda == 1){
            this.insertar = "insert into inventariogdl values(?,?,?,?)";
        }else if(ntienda == 2){
            this.insertar = "insert into inventariozap values(?,?,?,?)";
        }else if(ntienda == 3){
            this.insertar = "insert into inventariotlaq values(?,?,?,?)";
        }else{}
        
        return insertar;
        
    }
    
    public String SentenciaDelete(){
        if(ntienda == 1){
            this.insertar = "delete from inventariogdl where cantidad=0";
        }else if(ntienda == 2){
            this.insertar = "delete from inventariozap where cantidad=0";
        }else if(ntienda == 3){
            this.insertar = "delete from inventariotlaq where cantidad=0";
        }else{}
        
        return insertar;
    }
    
    public String SentenciaSelect(){
        if(ntienda == 1){
            this.select = "select * from invenrariogdl where idProducto=?";
        }else if(ntienda == 2){
            this.select = "select * from invenrariozap where idProducto=?";
        }else if(ntienda == 3){
            this.select = "select * from invenrariotlaq where idProducto=?";
        }else{}
        
        return select;
    
    }
    
    
    public int RevisionCantidad(){
        if(cantidadOrigen >= cantidadSolicitada){
            nuevaCant = cantidadOrigen - cantidadSolicitada;
        }else{
            nuevaCant = 0;
        }
        return nuevaCant;
    }
   
    
 
    
    
    
    
    
    
    
    
    
    
                                //Metodos de ejecucion en SQL
    
    
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    
    public String HacerUpdate(){
        String mensaje = "Hacer Update";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
            if(connect.getConex() != null){
                try{
                    PreparedStatement ps = connect.getConex().prepareStatement(SentenciaUpdate());
                    ps.setInt(1,getCantidadSolicitada() + getCantidadDestino());
                    ps.setInt(2,getIdProducto());
                    ps.setString(3,getLocDestino());
                    
                    int nfila = ps.executeUpdate();
                    connect.desconectar();
                    mensaje = "updated";
                }catch(SQLException ex){
                    mensaje = "error en el update " + ex.getMessage();
                }
            }else{mensaje = "fallo al conectar con la DB " ;}
            
        
    
        return mensaje;
    }
    
    
    
    
    public String HacerInsert(){
        String mensaje = "hacer Insert";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        if(connect.getConex() != null){
                   try{
                    PreparedStatement ps3 = connect.getConex().prepareStatement(SentenciaInsert());
                    ps3.setInt(1,getIdProducto());
                    ps3.setInt(2,getCantidadSolicitada());
                    ps3.setString(3,getLocDestino());
                    ps3.setInt(4,getNtienda());
                    int nfila = ps3.executeUpdate();
                    connect.desconectar();
                    mensaje = "nuevo insert completado!";
                }catch(SQLException ex){
                    mensaje = "Error en el insert " + ex.getMessage();
                }
            }else{mensaje = "error al contectar con la db en insert";}
                
        
        
        return mensaje;
    
    
    }
    
    
    
    
    
    public String HacerDelete(){
        String mensaje = "Hacer Delete";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        if(connect.getConex() != null){
                try{
                    PreparedStatement ps3 = connect.getConex().prepareStatement(SentenciaDelete());
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
                    PreparedStatement ps2 = connect.getConex().prepareStatement(SentenciaUpdate());
                    ps2.setInt(1,RevisionCantidad());
                    ps2.setInt(2,getIdProducto());
                    ps2.setString(3,getLocOrigen());
                    
                    
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
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                                   //Metodos de validacion SQL
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    public String ValidarOrigen(){
        
        String mensaje = "";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        
        if(connect.getConex() != null){
            try{
                
                PreparedStatement ps = connect.getConex().prepareStatement(RevisionSucursal());
                ps.setInt(1,getIdProducto());
                ps.setString(2,getLocOrigen());
                
                ResultSet resultado = ps.executeQuery();
                if(resultado.first()){
                    setCantidadOrigen(resultado.getInt("cantidad"));
                    
                    mensaje = "consulta completada";
                    connect.desconectar();
                }else{mensaje = "No hay inventario disponible en esta localidad!";}
            }catch(SQLException ex){
                mensaje = "error" + ex.getMessage();
            }
        }else{mensaje = "consulta fallida en la validacion de origen";}
        
        
        return mensaje;
    
    }
    
   
    
    
    
    
    public String ValidarDestino(){
        String mensaje = "";
        CONEXION connect = new CONEXION();
        mensaje = connect.Conectar();
        
        if(connect.getConex() != null){
            try{
                PreparedStatement ps = connect.getConex().prepareStatement(RevisionSucursal());
                ps.setInt(1,getIdProducto());
                ps.setString(2,getLocDestino());
                
                ResultSet resultado = ps.executeQuery();
                if(resultado.first()){
                    setCantidadDestino(resultado.getInt("cantidad"));
                   
                    mensaje = "consulta completada";
                    connect.desconectar();
                }else{mensaje = "no inventory";}
            }catch(SQLException ex){
            mensaje = "Error " + ex.getMessage();
            }
        }else{mensaje = "consulta fallida" + " " + connect.Conectar();}
        
        
        return mensaje;
     
 
    }
    
    
 
    
    
    
    
    
    
    
    
    

    
                       //metodos del JFrame
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public String Transferir(){
        String mensaje = "";
        try{
        ValidarOrigen();
        RevisionCantidad();
        if(ValidarOrigen().equals("consulta completada")){
            if(ValidarDestino().equals("consulta completada")){
                mensaje = HacerUpdate();
                HacerDelete();
                HacerDelta();
            }else{
                mensaje = HacerInsert();
                HacerDelete();
                HacerDelta();
            }
        }else{mensaje = ValidarOrigen();}
        }catch(Exception e){
            mensaje = "ERROR alguno de los datos es incorrecto " + e.getMessage();
        }
        return mensaje;
    }
    
    
    
  
    
    
    
    
    
    
     /*public DefaultTableModel MostrarDatos(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID", "Categoria", "Cantidad", "Localidad", "Sucursal"};
        modelo.setColumnIdentifiers(columnas);
        Conexion con = new Conexion();
        String mensaje = con.conectar();
        if(con.getConex() != null){
                      try{
                PreparedStatement ps = con.getConex().prepareStatement(SentenciaSelect());
                ps.setInt(1,idProducto);
                ResultSet resultado = ps.executeQuery();
                while(resultado.next()){
                    Object[] fila = new Object[4];
                    fila[0] = resultado.getInt("idProdcuto");
                    fila[1] = resultado.getString("cantidad");
                    fila[2] = resultado.getString("localidad");
                    fila[3] = this.suctabla;
                    modelo.addRow(fila);
                }
                con.desconectar();
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        }
        return modelo;
    }*/
    
    public DefaultTableModel MostrarDatos(){
        DefaultTableModel newrow = new DefaultTableModel();
        CONEXION con = new CONEXION();
        
        String[] columnas = {"ID", "Cantidad", "Localidad", "Sucursal"};
        newrow.setColumnIdentifiers(columnas);
        String mensaje = con.Conectar();
        if(con.getConex() != null){
            //String sentenciaSQL = "select * from empleado";
            try{
                PreparedStatement ps = con.getConex().prepareStatement(SentenciaSelect()); //SentenciaSelect()"select * from inventariogdl"
                ResultSet resultado = ps.executeQuery();
                
                while(resultado.next()){
                    Object[] fila = new Object[4];
                    System.out.println(fila[0] = resultado.getObject(1));
                    System.out.println(fila[1] = resultado.getObject(2));
                    System.out.println(fila[2] = resultado.getObject(3));
                    System.out.println(fila[3] = resultado.getObject(4));
                    
                    
                    
                    newrow.addRow(fila);
                    con.desconectar();
                }
                
            }catch(SQLException ex){
                mensaje = "error SQL" + ex.getMessage();
            }
        
        }
        
        return newrow;
    }
    
    
    
    
    
    
    
    
    
    
   

    
}//class
