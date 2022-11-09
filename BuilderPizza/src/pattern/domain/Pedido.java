package pattern.domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private String numero;
	private Cliente cliente;
	private List<Pizza> pizzas;

	
	public Pedido() {
		pizzas = new ArrayList<Pizza>();
	}
	
	public float getValorTotal() {
		float total = 0;
		for (Pizza pizza : pizzas) {
			float qtde = pizza.getQuantidade();
			float valor = pizza.getValor();
			float vTotal = valor * qtde;
			total = vTotal;
		}
		return total;
	}
	
	public int getTotalDepizzas() {
		int total = 0;
		for (Pizza pizza : pizzas) {
			total += pizza.getQuantidade();
		}
		return total;
	}
	
	public void addpizza(Pizza pizza) {
		pizzas.add(pizza);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Pizza> getpizzas() {
		return pizzas;
	}

	public void setpizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	@Override
	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("**************************************\n");
		detalhes.append("        Pedido " + numero  + "\n");
		detalhes.append("**************************************\n");
		detalhes.append(cliente  + "\n");		
		for (Pizza pizza : pizzas) {
			detalhes.append(pizza  + "\n");
		}
		detalhes.append("Quantidade de pizzas: " + getTotalDepizzas() + "\n");
		detalhes.append("Total: " + getValorTotal() + "\n");
		return detalhes.toString();
	}
}