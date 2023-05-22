/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedro.dao;
import com.pedro.config.Conexion;
import com.pedro.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Fabian
 */
public class CursoDAOImpl implements CursoDAO{
    private Conexion objConexion;
    private Connection objConnection;
    
    public CursoDAOImpl(){
    objConexion = new Conexion();
    }
    
    @Override
    public List<Curso> findAll(){
        String consulta = "SELECT * FROM cursos";
        List<Curso> listado = new LinkedList<>();

        try {
            this.objConexion.conectar();
            this.objConnection = this.objConexion.getJdbcConnection();

            PreparedStatement prest = this.objConnection.prepareStatement(consulta);
            // Ejecuta la consulta
            ResultSet rs = prest.executeQuery(consulta);

            Curso objCurso;
            
            while (rs.next()) {
                objCurso = new Curso();
                objCurso.setId(rs.getInt("id"));
                objCurso.setNombre(rs.getString("nombre"));
                objCurso.setTurno(rs.getString("turno"));
                objCurso.setCupos(rs.getString("cupos"));
                objCurso.setCosto(rs.getString("costo"));
                
                listado.add(objCurso);
            }
    } catch (Exception e) {
            System.out.println("Error en la consulta" + e);
        }
        return listado;
    }
    @Override
    public Curso insert(Curso objCurso){
        String consulta = "INSERT INTO cursos (nombre, turno, cupos, costo) VALUES (?,?,?,?)";
        try{
            this.objConexion.conectar();
            this.objConnection = this.objConexion.getJdbcConnection();
            //Inicializacion de la consulta
            PreparedStatement  prest = this.objConnection.prepareStatement(consulta);
            //Agregar los datos dentro de la consulta
            
            prest.setString(1, objCurso.getNombre());
            prest.setString(2, objCurso.getTurno());
            prest.setString(3, objCurso.getCupos());
            prest.setString(4, objCurso.getCosto());
            
            int count = prest.executeUpdate();
            
            ResultSet rs = null;
            rs = prest.executeQuery("SELECT LAST_INSERT_ID()");
            
            int autoKey = -1;
            if(rs.next()){
                autoKey = rs.getInt("id");
                objCurso.setId(autoKey);
                System.out.println("Ultimo ID introducto " + autoKey);
            }else{
                System.out.println("No exite dato de ID");
            }
            
        }catch(Exception e){
            System.out.println("Error al insertar" + e);
        }
        return objCurso;
        
        
    }
        @Override
    public Curso findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        
    }
    @Override
    public Curso updateById(Integer id, Curso objCurso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
@Override
    public Boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    
