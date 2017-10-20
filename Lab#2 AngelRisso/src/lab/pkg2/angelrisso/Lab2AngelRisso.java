package lab.pkg2.angelrisso;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab2AngelRisso {

    public static void main(String[] args) {
        ArrayList<Maestro> maestros = new ArrayList();
        ArrayList<Estudiante> alumnos = new ArrayList();
        ArrayList<Clase> clase = new ArrayList();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                    + "1.Admon\n"
                    + "2.matricula\n"
                    + "3.Log in\n"
                    + "0 para salir del sistema"));
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "bienvenido a la Administracion");
                    int opc = Integer.parseInt(JOptionPane.showInputDialog("1. añadir maestros\n"
                            + "2.Añadir clases\n"
                            + "3.salir de Admon."));
                    switch (opc) {
                        case 1:
                            String maestro = JOptionPane.showInputDialog("Ingrese el nombre del maestro");
                            String maestria = JOptionPane.showInputDialog("Ingrese la maestria de dicho maestro");
                            String titulo = JOptionPane.showInputDialog("Ingrese maestria, si la tiene");
                            int salario = Integer.parseInt(JOptionPane.showInputDialog("ingrese salario del maestro"));

                            String usuario = JOptionPane.showInputDialog("Ingrese un usuario particular del maestro");
                            String pass = JOptionPane.showInputDialog("Ingrese la contraseña del maestro");
                            int clases_max = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas clases va a dar el maestro"));
                            int seccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la seccion del maestro"));
                            maestros.add(new Maestro(maestro, titulo, maestria, salario, usuario, pass, clases_max, seccion));
                            System.out.print(maestros);
                            break;
                        case 2:
                            String clas_nom=JOptionPane.showInputDialog("Ingrese el nombre de la clase");
                            int sec=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la seccion de la clase"));
                            int ma
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Gracias por visitar la Administracion");
                    }

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bienvenido a la matricula");
                    break;
                case 3:
                    String user = JOptionPane.showInputDialog("Ingrese su Usuario");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "gracias por usar nuestro sistema");
            }
        } while (op != 0);

    }

}
