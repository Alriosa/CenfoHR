/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.Notificacion;
import Entities.Personal;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PersonalMapper extends SqlConnection{

    public Object buscarPersona(Object miObjeto) {
       Object buscarPersonal = null;
       Personal miPersonal = null;
        try {
            conn = DriverManager.getConnection(connectionUrl);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM TBL_PERSONAL");
            buscarPersonal =new Object();
           
            while (rs.next()) {
                miPersonal = new Personal();
                miPersonal.setIdentificacion(rs.getString("ID"));
                miPersonal.setNombre(rs.getString("NAME"));
                miPersonal.setApellidoUno(rs.getString("LAST_NAME_1"));
                miPersonal.setApellidoDos(rs.getString("LAST_NAME_2"));
                miPersonal.setRol(rs.getInt("ID_ROL"));
                buscarPersonal=miPersonal;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }

        return buscarPersonal;
    }
    
}
