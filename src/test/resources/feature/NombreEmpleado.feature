#language:es
Característica: Cambiar el nombre del empleado en cualquiera de las ordenes
  Yo como usuario con permisos quiero ingresar en la pagina
  para modificar el nombre de un empleado en las ordenes


  @CambioNombre
  Escenario: Cambio de nombre del empleado a la orden
    Dado el ingreso correcto a Open Orders
    Cuando de clic en cualquiera de las ordenes
    Y Selecione el nombre del empleado en aleatoria
    Entonces se evidenicia el cambio exitosamente
