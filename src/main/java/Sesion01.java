

package com.mycompany.sesion01;
import controlador.ControladorOperaciones;
import java.util.Scanner;
import modelo.Operacion;
import vista.frmOperaciones;

public class Sesion01 {

    public static void main(String[] args) {
        
        
        //void es que no regresa ningun valor,es publico y es static
        //System es una clase,out objeto y println el metodo
        Scanner teclado=new Scanner(System.in);
        //uso la clase scanner 
        Operacion operacion= new Operacion();
        //al estar en paquuetes distintos no se conocen,tengo que importar
        System.out.println("Ingrese l primer valor");
        int numero=teclado.nextInt();
        operacion.setOperador1(numero);
         numero=teclado.nextInt();
        operacion.setOperador2(numero);
        System.out.println("La suma es "+ operacion.sumar());
        System.out.println("La resta es "+ operacion.restar());
        System.out.println("La multiplicacion es "+ operacion.multiplicar());
        Operacion modelo=new Operacion(20,30);
        frmOperaciones vista=new frmOperaciones();
        ControladorOperaciones controlador= new ControladorOperaciones(modelo,vista);
        controlador.iniciar();
        
        
    }
}