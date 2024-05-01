/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spotyfaby;

import modelos.Cancion;
import modelos.MisFavoritos;
import modelos.Podcast;

/**
 *
 * @author Faby
 */
public class SpotyFaby {

    public static void main(String[] args) {
        Cancion cancion= new Cancion();
        cancion.setCantante("Abel Pintos");
        cancion.setTitulo("El Antigal");
        
        Podcast pod= new Podcast();
        pod.setTitulo("Real Life English");
        pod.setPresentador(" Ethan");
        
        for (int i = 0; i < 100; i++) {
            cancion.meGusta();
        }
        
         for (int i = 0; i < 200; i++) {
            cancion.reproduce();
        }
         
         for (int i = 0; i < 50; i++) {
            pod.meGusta();
        }
        
         for (int i = 0; i < 200; i++) {
            pod.reproduce();
        }
         
         System.out.println("Reproducciones totales de la cancion " + cancion.getTitulo()+ " es :" + cancion.getTotalDeReproducciones());
         System.out.println("Totales de Likes para " + cancion.getTitulo()+ ": " + cancion.getCantidadDeLikes());
         
          System.out.println("Reproducciones totales del podcast " + pod.getTitulo()+ " es :" + pod.getTotalDeReproducciones());
         System.out.println("Totales de Likes para " + pod.getTitulo()+ ": " + pod.getCantidadDeLikes());
         
         MisFavoritos fav= new MisFavoritos();
         fav.agregar(cancion);
         fav.agregar(pod);
    }
}
