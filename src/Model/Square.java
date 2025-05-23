package Model;

public class Square {

    private double lado;
    private String message = "Hola soy transformadorjsjs";
    

    public double getPerimeter(){
        return lado * 4;
    }

    public double getArea(){
        if(!this.message.isEmpty()){
             getSecretMessage();
    }
        return lado * lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    public void setMessage(String message){
        this.message = message;
    }

    private void getSecretMessage(){
        System.out.println("Este metodo solo es accesible dentro de la clase pero no desde fuera xd");
    }


}
    


