

<%@page  language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        <link rel="stylesheet" href="<%=request.getContextPath() %> /webjars/bootstrap/5.3.0-alpha3/dist/css/bootstrap.min.css"/>
        <script src="<%= request.getContextPath() %>/webjars/bootstrap/5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"> </script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">PV</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Curso</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
        
        
        <h1>Pagina de Registro de Curso</h1>
        <div class="container">
        <form action="<%= request.getContextPath() %>/CursoServlet?action=create" method="POST">
             <div class="mb-3">
            <label for="id" class="form-label"> Id:</label> 
            <input type="text" class="form-control"  name="id" id="id" required minlength="1" maxlength="100" placeholder="Introduzca id">
             </div>
            <br>
            <div class="mb-3">
            <label for="nombre" class="form-label">Nombre:</label>
            <input type="text" class="form-control"  name="nombre" id="nombre" required minlength="1" maxlength="100" placeholder="Introduzca nombre">
            </div>
            <br>
            <div class="mb-3">
            <label for="turno" class="form-label">Turno:</label>
            <input type="text" class="form-control"  name="turno" id="turno" required minlength="1" maxlength="100" placeholder="Introduzca turno">
            </div>
            <br>
            
            <div class="mb-3">
            <label for="cupos" class="form-label">Cupos:</label>
            <input type="text" class="form-control"  name="cupos" id="cupos" required minlength="1" maxlength="100" placeholder="Introduzca cupos">
            </div>
            <br>
             <div class="mb-3">
            <label for="costo" class="form-label">Costo:</label>
            <input type="text" class="form-control"  name="costo" id="costo" required minlength="1" maxlength="100" placeholder="Introduzca costo">
            </div>
            <br>
            <button type="submit" class="btn btn-primary"> Registrar</button>
        </form>
        
    </body>
</html>
