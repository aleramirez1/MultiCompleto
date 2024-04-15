package com.alilopez.application.models;

public class SolicitudIncidencia {
    private String nombre;
    private String tipo;
    private String color;
    private String descripción;
    private String fecha;
    private String aula;
    private String ud;


    public SolicitudIncidencia(String nombre, String tipo, String color, String descripción, String fecha, String aula, String ud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.descripción = descripción;
        this.fecha = fecha;
        this.aula = aula;
        this.ud = ud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getUd() {
        return ud;
    }

    public void setUd(String ud) {
        this.ud = ud;
    }
}
