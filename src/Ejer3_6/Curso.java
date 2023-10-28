package Ejer3_6;

import java.util.Scanner;

public class Curso {
    Estudiantes [] estudiantes;
    int cantidadEstudiantes;

    static final int MAX_ESTUDIANTES = 100;

    public Curso() {
        estudiantes = new Estudiantes[MAX_ESTUDIANTES];
        cantidadEstudiantes = 0;
    }

    // añadir un estudiantes
    public void agregarEstudiante() {
      Scanner sc = new Scanner(System.in);

        if (cantidadEstudiantes < MAX_ESTUDIANTES) {
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese los apellidos del estudiante:");
            String apellidos = sc.nextLine();

            System.out.println("Ingrese el codigo del estudiante:");
            int codigo = sc.nextInt();

            if (codigoExistente(codigo)) {
                System.out.println("El codigo del estudiante ya existe. No se pudo agregar al curso.");
                return;
            }

            System.out.println("Ingrese el numero de semestre del estudiante:");
            int semestre = sc.nextInt();

            System.out.println("Ingrese la nota final del estudiante:");
            double notaFinal = sc.nextDouble();

            estudiantes[cantidadEstudiantes] = new Estudiantes(nombre, apellidos, codigo, semestre, notaFinal);
            cantidadEstudiantes++;

            System.out.println("Estudiante agregado exitosamente.");
        } else {
            System.out.println("El curso esta completo. No se pueden agregar mas estudiantes.");
        }
    }
    // No repetir codigo
    boolean codigoExistente(int codigo) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }
// buscador
    public void buscarEstudiantePorCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del estudiante a buscar:");
        int codigoBuscado = sc.nextInt();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigoBuscado) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].getNombre());
                System.out.println("Apellidos: " + estudiantes[i].getApellidos());
                System.out.println("Codigo: " + estudiantes[i].getCodigo());
                System.out.println("Numero de semestre: " + estudiantes[i].getSemestre());
                System.out.println("Nota Final: " + estudiantes[i].getNotaFinal());
                return; // Sale el estudiante y termina aca
            }
        }

        System.out.println("Estudiante no encontrado.");
    }

}
