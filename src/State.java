
public interface State {
	
	void criarPedido(Pedido pedido);
	void realizarPagamento(Pedido pedido, FormaPagamento formaPagamento);
	void emitirNotaFiscal(Pedido pedido);
	void enviarParaEntrega(Pedido pedido);
}
