package pattern;

import java.math.BigDecimal;

import pattern.builder.PedidoBuilder;
import pattern.domain.Pedido;

public class VendaApp {

	public static void main(String[] args) {


		
		Pedido pedido = new PedidoBuilder()
				.setNumero("1234567890")
				.setCliente(100, "Ricardo", "99988-0000")
				.setPizzas("M", 1, "Frango", "N",)
				.builder();

		System.out.println(pedido);

	}

}
