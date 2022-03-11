/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author pc
 */
public class Ingles extends Asignatura{
    

  public Ingles(){
  establecerNombre("Ingles");
  establecerCodigo("1011");
  establecerPeriodo(2);
}
    @Override
    public String obtenerInfoAsig(){
    return "Informacion para Ingles";
}
}
