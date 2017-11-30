package controlers;

import java.io.Console;
import java.sql.Date;
import java.util.ArrayList;

import data.DataReserva;
import entities.Reserva;
import entities.Elemento;
import entities.Persona;

public class CtrlABMCReserva {
	
	private DataReserva datar;
	public CtrlABMCReserva()
	{
		datar = new DataReserva();
	}
	
	
	public String addReserva(Reserva r, int diasmaxres, int diasmaxanti){
		String message = "";
		Date fechaFin = r.getFechaFin();
		Date fechaIni = r.getFechaInicio();
		java.util.Date fechaHoy = new java.util.Date();
		System.out.println(diasmaxres);
		System.out.println(diasmaxanti);
		int diasreserva =(int)((fechaFin.getTime()-fechaIni.getTime())/86400000);
		System.out.println(diasreserva);
		int diasanticipo =(int)((fechaIni.getTime()-fechaHoy.getTime())/86400000);
		System.out.println(diasanticipo);
		int band = 0;
		if(fechaIni.after(fechaFin) || fechaIni.before(fechaHoy)){
			message = "Ingrese nuevamente las fechas por fchas validas. ";
			System.out.println("Ingrese nuevamente las fechas por fechas validas");
		}
		else{
			if(diasmaxres >= diasreserva && diasmaxanti >= diasanticipo){
				System.out.println("Correcto");
				ArrayList<Reserva> reservas = new ArrayList<Reserva>();
				reservas = datar.getAllByIdElem(r);
				int flag = 0;
				for (Reserva res : reservas) {
					if(r.getFechaInicio().after(res.getFechaFin()) || r.getFechaFin().before(res.getFechaInicio()))
					{
						datar.add(r);
						message = "Reserva realizada";
					}
					else
					{
						message = "No se puede realizar la reserva porque ya esta en uso en esa fecha. ";
					}
				}
				
			}
			else if (diasmaxres < diasreserva){
				System.out.println("sobre pasa los dias de reserva maximos");
				message = message + "Sobre pasa los dias  de reserva maximos";
				band = 1;
			}
			else if (diasmaxanti < diasanticipo){
				System.out.println("sobre pasa los dias de anticipacion");
				if(band==0) {
					message = message + "Sobre pasa los dias  de anticipacion";
				}
				else {
					message = message + "Sobre pasa los dias  de anticipacion y los dias reserva max";
				}
			}
		}
		return message;
	}
	
	public ArrayList<Reserva> getAll()
	{
		return datar.getAll();
	}
	public ArrayList<Reserva> getAll(Elemento e)
	{
		return datar.getAll(e);
	}
	
	public void delete(Reserva r)
	{
		datar.delete(r);
	}
	
	public ArrayList<Reserva> getAll(Persona per)
	{
		return datar.getAll(per);
	}
	
//	public ArrayList<Reserva> getAll(Persona per){
//		ArrayList<Reserva> resers = datar.getAll();
//		ArrayList<Reserva> reserPer = new ArrayList<Reserva>();
//		for (Reserva reserva : resers) {
//			if(reserva.getPersona().getIdPersona() == per.getIdPersona())
//			{
//				reserPer.add(reserva);
//			}
//		}
//		return reserPer;
//	}
}
