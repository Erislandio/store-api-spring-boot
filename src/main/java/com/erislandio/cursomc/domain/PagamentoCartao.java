package com.erislandio.cursomc.domain;

import com.erislandio.cursomc.domain.enums.TipoEstadoPagamento;

public class PagamentoCartao extends Pagamento {
	private Integer numeroParcelas;

	public PagamentoCartao() {
	}

	public PagamentoCartao(Integer id, TipoEstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
		super(id, estado, pedido);
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	
		
}