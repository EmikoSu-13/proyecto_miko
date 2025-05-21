import javax.swing.JOptionPane;

public class promedios{
public static void main(String[] args) {
    String A = JOptionPane.showInputDialog("Ingrese el primer promedio");
    String B = JOptionPane.showInputDialog("Ingrese el segundo promedio");
    String C = JOptionPane.showInputDialog("Ingrese el tercer promedio");
    float total = ( Float.parseFloat(A) + Float.parseFloat(B) + Float.parseFloat(C) ) / 3;
    System.out.println("El promedio es: " + total);
}  
}