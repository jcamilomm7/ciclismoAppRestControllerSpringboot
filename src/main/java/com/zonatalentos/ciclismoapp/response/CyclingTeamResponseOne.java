package com.zonatalentos.ciclismoapp.response;

import com.zonatalentos.ciclismoapp.models.CyclingTeamModel;
import com.zonatalentos.ciclismoapp.models.CyclistsModel;

import java.util.Optional;

public class CyclingTeamResponseOne {

    private String mensaje;
    private Optional<CyclingTeamModel> cyclingTeamModel;

    public CyclingTeamResponseOne() {
    }

    public CyclingTeamResponseOne(String mensaje, Optional<CyclingTeamModel> cyclingTeamModel) {
        this.mensaje = mensaje;
        this.cyclingTeamModel = cyclingTeamModel;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Optional<CyclingTeamModel> getCyclingTeamModel() {
        return cyclingTeamModel;
    }

    public void setCyclingTeamModel(Optional<CyclingTeamModel> cyclingTeamModel) {
        this.cyclingTeamModel = cyclingTeamModel;
    }
}
