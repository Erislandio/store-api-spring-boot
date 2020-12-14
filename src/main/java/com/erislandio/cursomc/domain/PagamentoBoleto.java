package com.erislandio.cursomc.domain;

import java.util.Date;

import com.erislandio.cursomc.domain.enums.TipoEstadoPagamento;

public class PagamentoBoleto extends Pagamento {
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoBoleto() {
		
	}

	public PagamentoBoleto(Integer id, TipoEstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
