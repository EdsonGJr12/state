import java.math.BigDecimal;

public class Pedido {
	
	private String numeroPedido;
	private BigDecimal valor;
	private State status;
	private FormaPagamento formaPagamento;
	
	public Pedido(BigDecimal valor) {
		this.setValor(valor);
		this.status = new PedidoCriado();
		this.status.criarPedido(this);
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public void setStatus(State status) {
		this.status = status;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	
	void realizarPagamento(FormaPagamento formaPagamento) {
		this.status.realizarPagamento(this, formaPagamento);
	}
	
	void emitirNotaFiscal() {
		this.status.emitirNotaFiscal(this);
	}

	public void enviarParaEntrega() {
		this.status.enviarParaEntrega(this);
	}
}
