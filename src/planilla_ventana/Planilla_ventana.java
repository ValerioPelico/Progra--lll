
package planilla_ventana;

import Controlador.cntrl_empleado;
import Modelo.empleado;
import Modelo.ver_empleado;
import Vista.frame_ingreso_usuario;

/**
 *
 * @autor Valerio Pelicó Guox
 * 0901-16-11957
 */
public class Planilla_ventana {

    
    public static void main(String[] args) {

        empleado emp = new empleado();      
        ver_empleado veC=new ver_empleado();
        frame_ingreso_usuario fiu=new frame_ingreso_usuario();
        
        cntrl_empleado ctrl=new cntrl_empleado(emp,veC,fiu);
        ctrl.iniciar();
        fiu.setVisible(true);
        
    }
    
}
