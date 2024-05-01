/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Faby
 */
public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int cantidadDeLikes;
    private int calificacion;
    
    
    //cada vez que el usuario clickee me gusta va a llamar a este metodo y se le va a sumar un valor
    public void meGusta(){
        this.cantidadDeLikes++;
    }
    
    public void reproduce(){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public int getCantidadDeLikes() {
        return cantidadDeLikes;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public void setCantidadDeLikes(int cantidadDeLikes) {
        this.cantidadDeLikes = cantidadDeLikes;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
