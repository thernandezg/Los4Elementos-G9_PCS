/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal.main;

import Controller.LoginController;
import com.mycompany.proyectofinal.view.LoginView;
import com.mycompany.proyectofinal.dao.DBConnection;
import java.sql.Connection;


/**
 *
 * @author Admin
 */
public class ProyectoFinal {
//Participantes: 
    //Litzy Fiorella Vargas Vargas
    //Kendall Esteban Caldera Alvarez
    //Sebastián Rojas
    public static void main(String[] args) {
        System.out.println("Probando conexión...");
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("Conexión exitosa!");
            try { conn.close(); } catch (Exception e) {}
        }
        
        // INICIAR DIRECTAMENTE SIN SwingUtilities
        System.out.println("Iniciando aplicación directamente...");
        
        try {
            LoginView loginView = new LoginView();
            new LoginController(loginView); // El controller se registra automáticamente
            loginView.setVisible(true);
            System.out.println("LoginView visible");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




