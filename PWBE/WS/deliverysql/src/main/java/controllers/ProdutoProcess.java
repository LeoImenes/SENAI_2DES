package controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.ProdutoDAO;
import domains.Produto;

public class ProdutoProcess {
	
	public static ArrayList<Produto> produtos;
	public static ProdutoDAO pd;
	
	public static void carregaDados() throws SQLException {
		
		pd = new ProdutoDAO();
		produtos = pd.readAll();
	}

}
