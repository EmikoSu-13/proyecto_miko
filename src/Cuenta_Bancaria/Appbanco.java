package Cuenta_Bancaria;

public class Appbanco {

    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco();
        cuenta.setTitular ("Pancracio");

        System.out.println("Titular de la cuenta:" +cuenta.getTitular());
        cuenta.depositar(500.0);
        cuenta.retirar(150);
        cuenta.retirar(700);
    }
    
}
