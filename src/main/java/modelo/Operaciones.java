package Modelo;

public class Operaciones{
    private int operador1;
    private int operador2;

    public Operaciones(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    public Operaciones(){
    }
    public void setOperador1(int operador1) {
        this.operador1 = operador1; 
    }
    public void setOperador2(int operador2){
        this.operador2 = operador2;
    }
    public int sumar(){
        return operador1+operador2;
    }
    public int restar(){
        return operador1-operador2;
    }
    public int multiplicar(){
        return operador1*operador2;
    }
}

