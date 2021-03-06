package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlers.*;
import entities.Persona;
import entities.TipoElemento;

/**
 * Servlet implementation class realizaAltaTipo
 */
@WebServlet({ "/realizaAltaTipo", "/realizaaltaTipo" })
public class realizaAltaTipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public realizaAltaTipo() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			TipoElemento tipo = new TipoElemento();
			CtrlABMCTipoElemento tiposs = new CtrlABMCTipoElemento();
			String desc = request.getParameter("desctxt").toString();
			String cant = request.getParameter("canttxt").toString();
			String diasmax = request.getParameter("diasmaxtxt").toString();
			boolean solo = false;
			if(request.getParameter("soloenc")!=null){
			solo = true;
			}
			int cantidad = Integer.parseInt(cant);
			int diasm = Integer.parseInt(diasmax);
			tipo.setDescTipo(desc);
			tipo.setCantdiasMax(cantidad);
			tipo.setSoloEnc(solo);
			tipo.setDiasmaxanti(diasm);
			tiposs.Add(tipo);
			request.getRequestDispatcher("WEB-INF/lib/ABMTipoElemento.jsp").forward(request, response);
		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('"+ e.getMessage()+"');");
		    out.println("location='login.html';");
		    out.println("</script>");
		}
	}
	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
