
import Model.Square;
import Model.Circulo;
import Model.Triangulo;

public class app {
    
    public static void main(String[] args) {

    Square square = new Square();
    square.setLado(10);
    double squarePerimeter = square.getPerimeter();
    double squareArea = square.getArea();
    System.out.println("Area del cuadrado: " + squareArea);
     System.out.println("Perimetro del cuadrado: " + squarePerimeter);

// Operaciones Circulo
 // Radio 10
        Circulo circulo = new Circulo(10);

        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();

        System.out.println("Area del circulo: " + area);
        System.out.println("Perimetro del circulo:" + perimetro);


// Operaciones Triangulo

     Triangulo triangulo = new Triangulo(10, 5);

     double areaT = triangulo.calcularArea();
     double perimetroT = triangulo.calcularPerimetro();

     System.out.println("Area del triangulo: " + areaT);
     System.out.println("Perimetro del triangulo: " + perimetroT);

    }
}
