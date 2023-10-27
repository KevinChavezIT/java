package com.krakedev.persitencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persitencia.entidades.Empleado;
import com.krakedev.persitencia.utils.ConexionBDD;

public class AdminEmpleado {

	private static final Logger LOGGER = LogManager.getLogger(AdminEmpleado.class);

	public static void insertar(Empleado empleado) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("INSERTANDO EMPLEADO >>>>" + empleado);

		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into empleado (codigo_empleado, nombre, fecha, hora)" + "values(?,?,?,?)");

			ps.setInt(1, empleado.getCodigo());
			ps.setString(2, empleado.getNombre());
			ps.setDate(3, new java.sql.Date(empleado.getFecha().getTime()));
			ps.setTime(4, new Time(empleado.getHora().getTime()));
			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al INSERTAR", e);
			throw new Exception("Error al INSERTAR");

		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {

				LOGGER.error("Error con la BDD", e);
				throw new Exception("Error con la BDD");
			}
		}

	}

	public static void actualizar(Empleado empleado) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("ACTUALIZANDO EMPLEADO >>>>" + empleado);
		try {
			con = ConexionBDD.conectar();

			ps = con.prepareStatement("update empleado " + "set nombre = ?, " + "fecha = ?, " + "hora = ? "
					+ "where codigo_empleado = ?");

			ps.setString(1, empleado.getNombre());
			ps.setDate(2, new java.sql.Date(empleado.getFecha().getTime()));
			ps.setTime(3, new Time(empleado.getHora().getTime()));
			ps.setInt(4, empleado.getCodigo());

			ps.executeUpdate();
		} catch (Exception e) {

			LOGGER.error("Error al ACTUALIZAR", e);
			throw new Exception("Error al ACTUALIZAR");

		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {

				LOGGER.error("Error con la BDD", e);
				throw new Exception("Error con la BDD");
			}

		}
	}

	public static void eliminar(int codigo_empleado) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("ELIMINANDO EMPLEADO CON CODIGO: >>>>" + codigo_empleado);
		try {
			con = ConexionBDD.conectar();

			ps = con.prepareStatement("delete from empleado where codigo_empleado = ?");
			ps.setInt(1, codigo_empleado);
			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al ELIMINAR", e);
			throw new Exception("Error al ELIMINAR");

		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {

				LOGGER.error("Error con la BDD", e);
				throw new Exception("Error con la BDD");
			}
		}
	}

}
