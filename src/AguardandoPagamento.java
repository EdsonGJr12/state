
public class AguardandoPagamento implements State {

	@Override
	public void criarPedido(Pedido pedido) {
		throw new RuntimeException("Pedido já foi criado");
	}

	/**
	 * OBS: Caso pagamento fosse recusado, poderia incluir um outro estado para o
	 * pedido, como: PagamentoRecusado e tratar um fluxo alternativo para pagamentos
	 * recusados. Foi assumido que o pagamento é sempre realizado com sucesso
	 */
	@Override
	public void realizarPagamento(Pedido pedido, FormaPagamento formaPagamento) {

		if (formaPagamento.equals(FormaPagamento.CARTAO)) {
			System.out.println("Solicita autorização com a bandeira do cartão");
			System.out.println("Pagamento autorizado");
		} else {
			System.out.println("Pagamento realizado com sucesso");
		}
		
		System.out.println();
		
		pedido.setFormaPagamento(formaPagamento);
		pedido.setStatus(new PagamentoRealizado());
	}

	@Override
	public void emitirNotaFiscal(Pedido pedido) {
		throw new RuntimeException("Pedido deve ser pago para emitir nota fiscal");
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		throw new RuntimeException("Pedido só pode ser enviado após emitir nota fiscal");
	}
}
