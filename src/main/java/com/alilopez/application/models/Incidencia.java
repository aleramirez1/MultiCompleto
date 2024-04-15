package com.alilopez.application.models;

import java.time.LocalDate;

public class Incidencia {
    private String nombre;
    private String descripcion;
    private String tipo;
    private String color;
    private String fecha;
    private String titulo;
    private int aula;
    private int ud;
    private String direccionImagen;

    public Incidencia(String nombre, String descripcion, String tipo, int aula, int ud, LocalDate fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.aula = aula;
        this.ud = ud;
        this.fecha = fecha.toString();
    }

    public Incidencia(String descripcion, String nombreObjeto, String tipo, String aula, String ud, String color, String fecha) {
        this.descripcion = descripcion;
        this.nombre = nombreObjeto;
        this.tipo = tipo;
        this.aula = Integer.parseInt(aula);
        this.ud = Integer.parseInt(ud);
        this.color = color;
        this.fecha = fecha;
    }

    public Incidencia() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getUd() {
        return ud;
    }

    public void setUd(int ud) {
        this.ud = ud;
    }

    public String getNombreObjeto() {
        return nombre;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }
}
