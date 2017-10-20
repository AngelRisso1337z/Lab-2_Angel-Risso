package lab.pkg2.angelrisso;
import java.util.ArrayList;
public class Clase {
    private String nombre;
    private int seccion;
    private int max_est;
    private String maestro;
    private int unid_val;
    private int precio;
    private ArrayList estudiantes;

    public Clase() {
    }

    public Clase(String nombre, int seccion, int max_est, String maestro, int unid_val, ArrayList estudiantes) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.max_est = max_est;
        this.maestro = maestro;
        this.unid_val = unid_val;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getMax_est() {
        return max_est;
    }

    public void setMax_est(int max_est) {
        this.max_est = max_est;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public int getUnid_val() {
        return unid_val;
    }

    public void setUnid_val(int unid_val) {
        this.unid_val = unid_val;
    }

    public ArrayList getEstidiantes() {
        return estudiantes;
    }

    public void setEstidiantes(ArrayList estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
