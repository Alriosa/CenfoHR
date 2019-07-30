/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.PermisoSalida;
import com.proyecto.conexion.Conector;

/**
 *
 * @author Usuario
 */
public class PermisoSalidaMapper {
     public String crearNotificaciones(PermisoSalida miNotificacion) {

        String consulta = "{Call dbo.crear_notificacion_permiso ('" + miNotificacion.getFechaentrada() + "','" 
                + miNotificacion.getFechasalida() + "','" + miNotificacion.getDescripcion() + "','" 
                + miNotificacion.getTipoNotificacion() + "','"+miNotificacion.getIdNotificacion()+"')}";
          String resultado;

        try {
                Conector.getConector().ejecutarSQL(consulta);
                resultado = "La notificacion se registró correctamente en el sistema.";

        } catch (Exception error) {
                resultado = "No se pudo registrar la notificacion, intentelo de nuevo " + error.getMessage();

        }

        return resultado;
    }
}
