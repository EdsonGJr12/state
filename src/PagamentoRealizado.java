
public class PagamentoRealizado implements State {

	@Override
	public void criarPedido(Pedido pedido) {
		throw new RuntimeException("Pedido já criado");
		
	}

	@Override
	public void realizarPagamento(Pedido pedido, FormaPagamento formaPagamento) {
		throw new RuntimeException("Pagamento já realizado");
	}

	@Override
	public void emitirNotaFiscal(Pedido pedido) {
		System.out.println("Se comunicando com a sefaz...");
		System.out.println("Recebendo da sefaz a NFe");
		pedido.setStatus(new NotaFiscalEmitida());
		System.out.println(String.format("Nota fiscal do pedido %s emitida", pedido.getNumeroPedido()));
		System.out.println();
	}

	@Override
	public void enviarParaEntrega(Pedido pedido) {
		throw new RuntimeException("Envio só pode ser realizado após emissão da NFe");
		
	}

	 

	 

}
