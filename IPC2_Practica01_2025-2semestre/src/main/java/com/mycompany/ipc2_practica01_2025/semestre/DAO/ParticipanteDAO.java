/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc2_practica01_2025.semestre.DAO;

import com.mycompany.ipc2_practica01_2025.semestre.Models.Participante;
import com.mycompany.ipc2_practica01_2025.semestre.conexion.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author cesar
 */
public class ParticipanteDAO {
    
    public boolean insertarParticipante(Participante participante) throws ClassNotFoundException, SQLException {
    String sql = "INSERT INTO participante (correo, nombre_completo, tipo_participante, institucion) "
               + "VALUES (?, ?, ?, ?)";

    try (Connection con = DatabaseConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, participante.getCorreo());
        ps.setString(2, participante.getNombre_completo());
        ps.setString(3, participante.getTipo_participante());
        ps.setString(4, participante.getInstitucion());

        ps.executeUpdate();
        return true;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}
