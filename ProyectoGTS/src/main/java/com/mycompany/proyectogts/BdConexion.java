package com.mycompany.proyectogts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdConexion {
    private static final String URL = "jdbc:mysql://localhost:3306/GST";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";
    
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }
}