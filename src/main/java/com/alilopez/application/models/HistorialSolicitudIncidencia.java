package com.alilopez.application.models;

import java.util.ArrayList;

public class HistorialSolicitudIncidencia {
    private ArrayList<Incidencia> incidencias;

    public HistorialSolicitudIncidencia() {
        this.incidencias = new ArrayList<>();
    }

    public void addIncidencia(Incidencia incidencia) {
        incidencias.add(incidencia);
    }

    public void deleteIncidencia(int id) {
        incidencias.removeIf(incidencia -> incidencia.getId() == id);
    }

    public ArrayList<Incidencia> getIncidencias() {
        return incidencias;
    }
}

