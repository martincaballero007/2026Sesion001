
package controlador;

import Modelo.Operaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmOperaciones;

public class ControladorOperaciones {
    private Operaciones modelo;
    private frmOperaciones vista;
    
    public ControladorOperaciones(Operaciones modelo, frmOperaciones vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSumar.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e){
                modelo.setOperador1(Integer.parseInt(vista.txtOperador1.getText()));
                modelo.setOperador2(Integer.parseInt(vista.txtOperador2.getText()));
                vista.jLabel3.setText(String.valueOf(modelo.sumar()));
        }
    });
    }    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
