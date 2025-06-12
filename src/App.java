public class App {
    public static void main(String[] args) throws Exception {

        Empleado em1 = new EmpleadoTiempoCompleto("8986868", "Pancracio", 1000, "Vacaciones");
        System.out.println("id: " + em1.getId());
        System.out.println("nombre: " + em1.getNombre());
        System.out.println("Beneficio: ");
        System.out.println("Salario Base: " + em1.calcularSalario());



        Empleado em2 = new EmpleadoPorHoras("xd0897jk", "Jianito", 800, 24);
        System.out.println("id: " + em2.getId());
        System.out.println("nombre: " + em2.getNombre());
        System.out.println("Salario Base: " + em2.calcularSalario());

        }


    }

