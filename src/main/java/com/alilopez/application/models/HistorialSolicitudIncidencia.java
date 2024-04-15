package com.alilopez.application.models;
import java.util.ArrayList;
public class HistorialSolicitudIncidencia {
    private ArrayList<SolicitudIncidencia> solicitudes;
    public void addSolicitud(SolicitudIncidencia solicitud) {
        solicitudes.add(solicitud);
    }
    public void deleteSolicitud(int id) {
        for (int i =0; i < solicitudes.size(); i++) {
            if (id == solicitudes.get(i).getId()) {
                solicitudes.remove(i);
            }
        }
    }
    public ArrayList<SolicitudIncidencia> getSolicitudes() {
        return solicitudes;
    }
}
