/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.angelrisso;

import java.util.ArrayList;

public class Maestro {

    private String nombre;
    private String titulo;
    private String maestria;
    private int salario;
    private ArrayList clases;
    private String user;
    private String pass;
    private int clases_max;
    private int seccion;

    public Maestro() {
    }

    public Maestro(String nombre, String titulo, String maestria, int salario, String user, String pass, int clases_max, int seccion, ArrayList clases) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.maestria = maestria;
        this.salario = salario;

        this.user = user;
        this.pass = pass;
        this.clases_max = clases_max;
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getClases_max() {
        return clases_max;
    }

    public void setClases_max(int clases_max) {
        this.clases_max = clases_max;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Maestro:" + nombre + " Usuario:" + user + " Password: " + pass + " Salario: " + salario;
    }

}
