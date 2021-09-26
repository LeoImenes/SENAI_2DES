package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.stream.Collectors;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/cliente")
public class cliente extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		JSONArray arr = new JSONArray();
		
		BufferedReader  br = new BufferedReader(new FileReader("C:/Users/leona/OneDrive/Área de Trabalho/teste/vendedor.csv"));
		String linha = "";
		while((linha = br.readLine())!=null) {
			JSONObject cli = new JSONObject();
			String[] cliente = linha.split(";");
			cli.put("id", cliente[0]);
			cli.put("nome", cliente[1]);
			arr.put(cli);
			
		}
		br.close();
		
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String data = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
		
		JSONObject cli = new JSONObject();
		
		cli.put("id", 3);
		
		
		
		PrintWriter pw = resp.getWriter();
		pw.write(cli.toString());
	}

}
