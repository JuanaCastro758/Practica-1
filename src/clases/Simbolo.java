/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Chiko malo
 */
public enum Simbolo {
    UNO("1"),
    DOS("2"),
    TRES("3"),
    CUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SIETE("7"),
    OCHO("8"),
    NUEVE("9"),
    PUNTO("."),
    PUNTOCOMA(";"),
    COMA(","),
    LLAVE1("{"),
    LLAVE2("}"),
    CORCHETE1("["),
    CORCHETE2("]");
//public String getNombreProducto(){ return this.nombreProducto; }
    private String caracter;
    private Simbolo(String caracter){
        this.caracter=caracter;
    }
    public String getCaracter(){ 
        return this.caracter;
    }
}
