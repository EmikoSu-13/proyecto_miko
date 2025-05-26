package Estudiante;

public class Stdu {
    
    public static void main(String[] args) {
        estudiante[] estudiantes = new estudiante[5];

        // Crear y asignar datos a los estudiantes
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new estudiante();
            estudiantes[i].setNombre("estudiante " + (i + 1));
            estudiantes[i].setMatricula("MAT00" + (i + 1));
            // Asignar 5 notas (puedes cambiar los valores si lo deseas)
            for (int j = 0; j < 5; j++) {
                estudiantes[i].setNota(j, 60 + 10 * i + j); // Ejemplo de notas diferentes
            }
        }

        // Mostrar información de cada estudiante
        for (estudiante est : estudiantes) {
            System.out.println("Nombre: " + est.getNombre());
            System.out.println("Promedio: " + est.calcularPromedio());
            System.out.println("¿Aprobado?: " + (est.aprobado() ? "Sí" : "No"));
            System.out.println("---------------------------");
        }
    }
}
