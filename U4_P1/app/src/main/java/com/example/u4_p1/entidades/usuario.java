package com.example.u4_p1.entidades;

import android.content.Intent;

public class usuario {

    private Intent id;
    private String nombre;
    private String telefono;

    public usuario(Intent id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Intent getId() {
        return id;
    }

    public void setId(Intent id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
