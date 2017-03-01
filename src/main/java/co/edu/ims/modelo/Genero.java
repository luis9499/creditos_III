/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

/**
 *
 * @author 012345678
 */
public class Genero {
    //atributos
    private String codigo;
    
    //constructores
    public Genero(){};
    
    public Genero(String c){
        this.codigo = c;
    }
    
    //Getter y Setter
    
    public String getCodigo(){
    return codigo;
    }
}
