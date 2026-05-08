/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Operacion;
import vista.frmOperaciones;

public class ControladorOperaciones {
    private Operacion modelo;
    private frmOperaciones vista;
    
    public ControladorOperaciones(Operacion modelo, frmOperaciones vista){
        this.modelo=modelo;
        this.vista= vista;
        this.vista.btnSumar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                modelo.setOperador1(Integer.parseInt(vista.txtOperador1.getText()));
                modelo.setOperador2(Integer.parseInt(vista.txtOperador2.getText()));
                vista.lblResultado.setText(String.valueOf(modelo.sumar()));
                 
            }
            
        });
    }

    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
}
