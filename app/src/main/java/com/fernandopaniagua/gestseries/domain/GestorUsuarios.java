package com.fernandopaniagua.gestseries.domain;

/**
 * Fake class
 */
public class GestorUsuarios {
    public boolean estaValidado(Usuario usuario){
        boolean isOK =
                usuario.getNombre().equals("fpaniagua") &&
                usuario.getPassword().equals("12345");
        return isOK;
    }
}
