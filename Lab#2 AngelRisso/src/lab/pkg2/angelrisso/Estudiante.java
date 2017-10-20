/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.angelrisso;

/**
 *
 * @author W7Pro64
 */
public class Estudiante {
    private String nombre;
    private int cuenta;
    private String carrera;
    private int edad;
    private int dinero_disp;
    private String usuario;
    private String pass;
    private int cant_clases;

    public Estudiante() {
    }

    public Estudiante(String nombre, int cuenta, String carrera, int edad, int dinero_disp, String usuario, String pass, int cant_clases) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.dinero_disp = dinero_disp;
        this.usuario = usuario;
        this.pass = pass;
        this.cant_clases = cant_clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero_disp() {
        return dinero_disp;
    }

    public void setDinero_disp(int dinero_disp) {
        this.dinero_disp = dinero_disp;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCant_clases() {
        return cant_clases;
    }

    public void setCant_clases(int cant_clases) {
        this.cant_clases = cant_clases;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", carrera=" + carrera + ", edad=" + edad + ", dinero_disp=" + dinero_disp + ", usuario=" + usuario + ", pass=" + pass + ", cant_clases=" + cant_clases + '}';
    }
   
}
