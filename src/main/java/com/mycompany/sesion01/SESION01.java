
package com.mycompany.sesion01;

import java.util.Scanner;
import Modelo.Operaciones;
import vista.frmOperaciones;
import controlador.ControladorOperaciones;
public class SESION01{

    public static void main(String[] args) {
        Operaciones modelo = new Operaciones(20,30);
        frmOperaciones vista = new frmOperaciones();
        ControladorOperaciones controlador = new ControladorOperaciones(modelo,vista);
        controlador.iniciar();
        
    }
        /*java.util.Scanner teclado = new Scanner(System.in);
        Operaciones operacion = new Operaciones();
        System.out.print("Ingrese el primer valor: ");
        int numero = teclado.nextInt();
        operacion.setOperador1(numero);
        System.out.print("Ingrese el segundo valor: ");
        numero = teclado.nextInt();
        operacion.setOperador2(numero);
        
        System.out.println("lA SUMA ES :" + operacion.sumar());
        System.out.println("lA RESTA ES :"  + operacion.restar());
        System.out.println("lA MULTIPLICACION ES :" + operacion.multiplicar());
    }*/
}
