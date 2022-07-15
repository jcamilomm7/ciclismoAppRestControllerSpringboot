package com.zonatalentos.ciclismoapp.response;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.models.CyclistsModel;

import java.util.ArrayList;

public class CyclingTeamResponse {

    private String mensaje;
    private ArrayList<CyclingTeamModel> cyclingTeamModels;

    public CyclingTeamResponse() {
    }

    public CyclingTeamResponse(String mensaje, ArrayList<CyclingTeamModel> cyclingTeamModels) {
        this.mensaje = mensaje;
        this.cyclingTeamModels = cyclingTeamModels;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<CyclingTeamModel> getCyclingTeamModels() {
        return cyclingTeamModels;
    }

    public void setCyclingTeamModels(ArrayList<CyclingTeamModel> cyclingTeamModels) {
        this.cyclingTeamModels = cyclingTeamModels;
    }
}
