package com.zonatalentos.ciclismoapp.response;

import com.zonatalentos.ciclismoapp.models.CyclistsModel;

import java.util.Optional;

public class CyclistResponseOne {

    private String mensaje;
    private Optional<CyclistsModel> cyclistsModels;

    public CyclistResponseOne() {
    }

    public CyclistResponseOne(String mensaje, Optional<CyclistsModel> cyclistsModels) {
        this.mensaje = mensaje;
        this.cyclistsModels = cyclistsModels;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Optional<CyclistsModel> getCyclistsModels() {
        return cyclistsModels;
    }

    public void setCyclistsModels(Optional<CyclistsModel> cyclistsModels) {
        this.cyclistsModels = cyclistsModels;
    }
}
