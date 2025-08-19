/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc2_practica01_2025.semestre.DAO;
import com.mycompany.ipc2_practica01_2025.semestre.Models.Evento;
import com.mycompany.ipc2_practica01_2025.semestre.conexion.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author cesar
 */
public class EventoDAO {
       
    public boolean insertarEvento(Evento evento) throws ClassNotFoundException {
        String sql = "INSERT INTO evento (codigo_evento, tipo_evento, titulo, ubicacion, cupo_maximo, costo_inscripcion, fecha_evento) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, evento.getCodigoEvento());
            ps.setString(2, evento.getTipoEvento());
            ps.setString(3, evento.getTitulo());
            ps.setString(4, evento.getUbicacion());
            ps.setInt(5, evento.getCupoMaximo());
            ps.setDouble(6, evento.getCostoInscripcion());
            ps.setDate(7, evento.getFechaEvento());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
        
    
    
    

