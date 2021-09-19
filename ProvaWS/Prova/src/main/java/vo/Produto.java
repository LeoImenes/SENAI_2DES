package vo;

import java.util.Objects;

public class Produto {
	private int cod;
	private String nome;
	private float preco;
	private int qtde;
	
	
	public Produto() {}
	
	public Produto(int cod) {
		this.cod = cod;
	}
	
	public Produto(int cod, String nome, float preco, int qtde) {
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
		
		
	}

	public Produto(String cod, String nome, String preco, String qtde) {
		this.cod = Integer.parseInt(cod);
		this.nome = nome;
		this.preco = Float.parseFloat(preco);
		this.qtde = Integer.parseInt(qtde);
		
		
	}

	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public String toString() {
		return cod + "\t" + nome + "\t" + preco + "\t"+qtde+ "\n";
	}
	
	public String toCsv() {
		return cod + ";" + nome + ";" + preco + ";" + qtde + "\n";
	}
	
	public String toHtml() {
		return "<tr><td>" + cod + "</td><td>" + nome + "</td><td>" + preco + "</td><td>" + qtde + "</td><td>"+ "<button onclick='excluir(this)'>Excluir item</button><button onclick='editar(this)'>Editar</button>" + "</td></tr><br>";
	}
}
 