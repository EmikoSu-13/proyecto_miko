package Computadora;

public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }   

    public void encender() {
        if (!encendida) {
            encendida = true;

            System.out.println("La computadora esta encendida.");
        }
    }

        public void apagar() {
            if(encendida) {
                encendida = false;

                System.out.println("La computadora esta apagada.");
            }
            
            
        }
     
}
