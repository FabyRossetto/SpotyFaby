/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Faby
 */
public class Cancion extends Audio {

    private String cantante;
    private String album;
    private String genero;

    public String getCantante() {
        return cantante;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getCalificacion() {
        if (getCantidadDeLikes() > 100) {
            return 8;
        } else {
            return 4;
        }
    }
}


