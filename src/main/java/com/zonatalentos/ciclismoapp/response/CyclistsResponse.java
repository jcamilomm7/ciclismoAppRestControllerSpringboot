package com.zonatalentos.ciclismoapp.response;

import com.zonatalentos.ciclismoapp.models.CyclistsModel;

import java.util.ArrayList;

public class CyclistsResponse {

    private String mensaje;
    private ArrayList<CyclistsModel> cyclistsModels;

    public CyclistsResponse() {
    }

    public CyclistsResponse(String mensaje, ArrayList<CyclistsModel> cyclistsModels) {
        this.mensaje = mensaje;
        this.cyclistsModels = cyclistsModels;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<CyclistsModel> getCyclistsModels() {
        return cyclistsModels;
    }

    public void setCyclistsModels(ArrayList<CyclistsModel> cyclistsModels) {
        this.cyclistsModels = cyclistsModels;
    }
}
