package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"@prueba1.2");
			System.out.println("CONEXION EXITOSA");

			ps = connection.prepareStatement(
					"insert into empleado (codigo_empleado, nombre, fecha, hora)"
							+ "values(?,?,?,?)");

			ps.setInt(1, 777);
			ps.setString(2, "siuuuuuuuuu");
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2023/10/26 22:31:10";

			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				// crea un java.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(3, fechaSQL);
				ps.setTime(4, timeSQL);

				ps.executeUpdate();
				System.out.println("EJECUTA INSERT");

			} catch (ParseException e) {

				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
