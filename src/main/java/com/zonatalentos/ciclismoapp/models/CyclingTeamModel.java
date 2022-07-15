package com.zonatalentos.ciclismoapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "cyclingteam")
public class CyclingTeamModel {

    @Id
    private String id;

    @Indexed(unique = true)
    private String codigoEquipo;

    private String nombre;
    private String pais;
    private ArrayList<CyclistsModel> cyclistsModels;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<CyclistsModel> getCyclistsModels() {
        return cyclistsModels;
    }

    public void setCyclistsModels(ArrayList<CyclistsModel> cyclistsModels) {
        this.cyclistsModels = cyclistsModels;
    }
}
