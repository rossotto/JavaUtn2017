package servlet;

import java.io.IOException;

import javax.print.attribute.standard.DocumentName;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlers.CtrlABMCElemento;
import controlers.CtrlABMCTipoElemento;
import entities.Elemento;
import entities.TipoElemento;

/**
 * Servlet implementation class realizaAltaElemento
 */
@WebServlet("/realizaAltaElemento")
public class realizaAltaElemento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public realizaAltaElemento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Elemento e = new Elemento();
			TipoElemento te = new TipoElemento();
			CtrlABMCElemento ctrle = new CtrlABMCElemento();
			CtrlABMCTipoElemento ctrlte = new CtrlABMCTipoElemento();
			String desctipo = (request.getParameter("tipoElemento").toString());
			
			if(desctipo.equals("Teatro"))
			{
				te.setIdTipo(1);
			}
			else if ( desctipo.equals("Bar"))
			{
				te.setIdTipo(2);
			}
			else
			{
				te.setIdTipo(3);
			}
			
			te = ctrlte.getByID(te);
			e.setCapacidad(Integer.parseInt(request.getParameter("capactxt").toString()));
			e.setDescripcion(request.getParameter("desctxt").toString());
			e.setUbicacion(request.getParameter("ubictxt").toString());
			e.setTipo(te);
			ctrle.Add(e);
			
			
//			Elemento tipo = new Elemento();
//			CtrlABMCElemento tiposs = new CtrlABMCElemento();
//			CtrlABMCTipoElemento tipos2 = new CtrlABMCTipoElemento();
//			String ubi = request.getParameter("ubictxt").toString();
//			String desc = request.getParameter("desctxt").toString();
//			String cap = request.getParameter("capactxt").toString();
//			int capacidad = Integer.parseInt(cap);
//			tipo.setDescripcion(desc);
//			tipo.setUbicacion(ubi);
//			tipo.setCapacidad(capacidad);
//			TipoElemento tipoElemento = new TipoElemento();
//			TipoElemento tipoElemento2 = new TipoElemento();
//			tipoElemento.setIdTipo(4);
//			tipoElemento2 = tipos2.buscarTipoElemento(tipoElemento);
//			tipo.setTipo(tipoElemento2);
//			tiposs.Add(tipo);
			request.getRequestDispatcher("WEB-INF/lib/ABMElemento.jsp").forward(request, response);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
