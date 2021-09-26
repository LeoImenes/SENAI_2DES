package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import controllers.PedidoProcess;
import domains.Pedido;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pedidos")
public class PedidoHttp extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Configura��es
		PrintWriter out = resp.getWriter();// Configurar a saida de resto resp
		resp.setContentType("application/json"); // Configura a resposta no formato JSON
		resp.setCharacterEncoding("utf8");// Configura o charset
		
		// Lendo os dados do BD "CSV"
		PedidoProcess.abrir();

		//Recebendo dados por Par�metros
		String id = req.getParameter("id"); // Recebe um "par�metro" via URI "?id=2"
		if (id != null) {// Verifica se chegou o par�metro "id"
			if (PedidoProcess.pedidos.contains(new Pedido(id))) {
				int indice = PedidoProcess.pedidos.indexOf(new Pedido(id));// Obtem o indice
				out.print(PedidoProcess.pedidos.get(indice).toJSON());
			} else {
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
				//out.print("{ \"erro\": \"Id n�o encontrado\" }");
			}
		} else {
			JSONArray vetor = new JSONArray(); // Cria um vetor para armazenar cada obj json
			for (Pedido p : PedidoProcess.pedidos) {
				vetor.put(p.toJSON());// Preenche o vetor
			}
			out.print(vetor);// Mostra o vetor
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Configura��es
		PrintWriter out = resp.getWriter();// Configurar a saida de resto resp
		resp.setContentType("application/json"); // Configura a resposta no formato JSON
		resp.setCharacterEncoding("utf8");// Configura o charset
		// Lendo os dados do BD "CSV"
		PedidoProcess.abrir();

		String body = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
		JSONObject jin = new JSONObject();
		
		Pedido p = new Pedido(null,null,null);
		PedidoProcess.pedidos.add(p);
	}

}