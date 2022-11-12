
public class PedidoEnviadoEntrega implements State {

	@Override
	public void criarPedido(Pedido pedido) {
		throw new RuntimeException("Operação não permitida");

	}

	@Override
	public void realizarPagamento(Pedido pedido, FormaPagamento formaPagamento) {
		throw new RuntimeException("Operação não permitida");

	}

	@Override
	public void emitirNotaFiscal(Pedido pedido) {
		throw new RuntimeException("Operação não permitida");

	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		throw new RuntimeException("Operação não permitida");
	}

}
