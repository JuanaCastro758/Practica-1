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
    COMA(","),
    DOS_PUNTOS(";"),
    LLAVES("{}"),
    CORCHETES("[]"),
    PUNTO(".");

    public static Simbolo getCOMA() {
        return COMA;
    }
    public static Simbolo getDOS_PUNTOS() {
        return DOS_PUNTOS;
    }
    public static Simbolo getLLAVES() {
        return LLAVES;
    }
    public static Simbolo getCORCHETES() {
        return CORCHETES;
    }
    public static Simbolo getPUNTO() {
        return PUNTO;
    }
    String texto;
    private Simbolo(String texto){
        this.texto=texto;
    }
    
}
