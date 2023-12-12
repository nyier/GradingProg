/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

/**
 *
 * @author nyierre
 */
public class usuario {
    private Long UID;
    private String password;
    private String nombre;
    private String apellido;
    private String perm;
    private String username;
    private double calificaciones;
    
    public usuario(){
    
    }
    public usuario(Long UID, String nombre, String apellido, String username, String perm, double calificaciones){
        this.UID = UID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones=calificaciones;
        this.username = username;
        this.perm = perm;
    }
    
    public Long getUID(){
        return UID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    public String getPassword() {
        return password;
    }

    public String getPerm() {
        return perm;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUID(long UID){
        this.UID = UID;
    }
    
    public double getCalificaciones(){
        return calificaciones;
    }
    
    public void setCalificaciones(double calificaciones){
        this.calificaciones = calificaciones;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    
}
