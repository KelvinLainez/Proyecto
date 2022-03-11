/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author pc
 */
public abstract class Asignatura {
    

//atributos
   private String nombre;
   private String codigo;
   private int periodo;
   public Asignatura(){
    //contructor sin parametros

}

//establecer y obtener
  public void establecerNombre(String nombre){
   this.nombre=nombre;
}
  public String obtenerNombre(){
   return this.nombre;
}

  public void establecerCodigo(String codigo){
   this.codigo=codigo;
}
  public String obtenerCodigo(){
   return this.codigo;
}

 public void establecerPeriodo(int periodo){
   this.periodo=periodo;
}
  public int obtenerPeriodo(){
   return this.periodo;
}
  public void imprimirInfo(){
   System.out.println("Nombre: "+ nombre);
   System.out.println("Codigo: "+ codigo);
   System.out.println("Periodo: "+ periodo);
}
   abstract String obtenerInfoAsig();
}
