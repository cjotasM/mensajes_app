/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mesajes_app1;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mares
 */
public class Mesajes_app1 {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        
        try(Connection cnx = conexion.get_Connection()){
            
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
