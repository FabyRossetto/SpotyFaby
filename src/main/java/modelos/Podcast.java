/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Faby
 */
public class Podcast extends Audio {

    private String presentador;
    private String descripcion;

    public String getPresentador() {
        return presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getCalificacion() {
        if (getTotalDeReproducciones() > 100) {
            return 9;
        } else {
            return 2;
        }
    }
}



