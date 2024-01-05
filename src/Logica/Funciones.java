/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author daard
 */
public class Funciones {
    private String id,idproducto,categoria,marca,descripcion,cantidad,max,localidad,nmtienda,sucursal;

    public void setId(String id) {
        this.id = id;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setNmtienda(String nmtienda) {
        this.nmtienda = nmtienda;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }
    

    public String getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getMax() {
        return max;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getNmtienda() {
        return nmtienda;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getIdproducto() {
        return idproducto;
    }
    

    
    
    public String Registrar(){
        String Mensaje="";
        CONEXION conexion=new CONEXION();
        Mensaje= conexion.Conectar();
        if(conexion.getConex()!=null){
            try{
            String sentenciaSQL="insert into producto values (?,?,?,?,?)";
            PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
            ps.setString(1, id);
            ps.setString(2, categoria);
            ps.setString(3, marca);
            ps.setString(4, descripcion);
            ps.setString(5, max);            
            int nFila=ps.executeUpdate();
            Mensaje="Registro exitoso";
            
            conexion.desconectar();
            }catch(SQLException ex){
                Mensaje="Error al intentar registrar "+ex.getMessage();
            }
        }else{
            Mensaje="Error no se pudo conectar";
        }
        return Mensaje;
    }
    public String Eliminar(){
        String Mensaje="";
        CONEXION conexion=new CONEXION();
        Mensaje= conexion.Conectar();
        if(conexion.getConex()!=null){
            try{
            String sentenciaSQL="delete from producto where id=?";
            PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
            ps.setString(1, id);           
            int nFila=ps.executeUpdate();
            Mensaje="Se eliminaron xitosamente los datos";
            
            conexion.desconectar();
            }catch(SQLException ex){
                Mensaje="Error al eliminar "+ex.getMessage();
            }
        }else{
            Mensaje="Error no se pudo conectar";
        }
        return Mensaje;
    }



    public DefaultTableModel Consultar(){
        DefaultTableModel datosUsu=new DefaultTableModel();
        String[] columnas={"Id Articulo","Categoria","Marca","Descripcion","Capacidad","Cantidad","Localidad","N°.Tienda","Sucursal"};
        datosUsu.setColumnIdentifiers(columnas);
        CONEXION conexion=new CONEXION();
        String Mensaje=conexion.Conectar();
        if (conexion.getConex()!=null){
            String sentenciaSQL="select p.*, i.cantidad, i.localidad, i.nmtienda, i.sucursal from producto p join inventario i on i.idProducto=p.id";
            try {
                PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
                ResultSet resultado=ps.executeQuery();                
                while(resultado.next()){
                    Object[] fila= new Object[9];
                    fila[0]=resultado.getString("id");
                    fila[1]=resultado.getString("categoria");
                    fila[2]=resultado.getString("marca");
                    fila[3]=resultado.getString("descripcion");
                    fila[4]=resultado.getString("max");
                    fila[5]=resultado.getString("cantidad");
                    fila[6]=resultado.getString("localidad");
                    fila[7]=resultado.getString("nmtienda");
                    fila[8]=resultado.getString("sucursal");                    
                    datosUsu.addRow(fila);
                }
                conexion.desconectar();
            } catch (SQLException ex) {
                Mensaje="Error al consultar los usuarios";
                System.out.println("Error "+ex.getMessage());
            }
            
        }
        
        return datosUsu;
    }





    public DefaultTableModel ConsultarPr(){
        DefaultTableModel datosUsu=new DefaultTableModel();
        String[] columnas={"Id Articulo","Categoria","Marca","Descripcion","Capacidad"};
        datosUsu.setColumnIdentifiers(columnas);
        CONEXION conexion=new CONEXION();
        String Mensaje=conexion.Conectar();
        if (conexion.getConex()!=null){
            String sentenciaSQL="select * from producto";
            try {
                PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
                ResultSet resultado=ps.executeQuery();                
                while(resultado.next()){
                    Object[] fila= new Object[5];
                    fila[0]=resultado.getString("id");
                    fila[1]=resultado.getString("categoria");
                    fila[2]=resultado.getString("marca");
                    fila[3]=resultado.getString("descripcion");
                    fila[4]=resultado.getString("max");                   
                    datosUsu.addRow(fila);
                }
                conexion.desconectar();
            } catch (SQLException ex) {
                Mensaje="Error al consultar los usuarios";
                System.out.println("Error "+ex.getMessage());
            }
            
        }
        
        return datosUsu;
    }




    public DefaultTableModel ConsultarId(){
        DefaultTableModel datosUsu=new DefaultTableModel();
        String[] columnas={"Id Articulo","Categoria","Marca","Descripcion","Capacidad","Cantidad","Localidad","N°.Tienda","Sucursal"};
        datosUsu.setColumnIdentifiers(columnas);
        CONEXION conexion=new CONEXION();
        String Mensaje=conexion.Conectar();
        if (conexion.getConex()!=null){
            String sentenciaSQL="select p.*, i.cantidad, i.localidad, i.nmtienda, i.sucursal from producto p join inventario i on i.idProducto=p.id where id=?";
            try {
                PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
                ps.setString(1,id);
                ResultSet resultado=ps.executeQuery();                
                while(resultado.next()){
                    Object[] fila= new Object[9];
                    fila[0]=resultado.getString("id");
                    fila[1]=resultado.getString("categoria");
                    fila[2]=resultado.getString("marca");
                    fila[3]=resultado.getString("descripcion");
                    fila[4]=resultado.getString("max");
                    fila[5]=resultado.getString("cantidad");
                    fila[6]=resultado.getString("localidad");
                    fila[7]=resultado.getString("nmtienda");
                    fila[8]=resultado.getString("sucursal");                    
                    datosUsu.addRow(fila);
                }
                conexion.desconectar();
            } catch (SQLException ex) {
                Mensaje="No existe informacion del producto";
                System.out.println("Error "+ex.getMessage());
            }
            
        }
        
        return datosUsu;
    }




    public DefaultTableModel ConsultarCat(){
        DefaultTableModel datosUsu=new DefaultTableModel();
        String[] columnas={"Id Articulo","Categoria","Marca","Descripcion","Capacidad","Cantidad","Localidad","N°.Tienda","Sucursal"};
        datosUsu.setColumnIdentifiers(columnas);
        CONEXION conexion=new CONEXION();
        String Mensaje=conexion.Conectar();
        if (conexion.getConex()!=null){
            String sentenciaSQL="select p.*, i.cantidad, i.localidad, i.nmtienda, i.sucursal from producto p join inventario i on i.idProducto=p.id where categoria=?";
            try {
                PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
                ps.setString(1,categoria);
                ResultSet resultado=ps.executeQuery();                
                while(resultado.next()){
                    Object[] fila= new Object[9];
                    fila[0]=resultado.getString("id");
                    fila[1]=resultado.getString("categoria");
                    fila[2]=resultado.getString("marca");
                    fila[3]=resultado.getString("descripcion");
                    fila[4]=resultado.getString("max");
                    fila[5]=resultado.getString("cantidad");
                    fila[6]=resultado.getString("localidad");
                    fila[7]=resultado.getString("nmtienda");
                    fila[8]=resultado.getString("sucursal");                    
                    datosUsu.addRow(fila);
                }
                conexion.desconectar();
            } catch (SQLException ex) {
                Mensaje="No existe informacion del producto";
                System.out.println("Error "+ex.getMessage());
            }
            
        }
        
        return datosUsu;
    }




    public DefaultTableModel ConsultarTienda(){
        DefaultTableModel datosUsu=new DefaultTableModel();
        String[] columnas={"Id Articulo","Categoria","Marca","Descripcion","Capacidad","Cantidad","Localidad","N°.Tienda","Sucursal"};
        datosUsu.setColumnIdentifiers(columnas);
        CONEXION conexion=new CONEXION();
        String Mensaje=conexion.Conectar();
        if (conexion.getConex()!=null){
            String sentenciaSQL="select p.*, i.cantidad, i.localidad, i.nmtienda, i.sucursal from producto p join inventario i on i.idProducto=p.id where nmtienda=?";
            try {
                PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
                ps.setString(1,nmtienda);
                ResultSet resultado=ps.executeQuery();                
                while(resultado.next()){
                    Object[] fila= new Object[9];
                    fila[0]=resultado.getString("id");
                    fila[1]=resultado.getString("categoria");
                    fila[2]=resultado.getString("marca");
                    fila[3]=resultado.getString("descripcion");
                    fila[4]=resultado.getString("max");
                    fila[5]=resultado.getString("cantidad");
                    fila[6]=resultado.getString("localidad");
                    fila[7]=resultado.getString("nmtienda");
                    fila[8]=resultado.getString("sucursal");                    
                    datosUsu.addRow(fila);
                }
                conexion.desconectar();
            } catch (SQLException ex) {
                Mensaje="No existe informacion del producto";
                System.out.println("Error "+ex.getMessage());
            }
            
        }
        
        return datosUsu;
    }




    public DefaultTableModel ConsultarTienda_Cat(){
        DefaultTableModel datosUsu=new DefaultTableModel();
        String[] columnas={"Id Articulo","Categoria","Marca","Descripcion","Capacidad","Cantidad","Localidad","N°.Tienda","Sucursal"};
        datosUsu.setColumnIdentifiers(columnas);
        CONEXION conexion=new CONEXION();
        String Mensaje=conexion.Conectar();
        if (conexion.getConex()!=null){
            String sentenciaSQL="select p.*, i.cantidad, i.localidad, i.nmtienda, i.sucursal from producto p join inventario i on i.idProducto=p.id where nmtienda =? and categoria=?";
            try {
                PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
                ps.setString(1,nmtienda);
                ps.setString(2,categoria);
                ResultSet resultado=ps.executeQuery();                
                while(resultado.next()){
                    Object[] fila= new Object[9];
                    fila[0]=resultado.getString("id");
                    fila[1]=resultado.getString("categoria");
                    fila[2]=resultado.getString("marca");
                    fila[3]=resultado.getString("descripcion");
                    fila[4]=resultado.getString("max");
                    fila[5]=resultado.getString("cantidad");
                    fila[6]=resultado.getString("localidad");
                    fila[7]=resultado.getString("nmtienda");
                    fila[8]=resultado.getString("sucursal");                    
                    datosUsu.addRow(fila);
                }
                conexion.desconectar();
            } catch (SQLException ex) {
                Mensaje="No existe informacion del producto";
                System.out.println("Error "+ex.getMessage());
            }
            
        }
        
        return datosUsu;
    }




    public DefaultTableModel ConsultarInv(){
        DefaultTableModel datosUsu=new DefaultTableModel();
        String[] columnas={"Id Articulo","Categoria","Marca","Descripcion","Capacidad"};
        datosUsu.setColumnIdentifiers(columnas);
        CONEXION conexion=new CONEXION();
        String Mensaje=conexion.Conectar();
        if (conexion.getConex()!=null){
            String sentenciaSQL="select * from producto";
            try {
                PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
                ResultSet resultado=ps.executeQuery();                
                while(resultado.next()){
                    Object[] fila= new Object[5];
                    fila[0]=resultado.getString("id");
                    fila[1]=resultado.getString("categoria");
                    fila[2]=resultado.getString("marca");
                    fila[3]=resultado.getString("descripcion");
                    fila[4]=resultado.getString("max");                    
                    datosUsu.addRow(fila);
                }
                conexion.desconectar();
            } catch (SQLException ex) {
                Mensaje="Error al consultar los usuarios";
                System.out.println("Error "+ex.getMessage());
            }
            
        }
        
        return datosUsu;
    }

    public String NuevoInventario(){
    String Mensaje="";
        CONEXION conexion=new CONEXION();
        Mensaje= conexion.Conectar();
        if(conexion.getConex()!=null){
            try{
            String sentenciaSQL="insert into inventario values (?,?,?,?,?)";
            PreparedStatement ps=conexion.getConex().prepareStatement(sentenciaSQL);
            ps.setString(1, id);
            ps.setString(2, cantidad);
            ps.setString(3, "CEDIS");
            ps.setInt(4, 4);
            ps.setString(5, "CEDIS");
                       
            int nFila=ps.executeUpdate();
            Mensaje=" nuevo inventario agregado ";
            
            conexion.desconectar();
            }catch(SQLException ex){
                Mensaje="Error al intentar registrar "+ex.getMessage();
            }
        }else{
            Mensaje="Error no se pudo conectar";
        }
        return Mensaje;

}

public String EliminarInventario(){
    String mensaje = "";
    CONEXION con = new CONEXION();
    mensaje = con.Conectar();
    if(con.getConex() != null){
        try{
            PreparedStatement ps = con.getConex().prepareStatement("delete from inventario where idProducto=?");
            ps.setString(1,id);
            
            int nFila = ps.executeUpdate();
            con.desconectar();
            mensaje = "Se elimino de inventario";
        
        }catch(SQLException ex){
            mensaje = "ERROR " + ex.getMessage();
        }
    
    }else{mensaje = "fallo al conectar con la BD";}
    
    
    
    return mensaje;
}





}//class


