package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoEstudante implements Desconto{

	@Override
	public String getDescricao() {
		return "Estudante";
	}
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {

		return precoOriginal.multiply(new BigDecimal("0.5"));
	}
	
}
