public abstract class Empleado {

    private String id;
    private String nombre;
    protected double salarioBase;

    public Empleado(String id, String nombre, double salarioBase) {

        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

        public double getSalarioBase(){
            return salarioBase;
        }

        public String getNombre(){
            return nombre;
        }
        public String getId(){
            return id;
        }


    public abstract double calcularSalario();
}