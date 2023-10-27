package com.krakedev.persitencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persitencia.entidades.Transacciones;
import com.krakedev.persitencia.utils.ConexionBDD;

public class AdminTransacciones {

	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Transacciones transaccion) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("INSERTANDO TRANSACCION >>>>" + transaccion);

		try {
			// abrir conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement("insert into transacciones (codigo, numero_cuenta, monto, tipo, fecha, hora)"
					+ "values(?,?,?,?,?,?)");

			ps.setInt(1, transaccion.getCodigo());
			ps.setString(2, transaccion.getNumCuenta());
			ps.setBigDecimal(3, transaccion.getMonto());
			ps.setString(4, transaccion.getTipo());
			ps.setDate(5, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(6, new Time(transaccion.getHora().getTime()));
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

	public static void actualizar(Transacciones transaccion) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("ACTUALIZANDO TRANSACCION >>>>" + transaccion);
		try {
			con = ConexionBDD.conectar();

			ps = con.prepareStatement("update transacciones " + "set numero_cuenta = ?, " + "monto = ?, " + "tipo = ?, "
					+ "fecha = ?, " + "hora = ? " + "where codigo = ?");

			ps.setString(1, transaccion.getNumCuenta());
			ps.setBigDecimal(2, transaccion.getMonto());
			ps.setString(3, transaccion.getTipo());
			ps.setDate(4, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(5, new Time(transaccion.getHora().getTime()));
			ps.setInt(6, transaccion.getCodigo());

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

	public static void eliminar(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("ELIMINANDO TRANSACCION CON EL CODIGO: >>>>" + codigo);
		try {
			con = ConexionBDD.conectar();

			ps = con.prepareStatement("delete from transacciones where codigo = ?");
			ps.setInt(1, codigo);
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
