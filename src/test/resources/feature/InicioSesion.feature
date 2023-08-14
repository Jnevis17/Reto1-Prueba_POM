#language:es
Característica: Iniciar sesion en Demo Serenity
  Yo como usuario con permisos quiero ingresar en la pagina
  para modificar el nombre de un empleado


  @InicioSesionExitoso
    Escenario:Inicio sesion correctamente
    Dado que el usuario abra la pagina correctamente
    Cuando ingrese las credenciales del usuario y contraseña
    Entonces podra ingresar correctamente