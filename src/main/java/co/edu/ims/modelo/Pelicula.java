/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 012345678
 */
public class Pelicula {
    //atributos
    private String titulo;
    private int anio;
    private List<Genero> generos = new ArrayList<>();
    //constructores
    public Pelicula() {};
    public Pelicula(String t, int a) {
        this.titulo = t;
        this.anio = a;
        //this.generos = g;
    };
    //Getter y Setter
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public List<Genero> getGeneros(){
        return generos;
    }
    public void setGeneros(List<Genero> generos){
        this.generos = generos;
            }
    
}
