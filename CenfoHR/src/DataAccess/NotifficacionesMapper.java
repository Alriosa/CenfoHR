/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.Notificacion;
import com.proyecto.conexion.Conector;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class NotifficacionesMapper {

    public String crearNotificaciones(Notificacion miNotificacion) {

        String consulta = "{Call dbo.crear_notificacion ('" + miNotificacion.getAsunto() + "','" + miNotificacion.getRemitente() + "','" + miNotificacion.getFechaNotificacion() + "', '" + miNotificacion.getEstado() + "')}";
          String resultado;

        try {
                Conector.getConector().ejecutarSQL(consulta);
                resultado = "La notificacion se registró correctamente en el sistema.";

        } catch (Exception error) {
                resultado = "No se pudo registrar la notificacion, intentelo de nuevo " + error.getMessage();

        }

        return resultado;
    }

    
    public int obtenerUltimaNotificacion() {

        String consulta = "{Call dbo.obtener_ultimo_id}";
          int resultado=0;

         try {
                ResultSet conexion = Conector.getConector().ejecutarSQL(consulta, true);
                
                while(conexion.next()) {
                	resultado=conexion.getInt("ID_NOTIFICATION");
                }

        } catch (Exception error) {
            
        }

        return resultado;
    }
    public ArrayList<Notificacion> listarNotificaciones(String code) {
        return null;
    }

    public Notificacion buscarNotificacione(String code) {
        return null;
    }

    public Notificacion CambiarEstado(String code) {
        return null;
    }
}
