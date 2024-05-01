/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Faby
 */
public class MisFavoritos {
    
   public void agregar (Audio audio){
        if(audio.getCalificacion()>=8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos del momento");
        } else{
            System.out.println(audio.getTitulo() + "No esta entre los mas elegidos");
        }
    }
}
