<!DOCTYPE html>
<html>
<head>
    <title>Formulario con Bootstrap</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Formulario de Registro</h1>
        <form>
          
            <div class="form-group">
                <label for="nombreUsuario">Nombre de Usuario:</label>
                <input type="text" class="form-control" id="nombreUsuario" name="nombreUsuario" placeholder="Ingrese su nombre de usuario">
            </div>
            <div class="form-group">
                <label for="password">Contraseña:</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Ingrese su contraseña">
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>
    <script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

