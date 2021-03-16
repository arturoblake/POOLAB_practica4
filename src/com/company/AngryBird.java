package com.company;

public class AngryBird extends Main{

    public AngryBird(String color,int velocidad, int alcance, int fuerza) {
        this.color = color;
        this.velocidad = velocidad;
        this.alcance = alcance;
        this.fuerza = fuerza;
    }

    public void setColor(String col) {
        color = col;
    }

    public String getColor() {
        return color;
    }

    public void setVelocidad(int vel) {
        velocidad = vel;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setAlcance(int alc) {
        alcance = alc;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setFuerza(int fza) {
        fuerza = fza;
    }

    public int getFuerza() {
        return fuerza;
    }
    public void mostrarDatos() {
        System.out.println("color"+getColor() +"\n velocidad: " +getVelocidad() +"\n alcance: " +getAlcance()
        +"\n fuerza: " +getFuerza());
    }
}
