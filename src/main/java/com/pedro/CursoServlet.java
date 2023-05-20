/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedro;

import com.pedro.dao.CursoDAO;
import com.pedro.dao.CursoDAOImpl;
import com.pedro.model.Curso;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/CursoServlet")
public class CursoServlet extends HttpServlet {

    private CursoDAO cursoDAO;

    public CursoServlet() {
        super();
        cursoDAO = new CursoDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.procesarSolicitud(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.procesarSolicitud(req, resp);
    }

    protected void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        switch (request.getParameter("action")) {
            case "list":
                // this.list(request, response);
                break;
            case "create":
                this.create(request, response);
                break;
            case "read":
                // this.read(request, response);
                break;
            case "update":
                // this.update(request, response);
                break;
            case "delete":
                // this.delete(request, response);
                break;
            case "showRegister":
                this.showRegister(request, response);
                break;
            case "index":
                this.index(request, response);
                break;
            default:
                this.index(request, response);
                break;
        }
    }

    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    private void showRegister(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/create.jsp");
        dispatcher.forward(request, response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String turno = request.getParameter("turno");
        String cupos = request.getParameter("cupos");
        String costo = request.getParameter("costo");

        // Crear el objeto que se envía a la base de datos
        Curso objCurso = new Curso();
        objCurso.setNombre(nombre);
        objCurso.setTurno(turno);
        objCurso.setCupos(cupos);
        objCurso.setCosto(costo);

        cursoDAO.insert(objCurso);

        // Redireccionar al "index"
        this.index(request, response);
    }
}
