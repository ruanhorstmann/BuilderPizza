package pattern.builder;


import pattern.domain.Cliente;
import pattern.domain.Pedido;
import pattern.domain.Pizza;

public class PedidoBuilder {
	
	private Pedido pedido;
	
	public PedidoBuilder() {
		this.pedido = new Pedido();
	}
	
	public PedidoBuilder setNumero(String numero) {
		this.pedido.setNumero(numero);
		return this;
	}
	
	public PedidoBuilder setCliente(int codigo, String nome, String telefone) {
		this.pedido.setCliente(new Cliente(codigo, nome, telefone));
		return this;
	}
	
	public PedidoBuilder setPizza(String tamanho, int quantidade, Double valor, String sabor, String borda) {
		this.pedido.addpizza(new Pizza(tamanho, quantidade, valor, sabor, borda));
		return this;
	}
	
	public Pedido builder() {
		return pedido;
	}	
}
