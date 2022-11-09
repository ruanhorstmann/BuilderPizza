package pattern.domain;


public class Pizza {

	private String tamanho;
	private int quantidade;
	private String sabor;
	private boolean borda;
	private Double valor;
	
	public Pizza() {
	}

	public boolean isBorda() {
		return borda;
	}

	public void setBorda(boolean borda) {
		this.borda = borda;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Pizza(String tamanho, int quantidade, Double valor, String sabor, boolean borda) {
		super();
		this.tamanho = tamanho;
		this.quantidade = quantidade;
		this.valor = valor;
		this.sabor = sabor;
		this.borda = borda;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	
	}

	public void setValor(Double valor) {
		if(tamanho == "p"){
			this.valor = valor * 0.9;
	   }
	   else if (tamanho == "m" || tamanho == "M"){
		   this.valor = valor;
	   }
	   else if (tamanho == "g" || tamanho == "G"){
		   this.valor = valor * 1.1;
	   }

	}
	
	@Override
	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("Tamanho: " + tamanho + "|");
		detalhes.append(" Quantidade: " + quantidade + "|");
		detalhes.append("Sabor: " + sabor + "|");
		detalhes.append("Borda: " + borda + "|");
		detalhes.append(" Valor: " + valor.toString());
		return detalhes.toString();
	}
}