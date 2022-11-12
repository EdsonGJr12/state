import java.util.UUID;

public class PedidoCriado implements State {

	@Override
	public void criarPedido(Pedido pedido) {
		if (pedido.getNumeroPedido() == null) {
			pedido.setNumeroPedido(UUID.randomUUID().toString());
			pedido.setStatus(new AguardandoPagamento());
			System.out.println(String.format("Pedido %s criado", pedido.getNumeroPedido()));
			System.out.println();
		} else {
			throw new RuntimeException("Status atual inválido para realizar pedido");
		}
	}

	@Override
	public void realizarPagamento(Pedido pedido, FormaPagamento formaPagamento) {
		throw new RuntimeException("Pedido deve estar criado para realizar o pagamento");
		
	}

	@Override
	public void emitirNotaFiscal(Pedido pedido) {
		throw new RuntimeException("Pedido deve estar criado para imprimir nota fiscarl");
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		throw new RuntimeException("Operação não permitida");
	}
}
