package com.krakedev.persitencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//SYSOUT SOLO SE VA PODER USAR EN LOS TEST//////////////////////////

public class Convertidor {

	private static final String FORMATO_FEHCA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "hh:mm:ss";
	
	private static final Logger LOGGER= LogManager.getLogger(Convertidor.class);

	public static Date convertirFecha(String fechaStr) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FEHCA);
		Date fechaDate = null;
		try {
			LOGGER.trace("CONVIRTIENDO FECHA"+fechaStr);
			fechaDate = sdf.parse(fechaStr);
			LOGGER.trace("FECHA CONVERTIDA"+fechaStr);
		} catch (ParseException e) {
			
			LOGGER.error("La fecha no tiene el formato correcto"+fechaStr+e);
			throw new Exception("La fecha no tiene el formato correcto"+fechaStr);
		}
		return fechaDate;
	}

	public static Date convertirHora(String horaStr) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		Date horaDate = null;
		try {
			horaDate = sdf.parse(horaStr);
		} catch (ParseException e) {

			LOGGER.error("La hora no tiene el formato correcto"+horaStr+e);
			throw new Exception("La hora no tiene el formato correcto"+horaStr);
		}
		return horaDate;
	}
}
