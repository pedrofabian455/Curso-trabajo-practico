

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de Registro de Curso</h1>
        <form action="<%= request.getContextPath()%>/CursoServlet" method="GET">
            <label>Id:</label>
            <input type="text" name="id">
            <br>
            <label>Nombre:</label>
            <input type="text" name="nombre">
            <br>
            <label>Turno:</label>
            <input type="text" name="turno">
            <br>
            <label>Cupos:</label>
            <input type="text" name="cupos">
            <br>
            <label>Costo:</label>
            <input type="text" name="costo">
            <br>
            <input type="submit" value="Registrar">
        </form>
            
    </body>
</html>
