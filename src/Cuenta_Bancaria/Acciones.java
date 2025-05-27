package Cuenta_Bancaria;

public class Acciones {
    
    private String titular;
    private double saldo = 0.0; 

    public void depositar(double monto) {
        if (monto > 0);
        {
            saldo +=monto;
            System.out.println("Deposito exitoso. Saldo actual: " +saldo);
        }
    }
    public boolean retirar(double monto) {
         if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " +saldo);
            return true;
         }
            else {
                System.out.println("Retiro fallido. Fondos insuficientes.");
                return false;
            }        
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    
}
