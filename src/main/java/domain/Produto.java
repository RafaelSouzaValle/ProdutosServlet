package domain;

public class Produto {

	private String cod;
	private String descricao;
	private double valor;
	
	public Produto(String cod, String descricao, double valor) {
		this.cod = cod;
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "insert into PRODUTOS (cod, descricao, valor)\n"
				+ "VALUES (" 
				+ cod + "," 
				+ descricao + "," 
				+ valor + ")";
	}
	
	
}
