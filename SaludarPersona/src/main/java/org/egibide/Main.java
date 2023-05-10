package org.egibide;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://mysql00/database";
        String user = "user_bd";
        String password = "12345abcde";

        try {
            // Conectar a la base de datos
            conn = DriverManager.getConnection(url, user, password);

            // Ejecutar una consulta para obtener el nombre y primer apellido de una persona
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT nombre, apel1 FROM Personas LIMIT 1");

            // Si se encuentra una persona, mostrar un mensaje por consola
            if (rs.next()) {
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apel1 = rs.getString("apel1");
                    System.out.println("Hola desde Egibide " + nombre + " " + apel1);
                }
            } else {
                System.out.println("No se encontro ninguna persona en la tabla Personas");
            }
        } catch (SQLException ex) {
            // Mostrar errores de conexion o consulta
            System.out.println(" Mi Error: " + ex.getMessage());
            System.exit(1);
        } finally {
            // Cerrar los objetos de conexion
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion: " + ex.getMessage());
                System.exit(1);
            }
        }

        System.exit(0);
    }
}
