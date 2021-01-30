package com.company;

public class CarsModel {

    private String car;
    private String mpg;
    private int cilindros;
    private double desplazamiento;
    private double caballosFuerza;
    private double peso;
    private double aceleracion;
    private String modelo;
    private String origen;

    public CarsModel(String car, String mpg, int cilindros, double desplazamiento, double caballosFuerza, double peso, double aceleracion, String modelo, String origen) {
        this.car = car;
        this.mpg = mpg;
        this.cilindros = cilindros;
        this.desplazamiento = desplazamiento;
        this.caballosFuerza = caballosFuerza;
        this.peso = peso;
        this.aceleracion = aceleracion;
        this.modelo = modelo;
        this.origen = origen;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getMpg() {
        return mpg;
    }

    public void setMpg(String mpg) {
        this.mpg = mpg;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(double desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public double getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(double caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {

        return "Coche: " + car + "  MPG: " + mpg + "  Cilindros: " + cilindros + "  CPs: " + caballosFuerza + "  Peso: " + peso +
                "  Aceleracion: " + aceleracion + "  Modelo: " + modelo + "  Origen: " + origen;
    }
}
