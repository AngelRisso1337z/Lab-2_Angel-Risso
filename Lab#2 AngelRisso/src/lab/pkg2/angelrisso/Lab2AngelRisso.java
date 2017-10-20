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
                            int num_maest = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos maestros va a meter al Sistema"));
                            for (int i = 0; i < num_maest; i++) {
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
                            }

                            break;
                        case 2:
                            int exist = 0;
                            int num_class = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clases que va a meter: "));
                            for (int i = 0; i < num_class; i++) {
                                String clas_nom = JOptionPane.showInputDialog("Ingrese el nombre de la clase");
                                int sec = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la seccion de la clase"));
                                int max_est = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos estudiantes pueden estar en la seccion"));
                                String profe = JOptionPane.showInputDialog("ingrese profesor que va a dar la clase");
                                for (int j = 0; j < maestros.size(); j++) {
                                    if (maestros.get(j).getNombre().equals(profe)) {
                                        exist = 1;
                                    }
                                }
                                if (exist != 1) {
                                    while (exist != 1) {
                                        profe = JOptionPane.showInputDialog("su profesor no existe, ingrese otro que si exista");
                                        for (int j = 0; j < maestros.size(); j++) {
                                            if (maestros.get(j).getNombre().equals(profe)) {
                                                exist = 1;
                                            }
                                        }
                                    }
                                }
                                int unid_val = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas unidades valorativas va a tener la clase"));
                                int precio = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuanto vale la clase"));
                                clase.add(new Clase(clas_nom, sec, max_est, profe, unid_val, precio));
                                System.out.println(clase);
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Gracias por visitar la Administracion");
                    }

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bienvenido a la matricula");
                    int opcs = Integer.parseInt(JOptionPane.showInputDialog("1.añadir alumno nuevo\n"
                            + "2.matricular clases\n"
                            + "3.salir del sistema y regresar al menu"));
                    switch (opcs) {
                        case 1:
                            String nom_est = JOptionPane.showInputDialog("ingrese su nombre:");
                            int cuenta = Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero de cuenta"));
                            String carrera = JOptionPane.showInputDialog("Ingrese su carrera");
                            int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
                            int dineroa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dinero disponible"));
                            String user = JOptionPane.showInputDialog("Ingrese un usuario");
                            String pass = JOptionPane.showInputDialog("ingrese una contraseña simple");
                            int cant_classes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de clases que va a llevar"));
                            alumnos.add(new Estudiante(nom_est, cuenta, carrera, edad, dineroa, user, pass, cant_classes));
                            System.out.println(alumnos);
                            break;
                        case 2:
                            int val = 0;
                            String nom_val = JOptionPane.showInputDialog("Alumno, ingrese su nombre");
                            for (int i = 0; i < alumnos.size(); i++) {
                                if (alumnos.get(i).getNombre().equals(nom_val)) {
                                    val = 1;
                                }
                            }
                            if (val == 0) {
                                while (val == 0) {
                                    nom_val = JOptionPane.showInputDialog("usuario invalido, intente de nuevo");
                                    for (int i = 0; i < alumnos.size(); i++) {
                                        if (alumnos.get(i).getNombre().equals(nom_val)) {
                                            val = 1;
                                        }
                                    }
                                }

                            }
                            String classes = "";
                            for (int i = 0; i < clase.size(); i++) {
                                classes += clase.get(i);
                            }

                            String clas_val = JOptionPane.showInputDialog(classes + "\n" + " ingrese la clase que va a matricular");
                            val = 0;
                            for (int i = 0; i < clase.size(); i++) {
                                if (clase.get(i).getNombre().equals(clas_val)) {
                                    val = 1;
                                }
                            }
                            if (val == 0) {
                                while (val == 0) {
                                    clas_val = JOptionPane.showInputDialog("clase invalida, intente de nuevo");
                                    for (int i = 0; i < clase.size(); i++) {
                                        if (clase.get(i).getNombre().equals(clas_val)) {
                                            val = 1;
                                        }
                                    }
                                }

                            }
                            val = 0;
                            int diner,
                             din_disp;
                            for (int i = 0; i < alumnos.size(); i++) {
                                for (int j = 0; j < clase.size(); j++) {
                                    if (alumnos.get(i).getDinero_disp() < clase.get(j).getPrecio()) {
                                        val=1;
                                    }
                                }

                            }
                            if (val==1) {
                                JOptionPane.showMessageDialog(null,"No dispone del dinero para matricular esta clase");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "regresando al sistema.");
                    }

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
