/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pedro.dao;
import com.pedro.model.Curso;
import java.util.List;

/**
 *
 * @author Fabian
 */
public interface CursoDAO {
    public List<Curso> findAll();
    public Curso insert (Curso objCurso);
    public Curso findById(Integer id);
    public Curso updateById(Integer id, Curso objCurso);
    public Boolean deleteById(Integer id);
    
    
}
