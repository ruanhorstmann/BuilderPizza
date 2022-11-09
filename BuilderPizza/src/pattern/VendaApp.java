package pattern;

import java.math.BigDecimal;

import pattern.builder.PedidoBuilder;
import pattern.domain.Pedido;

public class VendaApp {

	public static void main(String[] args) {


		
		Pedido pedido = new PedidoBuilder()
				.setNumero("1234567890")
				.setCliente(100, "Ricardo", "99988-0000")
				.setProduto("Notebook", 1, new BigDecimal(8000.00))
				.setProduto("iPhone", 2, new BigDecimal(5000.00))
				.builder();

		System.out.println(pedido);

	}

}
