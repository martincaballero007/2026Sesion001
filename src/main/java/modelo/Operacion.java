/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * 
 */
//OBS si mi clase es publica el nombre del archivo debe coincidir
public class Operacion {
    private int operador1;
    private int operador2;

    public Operacion (int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public Operacion () {
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
    
    public int sumar(){
        return operador1+operador2;
    }
    
    public int multiplicar(){
        return operador1*operador2;
    }
    public int restar(){
        return operador1-operador2;
    }
    
}