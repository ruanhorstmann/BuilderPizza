package pattern.domain;


public class Pizza {

	private String tamanho;
	private int quantidade;
	private String sabor;
	private String borda;
	private Double valor;



	public Pizza(String tamanho, int quantidade, Double valor, String sabor, String borda) {
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
		
		if(tamanho == "p"|| tamanho == "P"){
			valor = valor * 0.8;
	   }
	   else if (tamanho == "m" || tamanho == "M"){
		   
	   }
	   else if (tamanho == "g" || tamanho == "G"){
		   valor = valor * 1.3;
	   }
	   return valor;
	
	}

	public String isBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
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