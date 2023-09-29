package com.example;

public class TiendaMascotas {
    private String nombre_De_La_Tienda, Direccion;
    private int Numero_De_La_Tienda;
    
    TiendaMascotas(String nombre_De_La_tienda, String Direccion , int Numero_De_La_Tienda){
        this.nombre_De_La_Tienda = nombre_De_La_tienda;
        this.Direccion = Direccion;
        this.Numero_De_La_Tienda= Numero_De_La_Tienda;

    }
    public String getNombre (){
        return nombre_De_La_Tienda;

    }
    public String getDireccion (){
        return Direccion;
    }
    public int getNumero (){
        return Numero_De_La_Tienda;
    }
    public void setNombre (String nombre){
        this.nombre_De_La_Tienda= nombre;
    }
    public void setDireccion (String direccion){
        this.Direccion= direccion;
    }
    public void setNumero (int numero){
        this.Numero_De_La_Tienda= numero;
    }
    
}
 class Mascotas {
    private String nombre_Mascota, Sex_Mascota , Color_Mascota;
    private int edad;
    Mascotas (String nombre_Mascota, String Sex_Mascota, String Color_Mascota, int edad) {
        this.nombre_Mascota = nombre_Mascota;
        this.Sex_Mascota = Sex_Mascota;
        this.Color_Mascota = Color_Mascota;
        this.edad = edad;

    }
    public String getNombre(){
        return nombre_Mascota;

    }
     public String getSex(){
        return Sex_Mascota;

    }
     public String getColor(){
        return Color_Mascota;

    }
     public int getEdad(){
        return edad;
    }
    public void setNombre(String Nombre){
        this.nombre_Mascota=Nombre;

    }
    public void setSex(String sex){
        this.Sex_Mascota= sex;
    }
    public void setRaza(String color){
        this.Color_Mascota= color;
    }
    public void setEdad(int Edad){
        this.edad= Edad;
    }
}
class Gato extends Mascotas{
    public Gato (String nombre, String sex, String color, int edad){
        super (nombre, sex, color,edad);
    }
    
}
class Perro extends Mascotas {
    public Perro (String nombre, String sex, String color, int edad ){
        super(nombre,sex,color,edad);
    }
}
class Clientes {
    private String nombre_Cliente, direccion;
    private int numero_Del_Cliente;

    Clientes (String nombre_Cliente, String direccion, int numero_Del_Cliente){
        this.nombre_Cliente= nombre_Cliente;
        this.direccion= direccion;
        this.numero_Del_Cliente= numero_Del_Cliente;
    }
    /*Los metodos get y set, son simples metodos que usamos en las clases para mostrar (get) o modificar (set) el valor de un atributo */
    public String getNombre (){
        return nombre_Cliente;
    }
    public String getDireccion (){
        return direccion;
    }
    public int getNumero (){
        return numero_Del_Cliente;
    }
    public void setNombre(String nombre){
        this.nombre_Cliente = nombre;
    }
    public void setDireccion (String direccion){
        this.direccion = direccion;
    }
    public void setNumero (int numero){
        this.numero_Del_Cliente = numero;
    }
    
}
class Empleado {
    private String nombre_Empleado, cargo;
    private int codigo;

    Empleado (String nombre_Empleado, String cargo, int codigo){
        this.nombre_Empleado= nombre_Empleado;
        this.cargo= cargo;
        this.codigo= codigo;
    }
    /*Los metodos get y set, son simples metodos que usamos en las clases para mostrar (get) o modificar (set) el valor de un atributo */
    public String getNombre (){
        return nombre_Empleado;
    }
    public String getCargo (){
        return cargo;
    }
    public int getCodigo (){
        return codigo;
    }
    public void setNombre(String nombre){
        this.nombre_Empleado = nombre;
    }
    public void setCargo (String cargo){
        this.cargo = cargo;
    }
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }

}