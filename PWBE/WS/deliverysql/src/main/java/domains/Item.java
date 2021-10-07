package domains;

import org.json.JSONException;
import org.json.JSONObject;

public class Item {
	private Pedido pedido;
	private Produto produto;
	private int qtde;
	
	public Item() {
		
	}

	public Item(Pedido pedido, Produto produto, int qtde) {
		
		this.pedido = pedido;
		this.produto = produto;
		this.qtde = qtde;
	}
	public Item(String idPedido, String idProduto, String qtde) {
		
		this.pedido = new Pedido(idPedido);
		this.produto =new Produto(idProduto);
		this.qtde = Integer.valueOf(qtde);
	}

	@Override
	public String toString() {
		return  pedido.getIdPedido() + "\t" + produto.getIdProduto() + "\t" + qtde + "\n";
	}
	public JSONObject toJSON() {
		JSONObject json = new JSONObject();
		try {
			json.put("pedido", pedido.toJSON());
			json.put("produto", produto.toJSON());
			json.put("quantidade", qtde);
		} catch (JSONException e) {
			System.out.println("Erro ao converter JSON: " + e);
		}
		return json;
	}
	
	
	
}
