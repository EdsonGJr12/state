import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		//Craindo um pedido de 100 reais
		Pedido pedido = new Pedido(BigDecimal.valueOf(100));
		
		pedido.realizarPagamento(FormaPagamento.CARTAO);
		
		pedido.emitirNotaFiscal();
		
		pedido.enviarParaEntrega();
		

	}

}
