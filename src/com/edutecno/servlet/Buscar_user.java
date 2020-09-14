package com.edutecno.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edutecno.procesaconexion.Conexion_name;


@WebServlet(name = "busqueda_User", urlPatterns = {"/busqueda_User"})
public class Buscar_user extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/jsp;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
      
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet srvTest2</title>");            
            out.println("</head>");
            out.println("<body>");
            Conexion_name cn=new Conexion_name();
            String user=request.getParameter("q");
          try{
            cn.Conectar();
            String sql="select * from usuarios where nombre_usuario like '"+user+"%';";
            Conexion_name.st=Conexion_name.conec.createStatement();
            Conexion_name.rt=Conexion_name.st.executeQuery(sql);
       
            while (Conexion_name.rt.next()){
               
                out.println("<p> Nombre de usuario: "+Conexion_name.rt.getString("nombre_usuario")+"</p>");
            }
          }catch(Exception e){
            out.print(e.toString());
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
